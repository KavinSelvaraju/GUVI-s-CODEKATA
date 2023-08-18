// Given 2 numbers N,K and an array of N integers, find if the element K exists in the array.
// Input Size : N <= 100000
// Sample Testcase :
// INPUT
// 5 2
// 1 2 3 4 5
// OUTPUT
// yes


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int size=sc.nextInt();
       int a[]=new int[size];
       for(int i=0;i<size;i++){
           a[i]=sc.nextInt();
       }
       int find=sc.nextInt();
       int count=0;
       for(int i=0;i<size;i++){
           if(a[i]==find){
               count++;
               break;
           }
       }
       if(count>0){
           System.out.println("yes");
       }
       else
        System.out.println("no");
}
}
