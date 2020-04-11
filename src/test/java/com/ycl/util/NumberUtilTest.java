package com.ycl.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int percent = NumberUtil.getPercent(51, 68);
		System.out.println(percent);
	}

}
