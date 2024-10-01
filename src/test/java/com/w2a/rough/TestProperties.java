package com.w2a.rough;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws IOException {
		// Read Config Properties Files
		File file=new File(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		Properties Config = new Properties();
		Config.load(new FileInputStream(file));

		// Read OR Properties Files
		File file1=new File(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
		Properties OR = new Properties();
		OR.load(new FileInputStream(file1));
	}
}
