package work.solution.traderproblem;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TraderTransactionApp {

	public static void main(String[] args) {

		Trader ram = new Trader("ram", "delhi");
		Trader kapil = new Trader("kapil", "noida");
		Trader raj = new Trader("raj", "banglore");
		Trader ekta = new Trader("ekta", "banglore");

		List<Transaction> transactions = Arrays.asList(new Transaction(ram, 2011, 300),
				new Transaction(ram, 2012, 1000), new Transaction(kapil, 2011, 400), new Transaction(raj, 2012, 710),
				new Transaction(ekta, 2012, 700), new Transaction(ekta, 2012, 950));

		// Question1
		System.out.println("-----------------Q1-----------------");
		List<Transaction> listOfTransactionsOfYear2011 = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());

		listOfTransactionsOfYear2011.forEach(t -> System.out.println(t));

		// Question2
		System.out.println("-----------------Q2-----------------");
		List<String> distinctCityList = transactions.stream().map(t -> t.getTrader().getCity()).distinct()
				.collect(Collectors.toList());

		distinctCityList.forEach(city -> System.out.println(city));

		// Question3
		System.out.println("-----------------Q3-----------------");
		List<Trader> tradersFromDelhi = transactions.stream().filter(t -> t.getTrader().getCity() == "delhi")
				.map(t -> t.getTrader()).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());

		tradersFromDelhi.forEach(trader -> System.out.println(trader));

		System.out.println("-----------------Q4-----------------");
		transactions.stream().map(t -> t.getTrader().getName()).sorted().forEach(str -> System.out.println(str));
		;

		System.out.println("-----------------Q5----------------");
		long count = transactions.stream().filter(t -> t.getTrader().getCity() == "jaipur").count();
		if (count > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println("------------------Q6-----------------");
		transactions.stream().filter(t -> t.getTrader().getCity() == "delhi").forEach(t -> System.out.println(t));

		System.out.println("------------------Q7-----------------");
		Optional<Transaction> max = transactions.stream().max(Comparator.comparing(Transaction::getValue));
		Transaction maxValueTransaction = max.get();
		System.out.println(maxValueTransaction);

		System.out.println("------------------Q8-----------------");
		Optional<Transaction> min = transactions.stream().max(Comparator.comparing(Transaction::getValue).reversed());
		Transaction minValueTransaction = min.get();
		System.out.println(minValueTransaction);

	}
}
