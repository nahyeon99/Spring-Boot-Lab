package hello.springtx.propagation;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@RequiredArgsConstructor
public class LogRepository {

	private final EntityManager em;

	@Transactional
	public void save(Log logMessage) {
		log.info("log 저장");
		em.persist(logMessage);

		if (logMessage.getMessage().contains("로그예외")) {
			log.info("log 저장시 예외 발생");
			throw new RuntimeException("예외 발생");
		}
	}

	public Optional<Log> find(String message) {
		return em.createQuery("select 1 from Log 1 where 1.message = :message", Log.class)
			.setParameter("message", message)
			.getResultList().stream().findAny();
	}
}
