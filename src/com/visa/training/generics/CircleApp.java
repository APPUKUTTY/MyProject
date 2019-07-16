package com.visa.training.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CircleApp {

	public static void main(String[] args) {

		String[] str = { "shakthie", "prashanthe", "gokul", "ambareessssh" };
		List<String> li = Arrays.asList(str);
		Arrays.sort(str, (s1, s2) -> (s1.length() - s2.length()));
		System.out.println("the sorted arr by length short to long is " + Arrays.toString(str));

		Arrays.sort(str, (s1, s2) -> (s2.length() - s1.length()));
		System.out.println("the sorted arr by length long to short is " + Arrays.toString(str));

		Arrays.sort(str, (s1, s2) -> (s1.charAt(0) - s2.charAt(0)));
		System.out.println("the sorted arr by length long to short is " + Arrays.asList(str));

//		
		Arrays.sort(str, StringUtils::eChecker);

		List<String> lii = Arrays.asList("shakthi", "karthi");
		Iterator<String> itt = lii.iterator();
		while (itt.hasNext()) {

			System.out.println(itt.next());
		}

	}

}
