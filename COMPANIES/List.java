// Given a number N followed by a list of N numbers. Write a program to reverse the list and print the list.
// Input Size : 1 <= N <= 10000
// Sample Testcases :
// INPUT
// 7
// 1 2 3 4 5 6 7
// OUTPUT
// 7->6->5->4->3->2->1



import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            if(i!=(size-1)){
                System.out.print("->");
            }
            System.out.print(a[i]);
        }
    }
}
