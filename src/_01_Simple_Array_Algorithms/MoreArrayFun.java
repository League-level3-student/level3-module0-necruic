package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] names = new String[3];
		names[0] = "bob";
		names[1] = "joe";
		names[2] = "john";
		printStringArray(names);
		printStringArrayReverse(names);
		printotherStringArray(names);
		printRandStringArray(names);
		
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStringArray(String[] words) {
		for(int i =0; i<words.length; i++) {
			System.out.println(words[i]);
			
		}
		
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static void printStringArrayReverse(String[] words) {
		for(int i = words.length-1; i>=0; i--) {
			System.out.println(words[i]);
		}
	}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printotherStringArray(String[] words) {
		for(int i = 0; i<words.length; i+=2) {
			System.out.println(words[i]);
		}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandStringArray(String[] words) {
		Random rand = new Random();
		int index;
		String temp;
		for(int i=words.length-1; i>0; i--) {
			index=rand.nextInt(i+1);
			temp=words[index];
			words[index]=words[i];
			words[i]=temp;
		}
		printStringArray(words);
	}

}
