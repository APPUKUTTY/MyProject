package com.visa.training.generics;
@FunctionalInterface
public interface TwoElementPredicate<T> {

	public boolean isElementBetter(T s1,T s2);
	
}
