// Given the values of a,b and x in the equation ax + b = y. Find the value of y.
// Sample Testcase :
// INPUT
// 3 5 2
// OUTPUT
// 11

import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int x=sc.nextInt();
       int y=(a*x)+b;
       System.out.println(y);
    }
}
