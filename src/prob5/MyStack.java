package prob5;

public class MyStack {
	private int top;
	private String[] buffer;

	public MyStack(int size) {
		top = -1;
		buffer = new String[size];
	}

	public void push(String str) {
		if (top == buffer.length - 1) {
			buffer = resize();
		}
		buffer[top+1] = str;
		top++;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public String pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		return buffer[top--];
	}

	private String[] resize() {
		String[] myStack = new String[buffer.length * 2];
		for (int i = 0; i < buffer.length; i++) {
			myStack[i] = buffer[i];
		}
		buffer = null;
		
		return myStack;
	}
}
