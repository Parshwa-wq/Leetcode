/*
---->BigInteger Description:
-->How to Access: 
                BigInteger is a class in Java's java.math package that allows for mathematical operations on arbitrarily large integers.
                
-->Uses: 
      Beyond the size limitations of primitive data types like int and long. It provides methods for addition, subtraction, multiplication, division, and modular arithmetic, 
as well as support for prime number testing and random number generation.

-->Must know:
             Unlike primitive types, BigInteger is immutable, meaning any operation returns a new BigInteger instance instead of modifying the original one.
*/
import java.math.BigInteger;
import java.util.*;
class plus_One 
{
    public int[] plusOne(int[] digits) 
    {
        String s1="";
        for(int i=0;i<digits.length;i++)
        {
            s1+=Integer.toString(digits[i]);
        }

        BigInteger num1 = new BigInteger(s1);
        String s2 = num1.add(BigInteger.ONE).toString();
        BigInteger num2 = new BigInteger(s2);

        int[] Intarr=new int[s2.length()];

         BigInteger result = BigInteger.ZERO;

        while (num2.compareTo(BigInteger.ZERO) > 0) 
        {
            BigInteger rem = num2.mod(BigInteger.TEN);  
            result = result.multiply(BigInteger.TEN).add(rem);  
            num2 = num2.divide(BigInteger.TEN);  
        }

        for(int i=0;i<s2.length();i++)
        {
            BigInteger rem=result.mod(BigInteger.TEN);
            Intarr[i]=rem.intValue();
            result=result.divide(BigInteger.TEN);
        }
        return Intarr;
    }

    public static void main(String s[])
    {
      /* <codes by ---------------------------Parswa-wq--------------------------->*/
        Scanner input=new Scanner(System.in);
        plus_One obj=new plus_One();

        System.out.print("Enter the length of the array: ");
        int size=input.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element ["+(i+1)+"]: ");
            arr[i]=input.nextInt();
        }
        
        System.out.print("[");
        for(int i=0;i<obj.plusOne(arr).length;i++)
        {
            System.out.print(obj.plusOne(arr)[i]+",");
        }
        System.out.println("]");

    }
}
