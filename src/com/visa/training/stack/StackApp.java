package com.visa.training.stack;

public class StackApp {

	public static void main(String[] args) {
		Stack s=new FixedArrayStack(5);
		StackUser user=new StackUser();
		user.fill(s);
		user.empty(s);
	}

}
