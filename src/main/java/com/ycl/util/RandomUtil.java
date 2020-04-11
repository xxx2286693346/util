package com.ycl.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {
	/**
	 * 
	    * @Title: random
	    * @Description: TODO(随机数的方法)
	    * @param @param min
	    * @param @param max
	    * @param @return    参数
	    * @return int    返回类型
	    * @throws
	 */
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random = new Random();
		/* random.nextInt(bound)
		 * 方法   随机生成一个int  类型的数值
		 * 该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
		 *  
		 *  */
		int zhi=random.nextInt(max-min+1)+min;
	//System.out.println(zhi);
	return zhi;
	//TODO 实现代码
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		//用来过滤数据
		HashSet<Integer> hashSet = new HashSet<Integer>();
		//如果set中的元素个数不等于长度就一直放
		while (hashSet.size()!=subs) {
			hashSet.add(random(min, max));
		}
		int[] x = new int[subs];
		int i =0;
		for (Integer integer : hashSet) {
			x[i]=integer;
			i++;
		}
		return x;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789qazwsxedcrfvtgbyhnujmiklopQAZWSXEDCRFVTGBYHNUJMIKOLP";
		return str.charAt(random(0, str.length()-1));
	//TODO 实现代码
	}
	
	//返回一个1-9之间的传入多少生成多少个随机数
	public static String randomNumber(int length){
		String str = "1234567890";
		String result="";
		for (int i = 0; i <length; i++) {
			result+= str.charAt(random(0, str.length()-1));
		}
		return result;
	//TODO 实现代码
	}
	
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		StringBuffer str =  new StringBuffer();
		for (int i = 0; i < length; i++) {
			str.append(randomCharacter());
		}
		return str.toString();
	//TODO 实现代码
	}
}
