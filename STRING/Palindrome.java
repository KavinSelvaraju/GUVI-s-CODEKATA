// Radha newly learnt about palindromic strings.A palindromic string is a string which is same when read from left to right and also from right to left.Help her in implementing the logic.
// Input Description:
// You are given a String ‘s’

// Output Description:
// Print 1 if String is palindrome or 0 if not

// Sample Input :
// NITIN
// Sample Output :
// 1

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String input=sc.next();
       String output="";
       char ch[]=input.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
           output+=ch[i];
       }
       if(input.equals(output)){
           System.out.println("1");
       }
       else
         System.out.println("0");
    }
}
