package java_chobo.ch06.test;

public class Ecercise6_4 {

	public static void main(String[] args) {
		//testStack();
		MyQueue queue = new MyQueue();
		System.out.println(queue);		
		//6개 데이터 삽입
		queue.prnQueue();
		queue.insertItem('t');
		queue.prnQueue();
		queue.insertItem('e');
		queue.prnQueue();
		queue.insertItem('s');
		queue.prnQueue();
		queue.insertItem('t');
		queue.prnQueue();
		queue.insertItem('a');
		queue.prnQueue();
		queue.insertItem('l'); 
		queue.prnQueue();
		//6개 데이터 삭제
		queue.prnQueue();
		System.out.println(queue.deleteItem());//a
		queue.prnQueue();
		System.out.println(queue.deleteItem());//t
		queue.prnQueue();
		System.out.println(queue.deleteItem());//s
		queue.prnQueue();
		System.out.println(queue.deleteItem());//e
		queue.prnQueue();
		System.out.println(queue.deleteItem());//t
		queue.prnQueue();
		System.out.println(queue.deleteItem());//"underflow"
		queue.prnQueue();
		
		
		
		
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
