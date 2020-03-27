package com.ycl.util;

import java.util.Date;
import java.util.Random;

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
}
