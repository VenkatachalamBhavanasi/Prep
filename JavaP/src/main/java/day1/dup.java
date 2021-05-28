package day1;

public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence="he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";

		int k=0;
	    String s1 = sentence.replaceAll("^[A-Za-z][-]", " ");

	    System.out.println(s1);
	    System.out.println(k);

	}

}
