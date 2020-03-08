package com.wrd.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	//读取inputStream内容放入集合
	public static List<String> read(InputStream inputStream) throws Exception{
		//声明集合
		List<String> list=new ArrayList<String>();
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(inputStream));
		String line="";
		while((line=reader.readLine())!=null){
			list.add(line);
		}
		
		return list;
	}
	//读取文件内容放入集合
	@SuppressWarnings("resource")
	public static List<String> read(File file) throws Exception{
		/*//声明集合
		List<String> list = new ArrayList<String>();
		BufferedReader reader=new BufferedReader(new FileReader(file));
		String line="";
		while((line=reader.readLine())!=null){
			list.add(line);
		}
		return list;*/
		FileInputStream inputStream = new FileInputStream(file);
		return read(inputStream);
	}
	//根据文件地址读取文件内容放入集合
	public static List<String> read(String filePath) throws Exception{
		/*//声明集合
		List<String> list=new ArrayList<String>();
		
		BufferedReader reader=new BufferedReader(new FileReader(filePath));
		String line="";
		while((line=reader.readLine())!=null){
			list.add(line);
		}
		return list;*/
		FileInputStream inputStream = new FileInputStream(filePath);
		return read(inputStream);
	}
	
}
