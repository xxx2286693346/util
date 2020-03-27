package com.ycl.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testHasValue() {
		boolean hasValue = CollectionUtil.hasValue(new ArrayList<Object>());
		System.out.println(hasValue);
	}

}
