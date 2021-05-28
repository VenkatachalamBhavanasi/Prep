package ds.week1;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set -> Dynamic Array [Single Dimensional]
		// Set -> Can grow or shrink by size
		// Set -> Do not allow duplicate values
		// Set -> HashSet (Hashing Algorithm), TreeSet (ASCII Value), LinkedHashSet
		// (Maintains the insertion order)

		Set<String> companies = new HashSet<>();
		companies.add("Syntel");
		companies.add("HCL");
		boolean add = companies.add("HP");
		System.out.println("First " + add);
		companies.add("Mercury");
		boolean add2 = companies.add("HP");
		System.out.println("Second " + add2);
		companies.add("TestLeaf");
		for (String eachCompany : companies) {
			System.out.println(eachCompany);
		}

	}

}
