package ppt5;

import java.util.ArrayList;
import java.util.List;

//정수랑 문자열
public class GenericStack<T> {
	private List<T> stack;
	
	public GenericStack() {
        stack = new ArrayList<>();
    }
	// 요소 추가
    public void push(T item) {
        
    }
 // 요소 제거
    public T pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
        }
        int lastIndex = stack.size() - 1;
        T item = stack.get(lastIndex);
        stack.remove(lastIndex);
        return item;
    }
	
 // 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // 스택의 크기 조회
    public int size() {
        return stack.size();
    }
    /*메인*/
    public static void main(String[] args) {
    	//정수형 스택
    	GenericStack<Integer> intStack = new GenericStack<>();
    	System.out.println("정수형 스택:");
    	//문자열 스텍
    	GenericStack<String> stringStack = new GenericStack<>();
    	System.out.println("\n문자열 스택:");
    }
    
    
}
