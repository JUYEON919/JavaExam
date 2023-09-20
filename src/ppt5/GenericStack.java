package ppt5;

import java.util.ArrayList;

//정수랑 문자열
public class GenericStack<T> {
	private ArrayList<T> myStack;
	private int top = -1;
	
	public GenericStack() {
        myStack = new ArrayList<T>();
    }
	
	// 요소 추가
    public void push(T value) {
        myStack.add(value);
        top++;
    }
    // 요소 제거
    public T pop() {
        T result = peek();
        myStack.remove(top--);
        return result;
    }
    // peek
    public T peek() {
    	return myStack.get(top);
    }
 // 스택이 비어 있는지 확인
    public boolean isEmpty() {
    	if(top==-1) return true;
    	else return false;
    }

    // 스택의 크기 조회
    public int size() {
        return myStack.size();
    }
    /*메인*/
    public static void main(String[] args) {
    	//정수형 스택
    	GenericStack<Integer> intStack = new GenericStack<>();
    	System.out.println("정수형 스택:");
    	intStack.push(10);
    	intStack.push(20);
    	intStack.push(30);
    	System.out.println(intStack.size());	//3
    	System.out.println(intStack.pop());		//30
    	System.out.println(intStack.peek());	//20
    	System.out.println(intStack.size());	//2
    	
    	
    	//문자열 스텍
    	GenericStack<String> stringStack = new GenericStack<>();
    	System.out.println("\n문자열 스택:");
    	stringStack.push("banana");
    	stringStack.push("apple");
    	System.out.println(stringStack.size());//2
    	System.out.println(stringStack.pop());//apple
    	System.out.println(stringStack.size());//1
    	System.out.println(stringStack.peek());//banana
    }
    
    
}
