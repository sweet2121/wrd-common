package com.wrd.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	//读取文件内容放入集合
	@SuppressWarnings("resource")
	public static List<String> read(File file) throws Exception{
		//声明集合
		List<String> list=new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
		while((line=reader.readLine())!=null){
			//读取一行
			//String ll = reader.readLine();
			list.add(line);
		}
		
		return list;
	}
}
