package com.visa.training.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee {
	
	Map<String,String>mp=new HashMap<String, String>();
	void createEmployee(String key,String value)
	{
		mp.put(key,value);
		
	}
	void printDetails(String key)
	{
		if(mp.containsKey(key))
			System.out.println("the details of the employee are "+key+" : "+mp.get(key));
		else
			System.out.println("no employee by that id");
	}
	
}
