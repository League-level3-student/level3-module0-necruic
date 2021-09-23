package _00_Intro_To_Arrays;

import java.util.Arrays;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String[] strings = new String[5];
    	strings[0] = "bob";
    	strings[1] = "joe";
    	strings[2] = "jeff";
    	strings[3] = "john";
    	strings[4] = "jack";
        // 2. print the third element in the array
    	System.out.println(strings[2]);
        // 3. set the third element to a different value
    	strings[2] = "jane";
        // 4. print the third element again
    	System.out.println(strings[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i=0; i < strings.length; i++) {
    		strings[i] = i+"bob";
    		System.out.println(strings[i]);
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i=0; i<strings.length; i++) {
    		String s = strings[i];
    		System.out.println(s);
    	}
        // 7. make an array of 50 integers
    	  int[] lol = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	  Random rand = new Random();
    	  /*
    	  for(int i=0; i < lol.length; i++) {
    	lol[i]=rand.nextInt(100);	
    	  System.out.println(lol[i]);
    	  }
    	*/
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	  for(int i=0; i < lol.length; i++) {
    	    	lol[i]=rand.nextInt(100);	
    	   Arrays.sort(lol); 
    	   System.out.println(lol[0]);
    	  }
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.
    	  System.out.println(lol[49]);
        // 12. print only the last element in the array
    	  System.out.println(lol[49]);
    }
}
