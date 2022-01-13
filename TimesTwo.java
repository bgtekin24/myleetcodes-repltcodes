/*
Create a method that:

is called timesTwo
returns an ArrayList of Integers
takes in a single parameter - an ArrayList of Integers called nums
This method should take the ArrayList parameter and multiply every value by two.*/

import java.util.*;

class Main{

	//create your method below
	public static ArrayList<Integer> timesTwo (ArrayList<Integer> nums) {
    ArrayList<Integer> list1 = new ArrayList<>();
    for(int i=0; i < nums.size(); i++) {
      list1.add(nums.get(i)*2);
    }
    return list1;
  }







  // Do not touch below

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextInt());
    }

    System.out.println(timesTwo(list));

  } 

}
