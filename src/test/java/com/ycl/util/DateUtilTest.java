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
	
	
	
	@Test
	public void gitInitMonth() {
		SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		//Format.format(date);
		Date gitInitMonth = DateUtil.gitInitMonth(date);
		System.out.println(Format.format(gitInitMonth));
	}
	
	
	
	@Test
	public void gitEndMonth() {
		Calendar instance = Calendar.getInstance();
		instance.set(2019, 2, 20);
		SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date endMonth = DateUtil.gitEndMonth(instance.getTime());
		System.out.println(Format.format(endMonth));
	}
	
	
	@Test
	public void gitAge() {
		Calendar instance = Calendar.getInstance();
		instance.set(1999, 2, 28);
		//SimpleDateFormat Format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int gitAge = DateUtil.gitAge(instance.getTime());
		System.out.println(gitAge);
	}
	
	
	@Test
	public void getDateByBefore() {
		Date dateByBefore = DateUtil.getDateByBefore();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(dateByBefore));
	}

}
