package com.additi;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class variables {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println(name+age);
		List<Integer>  li = new ArrayList<>();
		li.add(0, 20);
		li.add(0, 30);
		System.out.println("li"+ li.contains(20));
		newMethod();
		int a =10;
		
	}
	static void newMethod() {
		System.out.println("Helloworld");
		ProcessBuilder pb = new ProcessBuilder();
		pb.directory();
		Map<Integer,String> m = new HashMap<>();
		m.put(0, "Lishakar");
		
	}
	

	
	
}
