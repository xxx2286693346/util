package com.ycl.util;

import java.util.Collection;
import java.util.List;

//判断集合是否有值
public class CollectionUtil {
	/**
	 * 
	    * @Title: hasValue
	    * @Description: TODO(判断集合是否为空)
	    * @param @param list
	    * @param @return    参数
	    * @return boolean    返回类型
	    * @throws
	 */
	public static boolean hasValue(Collection<?> con) {
		
		return con==null || con.isEmpty();
	}
}
