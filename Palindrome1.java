/*

Palindrome is a word, phrase, or sequence that reads the same backward as forward.

Example: madam

So method isPalindrome checks the given String and returns true if check is palindrome and false if it is not.

make your conditions case insensitive. ex: Civic and civic are both palindromes
make your conditions space insensitive. Race car is a palindrome even though there is space in between.
Examples:

isPalindrome("Noon") ==> true
isPalindrome("Noon") ==> true
isPalindrome("I am not palindrome") ==> false
isPalindrome("I am not palindrome") ==> false
isPalindrome("wooden") ==> false
isPalindrome("wooden") ==> false
isPalindrome("Nurses Run") ==> true

*/

import java.util.Scanner;

class Main {

  public static boolean isPalindrome(String check) {
    
  // your code here
  String newcheck=check.replace(" ", "");
   boolean flag=false;
   int b=0;
   for (int a=newcheck.length()-1; a>b; a--)    {
   if (Character.toLowerCase(newcheck.charAt(a))==Character.toLowerCase(newcheck.charAt(b)))  {
       b++;
       flag=true;   
    } else if (newcheck.charAt(a)!=newcheck.charAt(b)) {
       flag=false;
       break;   
  }
  }
      return flag;  
  }
  // Do not touch below
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(isPalindrome(in.nextLine()));
  }
}
