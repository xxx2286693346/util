package com.ycl.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;

public class FileUtil {
	
	
	public static List<String> readFile(File file,String string){
		List<String> content = new LinkedList();
		InputStream in = null;
		Reader reader = null;
		BufferedReader bufferedReader = null;
		try {
			in = new FileInputStream(file);
			reader=new InputStreamReader(in,string);
			bufferedReader=new BufferedReader(reader);
			String line = null;
			while ((line = bufferedReader.readLine())!=null) {
				System.out.println(line);
				content.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}finally {
			close(bufferedReader,reader,in);
			
		}
		return content;
	}

	public static void close(AutoCloseable...autoCloseables){
		if(autoCloseables!=null && autoCloseables.length>0) { 
			AutoCloseable[] var4=autoCloseables;
			for (int var2 = 0; var2 < var4.length; ++var2) {
				AutoCloseable autoCloseable=var4[var2];
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	public static List<String> readFile(File file){
		return readFile(file,"utf-8");
	}
}
