package com.wrd.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	
	@Test
	public void testRandomDate() {
		//获取日历类
		Calendar c=Calendar.getInstance();
		//为日历设置
		c.set(2010, 0, 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(dFormat.format(date));
		
	}
	//月初
	@Test
	public void testInitMonth(){
		
		//Date date = DateUtil.getInitMonth(new Date());
		Date date = DateUtil.getInitMonth(new Date(99999999));
		SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(dFormat.format(date));
	}
	//月末
	@Test
	public void testEndMonth(){
		Date date = DateUtil.getEndMonth(new Date());
		SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(dFormat.format(date));
	}
}
