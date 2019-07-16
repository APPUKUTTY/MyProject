package com.visa.training.practice;

import java.util.Arrays;

public class LambdaTraining {

	static int eChecker(String s1,String s2)
	{
		if (s1.contains("e") && !s2.contains("e"))
			return -1;
		else if (s2.contains("e") && s1.contains("e"))
			return 0;
		else 
			return -1;
			
	}
	public static void main(String[] args) {

		String[] str = { "vel", "shakthi", "karthi", "mala", "karunanithi" };

		Arrays.sort(str, (s1, s2) -> s1.length() - s2.length());
		System.out.println("string array after sorting is " + Arrays.toString(str));
		Arrays.sort(str,LambdaTraining::eChecker);

	}
}
