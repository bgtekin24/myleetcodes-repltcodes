/*
Finish the combineRs method to combine the two given String arrays into one arraylist and return the arraylist.

for example:

combineRs(["f","o","o"],[" b","a","r"])
​
returns [f, o, o, b, a, r]
combineRs(["f","o","o"],[" b","a","r"])

returns [f, o, o, b, a, r]
combineRs(["1","2","3"],["4"])
​
returns [1, 2, 3, 4]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static String[] combineRs(String[] r1,String[] r2){
  // your code here
  int b=r1.length;
  int c=r2.length;
  String[] lst= new String [b+c];

  for (int a=0; a<b+c; a++)  {
      if (a<b) {
      lst[a]=r1[a];
   } else {
      lst[a]=r2[a-b];
   } }
//System.out.println(Arrays.toString(lst));
  return lst;
  }
  public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      String [] strs = new String[in.nextInt()];
      String [] strs2 = new String[in.nextInt()];
      for(int i=0; i < strs.length; i++) {
        strs[i] = in.next();
      }
      for(int i=0; i < strs2.length; i++) {
        strs2[i] = in.next();
      }

    System.out.println(Arrays.toString(combineRs(strs,strs2)));

  } 

}
