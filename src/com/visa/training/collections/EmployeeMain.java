package com.visa.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {

//		mapDemo();
//		setDemo();
		sortDemo();

	}

	private static void sortDemo() {

		String[] words= {"shakthi","lidwin","karthi"};
		List<String> word=Arrays.asList(words);
		Collections.sort(word,new StringLengthComparator());
		
	}

	static void mapDemo() {
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		String id, name;

		int i = 1;
		while (i <= 1) {
			System.out.println("enter the id and name of the employee");
			id = sc.nextLine();
			name = sc.nextLine();
			e.createEmployee(id, name);
			i++;
		}
		System.out.println("enter the id of the employee to be retrieved");
		String key = sc.nextLine();
		e.printDetails(key);

	}

	static void setDemo() {
		Set<String> words = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the word to be added to the set");
			String input = sc.nextLine();
			if (!words.add(input)) {
				System.out.println("duplicate");
				break;
			}
		}
		System.out.println("sizeeee of the set is " + words.size());
		for (String st : words) {

			System.out.println(st);
		}
	}
}
