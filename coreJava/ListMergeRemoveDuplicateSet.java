package InterviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListMergeRemoveDuplicateSet {

	public static void main(String arg[]){
		
		List <Integer> l1= new ArrayList<>();		
		l1.add(22); l1.add(2); 		l1.add(1); 		l1.add(23); 		l1.add(22); 		l1.add(15);
		l1.add(98); 		l1.add(2); 
		
		System.out.println("l1    :"+l1);
		
		List <Integer> l2= new ArrayList<>();		
		l2.add(2);		l2.add(16); 		l2.add(1); 		l2.add(23); 		l2.add(22);
		l2.add(7); 		l2.add(37); 		l2.add(80);
		System.out.println("l2    :"+l2);
		
		Set <Integer> set = new TreeSet(l1);
		set.addAll(l2);
		
		System.out.println(set);
		
		
	}
	
}
