package com.additi1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Tester {
	public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\LISHAKAR\\eclipse-workspace\\t.txt");
	FileReader fr=null;
		try {
		fr =new FileReader(f);
		}catch(Exception e) {
//			e.printStackTrace();
		}
		finally {
			System.out.println("Final block");
			if(fr!=null)
			{
			fr.close();
			}
		}
	}
}
