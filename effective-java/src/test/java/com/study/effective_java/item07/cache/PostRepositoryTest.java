package com.study.effective_java.item07.cache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostRepositoryTest {

	@Test
	void cache() throws InterruptedException {
		PostRepository postRepository = new PostRepository();
		CacheKey key1 = new CacheKey(1);
		postRepository.getPostById(key1);

		Assertions.assertFalse(postRepository.getCache().isEmpty());

		key1 = null;
		// TODO: run gc
		System.out.println("run gc");
		System.gc();
		System.out.println("wait");
		Thread.sleep(3000L);

		Assertions.assertTrue(postRepository.getCache().isEmpty());
	}
}