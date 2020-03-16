package com.wrd.common.utils;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testRead() throws Exception {
	    List<String> list = StreamUtil.read(new File("d:\\week3.txt"));
	    
	    for (String string : list) {
			System.out.println(string);
		}
	}

}
