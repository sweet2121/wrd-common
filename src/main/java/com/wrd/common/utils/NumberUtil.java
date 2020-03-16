package com.wrd.common.utils;

public class NumberUtil {

	/*
	* 百分比计算方法，返回值只要整数不需要小数。
	* 给一个当前数，和一个总数，计算当前数百分占比，例如参数为5和10，方法内部
	* 5除以10得0.5，再乘以100，返回50，注意四舍五入。页面就可以显示50%
	*/
	public static int getPercent(int current, int total){
		//5   10
		int num = (int) Math.round(((float)current/(float)total)*100);
		//int num =(int)((current*1.0/total)*100);
		return num;
	}

}
