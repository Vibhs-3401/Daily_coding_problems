/*
This question is asked by Google. Given a string, reverse all of its characters and return the resulting string.

Ex: Given the following strings...
  “Cat”, return “taC”
  “The Daily Byte”, return "etyB yliaD ehT”
  “civic”, return “civic”
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=str.length()-1; i>=0; i--) {
		    System.out.print(str.charAt(i));
		}
	}
}

