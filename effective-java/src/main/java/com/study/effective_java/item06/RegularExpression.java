package com.study.effective_java.item06;

import java.util.regex.Pattern;

public class RegularExpression {

	private static final Pattern SPLIT_PATTERN = Pattern.compile(";;;");

	public static void main(String[] args) {
		long start = System.nanoTime();
		for (int j = 0; j < 10_000; j++) {
			String name = "nahyeon;;;java";

			// Case1 한 캐릭터로 split 하는 경우 : 미리 컴파일해놓고 쓰는 패턴보다, 성능 차이가 거의 없거나 그냥 split 이 더 빠를 수도 있다.
			// split 메서드에서 한 캐릭터의 string은 FastPath 가 있기 때문에, 굳이 컴파일하지 않고도 좀 더 빠르게 처리할 수 있다.
			name.split(";");

			// Case2 여러 캐릭터로 split 하는 경우 : 미리 컴파일해놓고 쓰는 것이 더 빠르다.
			// FastPath 를 이용하지 못하기 때문에, 패턴을 재사용하는 것이 빠르다.
			name.split(";;;");

			SPLIT_PATTERN.split(name);
		}
		System.out.println(System.nanoTime() - start);
	}
}
