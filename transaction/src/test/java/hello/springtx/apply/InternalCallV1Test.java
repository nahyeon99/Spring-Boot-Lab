package hello.springtx.apply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class InternalCallV1Test {

	@Autowired
	CallService callService;

	@Test
	void printProxy() {
		log.info("callService class={}", callService.getClass());
	}

	@Test
	void internalCall() {
		callService.internal();
	}

	@Test
	void externalCall() {
		callService.external();
	}

	@TestConfiguration
	static class InternalCallV1TestConfig {
		@Bean
		CallService callService() {
			return new CallService();
		}
	}

	@Slf4j
	static class CallService {
		public void external() {
			log.info("call external");
			this.printTxInfo();

			// 자기 자신의 인스턴스를 호출한다. -> 실제 대상 객체의 인스턴스를 가리킨다.
			// 결과적으로 내부 호출은 트랜잭션 프록시를 거치지 않는다. 따라서 트랜잭션을 적용할 수 없다.
			this.internal();
		}

		@Transactional
		public void internal() {
			log.info("call internal");
			printTxInfo();
		}

		private void printTxInfo() {
			boolean txActive = TransactionSynchronizationManager.isActualTransactionActive();
			log.info("tx active={}", txActive);
		}
	}
}
