package com.visa.training.generics;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class StreamsPractice {

	public static void main(String[] args) {

		basicStreams();
		secondLevelStreams();
		thirdLevelStreams();

	}

	private static void printList(String s) {
		System.out.println(s);

	}

	private static void basicStreams() {

		List<String> li = Arrays.asList("shakthi", "karthi", "jega", "lidwin");
		li.stream().forEach(s -> System.out.println("  " + s));

		li.stream().forEach(StreamsPractice::printList);

//		String[] newlist = li.stream().map(s -> s.replace("i", "eye")).toArray(String[]::new);
//		System.out.println(Arrays.toString(newlist));

		List<String> newlistt = li.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
		System.out.println(newlistt);

		newlistt = newlistt.stream().filter(s -> s.length() <= 4).collect(Collectors.toList());
		System.out.println(newlistt);

	}

	private static void secondLevelStreams() {
		List<String> l = Arrays.asList("gokul", "jessuva", "harsha");

//		List<String>ll=l.stream().forEach(s->s.toUpperCase());

		// first ques
		String str = l.stream().reduce((s1, s2) -> s1.toUpperCase() + s2.toUpperCase()).orElse(null);
		System.out.println(str);
		// second ques of part 2
		str = l.stream().map(s -> s.toUpperCase()).reduce("", (s1, s2) -> s1 + s2);
		System.out.println(str);

		// third ques
		str = l.stream().reduce((s1, s2) -> s1 + "," + s2).orElse(null);
		System.out.println(str);

	}

	private static void thirdLevelStreams() {
			
	double[] doublelist=new Random().doubles(1000).toArray();	
	
	double ans=DoubleStream.of(doublelist).reduce((d1,d2)->Math.sqrt(d1)+Math.sqrt(d2)).orElse(0);
	System.out.println(ans);
	
	
	}
}
