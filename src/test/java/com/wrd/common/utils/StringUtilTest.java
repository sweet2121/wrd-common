package com.wrd.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	
	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(100);
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100000; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}
	@Test
	public void testGetPlaceholderValue(){
		String str="";
		//String s=StringUtil.getPlaceholderValue(str, regex);
	}
	@Test
	public void testUrl(){
		boolean b = StringUtil.isHttpUrl("123");
		System.err.println(b);
		boolean c = StringUtil.isHttpUrl("https://www.baidu.com/");
		System.out.println(c);
	}
}
