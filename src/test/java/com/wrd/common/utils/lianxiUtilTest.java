package com.wrd.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class lianxiUtilTest {

	@Test
	public void testPhone(){
		boolean b = lianxiUtil.isPhone("15713695563");
		System.out.println(b);
	}
	@Test
	public void testEmtail(){
		boolean b = lianxiUtil.isEmail("2345678@qq.com");
		System.out.println(b);
	}
	@Test
	public void testNumber(){
		boolean b = lianxiUtil.isNumber("123.12");
		System.out.println(b);
	}
	@Test
	public void testGetValue(){
		String value = lianxiUtil.getValue("权恩菲三个代表V型尺寸", 2);
		System.out.println(value);
		
	}

}
