package com.ycl.util;


import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src = "1";
		boolean hasLength = StringUtil.hasLength(src);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		//String src = " ";
		String src = "";
		boolean hasLength = StringUtil.hasText(src);
		System.out.println(hasLength);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
			

}
