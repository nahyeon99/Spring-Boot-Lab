package hello.springtx.apply;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class InternalCallV2Test {

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
	void externalCallV2() {
		callService.external();
	}

	@TestConfiguration
	static class InternalCallV1TestConfig {
		@Bean
		CallService callService() {
			return new CallService(internalService());
		}

		@Bean
		InternalService internalService() {
			return new InternalService();
		}
	}

	@Slf4j
	@RequiredArgsConstructor
	static class CallService {

		private final InternalService internalService;

		public void external() {
			log.info("call external");
			this.printTxInfo();

			internalService.internal();
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

	static class InternalService {

		@Transactional
		public void internal() {
			log.info("call internal");
			printTxInfo();
		}

		@Transactional
		protected void internal_v2() {
			log.info("call internal v2 : non tx");
			printTxInfo();
		}

		private void printTxInfo() {
			boolean txActive = TransactionSynchronizationManager.isActualTransactionActive();
			log.info("tx active={}", txActive);
		}
	}
}
