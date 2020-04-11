package com.ycl.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.imageio.stream.IIOByteBuffer;

public class DateUtil {
	/**
	 * 
	    * @Title: RandomDate
	    * @Description: TODO(随机产生一个在starDate到endDate的随机日期)
	    * @param @param starDate
	    * @param @param endDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date RandomDate(Date starDate,Date endDate){
		long time = starDate.getTime();//从1970到starDate日期的毫秒数
		long time2 = endDate.getTime();//从1970到endDate日期的毫秒数
		if(time2<time)
			throw new RuntimeException("开始日期不可以大于结束日期");
		//随机产生一个在time-time2之间的毫秒数
		//Math.random()  产生 一个在0-1之间的小数值
		long t= (long) (Math.random()*(time2-time)+time);
		return new Date(t);
	}
	/**
	 * 
	    * @Title: gitInitMonth
	    * @Description: TODO(返回传入日期的月初)
	    * @param @param staDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date gitInitMonth(Date staDate) {
		//传入2020-3-27返回2020-3-01 0时0分0秒
		//用传入的日期初始化日历类
		Calendar instance = Calendar.getInstance();
		instance.setTime(staDate);
		instance.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		instance.set(Calendar.HOUR_OF_DAY, 0);//设置零小时
		instance.set(Calendar.MINUTE, 0);//设置零分钟
		instance.set(Calendar.SECOND, 0);//设置零秒
		return instance.getTime();
	}
	
	/**
	 * 
	    * @Title: gitEndMonth
	    * @Description: TODO(返回传入日期的月末)
	    * @param @param endDate
	    * @param @return    参数
	    * @return Date    返回类型
	    * @throws
	 */
	public static Date gitEndMonth(Date endDate) {
		//传入2020-3-27返回这个月的月末
		//用传入的日期初始化日历类
		Calendar instance = Calendar.getInstance();
		instance.setTime(endDate);
		instance.add(Calendar.MONTH, 1);//设置当前月份+1
		Date gitInitMonth = DateUtil.gitInitMonth(instance.getTime());
		instance.setTime(gitInitMonth);
		instance.add(Calendar.SECOND, -1);
		return instance.getTime();
	}
	
	/**
	 * 
	    * @Title: gitAge
	    * @Description: TODO(根据出生日期计算年龄)
	    * @param @param ageDate
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	public static int gitAge(Date ageDate) {
		  Calendar c = Calendar.getInstance();//获取日期类
		  int s_year =c.get(Calendar.YEAR);//获取系统的年
		  int s_month =c.get(Calendar.MONTH);//获取系统的月
		  int s_date =c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		/* 
		 * System.out.println(s_month);
		 * System.out.println(s_year);
		 * System.out.println(s_date);
		 */

		  c.setTime(ageDate);//用出生日期初始日历类

		  int a_year = c.get(Calendar.YEAR);//获取出生的年
		  int a_month =c.get(Calendar.MONTH);//获取出生的月
		  int a_date =c.get(Calendar.DAY_OF_MONTH);//获取出生的日
		  
		  //计算年龄
			int age = s_year - a_year;
			//如果系统月份小于b_month
			if(s_month < a_month) {
				 age--; //年龄减少一岁
			 } 
			//如果月份相等，但是系统的天小于出生的天
			if(s_month == a_month &&s_date < a_date) {
				 age--; //年龄减少一岁
			}
		return age;
	}
	
	//返回昨天的时间
	public  static Date getDateByBefore() {
		//用系统时间初始化Calender
		Calendar c = Calendar.getInstance();
		//让系统时间减去1天
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}
}
