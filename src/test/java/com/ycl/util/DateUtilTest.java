package com.ycl.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd");
		Calendar instance = Calendar.getInstance();
		instance.set(2010, 0, 1);
		for (int i = 0; i < 100; i++) {
			Date Date = DateUtil.RandomDate(instance.getTime(),new Date());
			System.out.println(Format.format(Date));
		}
		
	}

}
