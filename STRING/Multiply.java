// You are given two numbers. Your task is to multiply the two numbers and print the answer.

// Input Description:
// You are given two numbers ‘n’ and ‘m’.

// Output Description:
// Print the multiplied answer

// Sample Input :
// 99999 99998
// Sample Output :
// 9999700002


import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       long value1=sc.nextLong();
       long value2=sc.nextLong();
       System.out.println(value1*value2);
    }
}

