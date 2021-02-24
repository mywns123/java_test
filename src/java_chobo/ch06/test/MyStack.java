package java_chobo.ch06.test;

import java.util.Arrays;

public class MyStack {
	int top;
	char[] chArr;
	int size = 5;

	public MyStack() {
		this.top = -1;
		this.chArr = new char[size];
	}

	public void push (char item) {
		if(top ==size-1) {
			System.out.println("stack is overflow");
			return;
		}
		chArr[++top] =item;		
	}
	
	public char pop() {
		if(top ==-1) {
			System.out.println("stack is underflow");
			return ' ';
		}
		return chArr[top--]; 
		
	}

	
	public void prnStack() {
		if(top == -1 ) {
			System.out.println("stack is underflow");
			return ;
		}
		for(int i = 0 ; i< top +1;i++) {
			System.out.printf("[%c]", chArr[i]);
		}
		System.out.println();
	}
	
	
	
	

	@Override
	public String toString() {
		return String.format("MyStack [top=%s, chArr=%s, size=%s]", top, Arrays.toString(chArr), size);
	}

	
}
