package com.additi;

import java.util.Comparator;

public class classOne implements Comparator<Object>{

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer i=(Integer) obj1;
		Integer j=(Integer) obj2;
		return i.compareTo(j);
	}

	
}
