import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class FacorialOfBigNuumber
{
    public static void main (int n)
    {
        BigInteger fact= BigInteger.ONE;
        //int factorialNo = n;
        for(int i=2;i<=n;i++)
            {
                fact=fact.multiply(new BigInteger(String.valueOf(i)));
            }
        System.out.println("The factorial of "+n+" is: " +fact);
    }
}