package com.visa.training.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {

	public static void main(String[] args) {

//		String st = StringUtils.isBetter("sssssshakthi", "skjkdsjakj", (arg1, arg2) -> (arg1.length() > arg2.length()));

		List<String> li = Arrays.asList("ab", "abc", "shakthivel", "prashanthlidwin", "karunanithi");

		Predicate<String> p = s -> s.length() > 4;
		Predicate<String> p1 = s -> (s.length() % 2 == 0);

		List<String> newList = StringUtils.allMatches(li, p);
		System.out.println(newList.size());

		/*
		 * newList = StringUtils.allMatches(li, p1); System.out.println(newList.size());
		 * 
		 * List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 777, 888, 999, 1234);
		 * List<Integer> nos;
		 * 
		 * Predicate<Integer> p2 = a -> a > 1000; nos = StringUtils.allMatches(nums,
		 * p2);
		 */

//		functiondemo();

	}

	private static void functiondemo() {

		List<String> l = Arrays.asList("shakthi", "jessuva", "lidwin", "bala", "gokul");
		Function<String, Integer> f = s1 -> s1.length();
		List<Integer> stringList = StringUtils.transformedList(l, f);
		System.out.println(stringList.toString());

		Function<Integer, Integer> ff = no -> no * 3;
		List<Integer> intList = StringUtils.transformedList(stringList, ff);
		System.out.println(intList.toString());
	
	

	}

	private static <T, Y> List<Y> transformedList(List<T> l, Function<T, Y> f) {

		List<Y> newList = new ArrayList<Y>();
		for (T s : l) {
			newList.add(f.apply(s));

		}
		return newList;
	}

	public static int eChecker(String s1, String s2) {

		if (s1.indexOf('e') != -1) {
			if (s2.indexOf('e') != -1)
				return 0;
			else
				return -1;
		} else {
			if (s2.indexOf('e') != -1)
				return 1;
			else
				return 0;
		}

	}

	public static String isBetter(String first, String second, TwoStringPredicate condition) {
		if (condition.isFirstBetter(first, second)) {
			return first;
		}
		return second;

	}

	public static <T> T isBetterElement(T first, T second, TwoElementPredicate<T> condition) {
		if (condition.isElementBetter(first, second)) {
			return first;
		}
		return second;
	}

	public static <T> List<T> allMatches(List<T> li, Predicate<T> condition) {
		Iterator<T> it = li.iterator();
		List<T> newList = new ArrayList<T>();
		while (it.hasNext()) {
			T obj = it.next();
			if (condition.test(obj)) {

				System.out.println(obj);
				newList.add(obj);
			}
		}
		return newList;

	}
}
