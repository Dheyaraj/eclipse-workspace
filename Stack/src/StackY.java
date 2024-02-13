import java.util.*;
import java.util.ArrayList;
public class StackY {
	
	static class Stack{
		static ArrayList <Integer> list = new ArrayList<Integer>();
		
		public static boolean isEmpty() {
			return list.size()==0;
		}
		
		public static void push(int data) {
			list.add(data);
		}
		
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
