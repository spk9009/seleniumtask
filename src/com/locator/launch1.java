package com.locator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class launch1{
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\godsp\\OneDrive\\Desktop\\Praveen\\sql.txt");
		FileUtils.write(f,"javaseleniun");
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		//to replace value
		FileUtils.write(f,"pythonselenium",false);
		List<String> readLines1 = FileUtils.readLines(f);
		System.out.println(readLines1);
		FileUtils.write(f,"welcome to class",true);
		List<String> readLines2 = FileUtils.readLines(f);
		System.out.println(readLines2);
	}
	
}
