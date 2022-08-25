/* Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N*/

public class solution {
    static int count=0;

	public static int countZerosRec(int num){
		// Write your code here
        if(num == 0)
            return 1;
    if(num>0)
    {

        if(num%10==0)
        count++;

        countZerosRec(num/10);
    }
    return count;
	}
}
