package com.wrd.common.utils;


import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int i = NumberUtil.getPercent(6, 10);
		System.out.println(i);
	}

}
