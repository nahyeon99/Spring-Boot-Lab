package hello.springtx.propagation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class MemberServiceTest {

	@Autowired
	MemberService memberService;

	@Autowired
	MemberRepository memberRepository;

	@Autowired
	LogRepository logRepository;

	/**
	 * MemberService @Transactional : OFF
	 * MemberRepository @Transactional : ON
	 * LogRepository @Transactional : ON
	 */
	@Test
	void outer_TxOff_success() {
		//given
		String username = "outerTxOff_success";

		//when
		memberService.joinV1(username);

		//then: 모든 데이터가 정상 저장된다.
		assertTrue(memberRepository.find(username).isPresent());
		assertTrue(logRepository.find(username).isPresent());
	}
}
