package java_chobo.ch06.test;

public class Ecercise6_5 {

	public static void main(String[] args) {
		//testStack();
		MyQueue queue = new MyQueue();
		System.out.println(queue);		
		//6개 데이터 삽입
		char ch = 'a';
		for(int i =0;i<6;i++) {
			queue.insertItem(ch++);
			queue.prnQueue();
		}
		//6개 데이터 삭제
		for(int i =0;i<6;i++) {
			ch = queue.deleteItem();
			System.out.printf("%c %n" ,ch);
			queue.prnQueue();
		}
		
		
		
		
	}

	public static void testStack() {
		MyStack stack = new MyStack();
		stack.prnStack();

		stack.push('t');
		stack.prnStack();
		stack.push('e');
		stack.prnStack();
		stack.push('s');
		stack.prnStack();
		stack.push('t');
		stack.prnStack();
		stack.push('a');
		stack.prnStack();
		stack.push('l'); // "stack is overflow"
		stack.prnStack();
		System.out.println();
		stack.prnStack();
		System.out.println(stack.pop());//a
		stack.prnStack();
		System.out.println(stack.pop());//t
		stack.prnStack();
		System.out.println(stack.pop());//s
		stack.prnStack();
		System.out.println(stack.pop());//e
		stack.prnStack();
		System.out.println(stack.pop());//t
		stack.prnStack();
		System.out.println(stack.pop());//"underflow"
		stack.prnStack();
	}

}
