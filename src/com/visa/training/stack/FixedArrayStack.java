package com.visa.training.stack;

public class FixedArrayStack implements Stack {

	Object arr[];int top=0,size;
	FixedArrayStack(int size)
	{
		arr=new Object[size];
		this.size=size;
	}
	public void push(Object element) throws ArrayIndexOutOfBoundsException
	{
		try
		{
			if(top==size || top<0)
				throw new ArrayIndexOutOfBoundsException("stack is full or neg index accessed") ;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			StackFullException s=new StackFullException(e.toString());
		}
		
		arr[top++]=element;
		
	}
	public Object pop()
	{
		try
		{
			if(top<=0)
				throw new ArrayIndexOutOfBoundsException("stack is empty or neg index accessed");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.toString());
			return null;
		}
		return arr[--top];
	}
	
}
