package com.wrd.common.utils;

public class lianxiUtil {

	//判断是否是手机号
	public static boolean isPhone(String src){
		
		String reg="^1[3|4|5|7|8]\\d{9}$";
		
		return src.matches(reg);
	}
	//邮箱
	public static boolean isEmail(String src){
		
		String reg="\\w+\\@\\w+\\.\\w+";
		
		return src.matches(reg);
	}
	//判断一个字符串是否是数字 （整数，负数，小数）
	public static boolean isNumber(String src){
		
		String reg="^(-)?[0-9]+(\\.[0-9]+)?$";
		
		return src.matches(reg);
	}
	public static String getValue(String str,int start){
		
		String s1=str.substring(4);
		
		System.out.println(s1);
		String s2="";
		for (int i = 0; i < s1.length(); i++) {
			//str=str.replace(String
			s2+="*";
		}
		
		return str.substring(0,4)+s2;
	}
}
