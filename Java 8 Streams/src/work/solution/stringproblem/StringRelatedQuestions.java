package work.solution.stringproblem;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StringRelatedQuestions {
	public static void main(String[] args) {

		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		System.out.println("----Question1-----");
		// Count the empty strings
		long countOfEmptyStrings = strList.stream().filter(str->str.length()==0).count();
		System.out.println(countOfEmptyStrings);
		
		System.out.println("----Question2-----");
		// Count String with length more than 3 
		List<String> stringsWithLengthMoreThanThree = strList.stream().filter(s->s.length()>3).collect(Collectors.toList());
		stringsWithLengthMoreThanThree.forEach(s->System.out.println(s));
		
		System.out.println("----Question3-----");
		// Count number of String which startswith "a" 
		Predicate<String> nonEmpty=s->s.length()>0;
		Predicate<String> startWithA=s->s.charAt(0)=='a';
 		long count = strList.stream().filter(nonEmpty.and(startWithA)).count();
		System.out.println(count);
		
		System.out.println("----Question4-----");
		// Remove all empty Strings from List
		List<String> nonEmptyStringList = strList.stream().filter(nonEmpty).collect(Collectors.toList());
		nonEmptyStringList.forEach(str->System.out.println(str));
	
		System.out.println("----Question5-----");	
		// Create a String  more than 2 characters (joining)
		String concatenatedStrings = strList.stream().filter(s->s.length()>2).reduce("",(a,b)->a.concat(b).concat(" "));
		System.out.println(concatenatedStrings);
		
		System.out.println("----Question6-----");
		// Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String countries = G7.stream().filter(nonEmpty).map(s->s.toUpperCase()).reduce(G7.get(0),(a,b)->a.concat(",").concat(b));
		System.out.println(countries);
		
		System.out.println("----Question7-----");
		 // Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> squaredNumberList = numbers.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(squaredNumberList);
		
		System.out.println("----Question8-----");
		//Get count, min, max, sum, and average for numbers
		 List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29); 

		IntSummaryStatistics stats = primes.stream().mapToInt(x->x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("Lowest prime number in List : " + stats.getMin()); 
		System.out.println("Sum of all prime numbers : " + stats.getSum()); 
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		
		
	}
}
