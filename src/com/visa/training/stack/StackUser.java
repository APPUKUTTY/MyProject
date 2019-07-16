package com.visa.training.stack;
import java.util.Scanner;

public class StackUser {

	
		
		public void fill(Stack s)
		{
			Scanner sc=new Scanner(System.in);
			int i;
			for(i=0;i<5;i++)
			{
				System.out.println("enter a number");
				int no=sc.nextInt();
				s.push(no);
			
			}
		}
		public void empty(Stack s)
		{
			int i=0;
			for(;i<5;i++)
			{
				Object no=s.pop();
				if(no!=null)
					System.out.println(no.toString());
			}
		}
	}
