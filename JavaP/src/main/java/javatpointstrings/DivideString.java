package javatpointstrings;

import java.util.Arrays;

import org.junit.Test;

public class DivideString {

	@Test
	public void example() {
		String str = "aaaabbbbcccc";
		int n = 3;
		divideString(str,n);

	}

	private void divideString(String str, int n) {
		// TODO Auto-generated method stub

		int temp = 0;
		int chars=str.length()/n;
		String[] equalString= new String[n];
        if(str.length() % n != 0) {
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
        }

        for (int i = 0; i < str.length(); i=i+chars) {

        	String part= str.substring(i, i+chars);
        	equalString[temp]=part;
        	temp++;

		}

        System.out.println(Arrays.toString(equalString));

	}

}
