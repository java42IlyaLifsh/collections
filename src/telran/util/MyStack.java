package telran.util;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;

//HW_26 IlyL
/**
 * 
 * all specified below methods should be written with complexity O[1] 
 *
 */
public class MyStack {
	

	
	private Stack <Integer> stack = new Stack<>();
 
	private Stack<Integer> maxElements = new Stack<>();
	
	

	Integer pop () {
	
				if (stack.isEmpty()) {
					throw new NoSuchElementException();
				}
				int res = stack.pop();
				int resMaxElements=maxElements.pop();
				
				return res;

	}
	/**
	 * 
	 * @return true it the stack is empty
	 */
	boolean isEmpty() {
		 
		return stack.isEmpty();
	}
	/**
	 * adds the given element at the end of the stack
	 * @param element
	 */
	void push(Integer element) {
		
			
				stack.push(element);
				
			 
				if (maxElements.isEmpty() || element >= maxElements.peek()) {
					maxElements.push(element);
				} else { maxElements.push(maxElements.peek());}
 
	}
	/**
	 * 
	 * @return maximal element existing in the stack
	 */
	Integer max() {
		 
		if (maxElements.isEmpty()) {
			throw new NoSuchElementException();
		}
		return maxElements.peek();
	}
}
