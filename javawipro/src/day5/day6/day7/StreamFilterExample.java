package day7;
import java.util.*;
import java.util.stream.Collectors;

		public class StreamFilterExample {
		    public static void main(String[] args) {
		        List<Integer> al = new ArrayList<Integer>();
		        al.add(3);
		        al.add(8);
		        al.add(9);

		        // Filtering even numbers
		        List<Integer> li = al.stream()
		                             .filter(x -> x % 2 == 0)
		                             .collect(Collectors.toList());

		        System.out.println("Original List: " + al);
		        System.out.println("Filtered List (Even Numbers): " + li);
		    }
		// TODO Auto-generated method stub

	}


