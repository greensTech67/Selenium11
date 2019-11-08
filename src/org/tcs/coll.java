package org.tcs;

import java.util.ArrayList;
import java.util.List;

public class coll {
	
	public static void main(String[] args) {
		
		
		List<Integer> li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		
		
		System.out.println(li);
	
		
		//to find the length of the list 
		
		int size = li.size();
		System.out.println(size);
		
		// to pick the particular value
		Integer integer = li.get(2);
		System.out.println(integer);
		
		
		//index of 
		
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		
		// to add the values between the list 
		
		li.add(3,40);
		System.out.println(li);
		
       // to remove the values from the list 
		
//	li.remove(4);
//	System.out.println(li);
	
	
	
	li.set(4,50);
	System.out.println(li);
		
		
		// to copy one list to another list
		List<Integer> l1=new ArrayList();
		
	l1.addAll(li);
	
	System.out.println(li);
	
	l1.add(60);
	System.out.println(l1);
	
	// to remove the common values from the list 
	
//l1.removeAll(li);
//System.out.println(l1);
//	

// iterate
for(int i=0;i<li.size(); i++) {
	System.out.println(li.get(i));
}

//enhanced for loop

for(int j=0; j<l1.size(); j++) {
	System.out.println(l1.get(j));
}
	
	
	
	}
	
	

}
