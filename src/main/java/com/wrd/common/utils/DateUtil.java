package com.wrd.common.utils;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期
 * @author: 瑞
 * @date: 2020年2月28日 上午8:57:57
 */

import java.util.Calendar;
import java.util.Date;


public class DateUtil {
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param date -- 最小日期
	 * @param date2 -- 最大日期
	 * @return -- min-max 之间的随机日期
	 * @return: Date
	 */
	public static Date randomDate(Date date,java.util.Date date2){
		//获取最小日期的毫秒数,从1970到min的毫秒数
		long t1 = date.getTime();
		long t2 = date2.getTime();
		if(t1>t2) return null;
		//返回0-1之间的正数
		double d = Math.random();
		long x = (long) (d*(t2-t1+1)+t1);
		
		
		return new Date(x);
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回指定日期的月初
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date){
		//获取日历类
		//获取当前时间的日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//调用日历类的相关方法
		c.set(Calendar.DAY_OF_MONTH, 1);//天
		c.set(Calendar.HOUR_OF_DAY, 0);//小时
		c.set(Calendar.MINUTE, 0);//分钟
		c.set(Calendar.SECOND, 0);//秒
		return c.getTime();
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回指定日期的月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date){
		//获取日历类
		//获取当前时间的日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月份+1，再变成月初-秒
		c.add(Calendar.MONTH, 1);
		//月初日期
		Date date2 = getInitMonth(c.getTime());
		c.setTime(date2);
		
		//减去1秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
}
