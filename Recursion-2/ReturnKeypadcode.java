/* Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf*/

import java.lang.Math;

class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
		
      if(n<=1){
        String s[]={""};
        return s;
      }
      String prev[]=keypad(n/10);
      String actual[]=new String[(int)Math.pow(4.00,count(n))];
      //System.out.println(actual.length);
      String helper=setOfCharacter(n%10);
      int k=0;
      
      /*for(int i=0;i<prev.length;i++){
        for(int j=0;j<helper.length();j++){
          actual[k]=prev[i]+helper.charAt(j);
          //System.out.println(prev[i]);
          k++;
        }
      }*/
      for(int j=0;j<helper.length();j++){
          for(int i=0;i<prev.length;i++){
              actual[k]=prev[i]+helper.charAt(j);
              k++;
            }
          //System.out.println(prev[i]);
        //  System.out.println(helper.charAt(j));
      }
      int count=0;
      for(int i=0;i<actual.length;i++){
        if(actual[i]==null){
          count++;
        }
      }
      String newString[]=new String[actual.length-count];
      for(int i=0;i<actual.length;i++){
        if(actual[i]!=null){
	        newString[i]=actual[i];
      	}
      }
      return newString;
    }                                       
  /*function to count no of integers*/
  	public static double count(int n){
      double count=0;
	   while(n>0){
	       count++;
	       n=n/10;
	   }
      return count;
    }
  /*returns the string corresponding to an integer*/
  	public static String setOfCharacter(int n){
     switch(n){
        case 2:	return "abc";
         		
        case 3:	return "def";
         		
        case 4:	return "ghi";
         	
        case 5:	return "jkl";
         	
        case 6:	return "mno";
         	
        case 7:	return "pqrs";
         	
        case 8:	return "tuv";
			
        case 9:	return "wxyz";
        
       default:break;
     }
     return ""; 
    }
}