// Write a code to get the input in the given format and print the output in the given format.

// Input Description:
// First-line indicates two integers which are the size of array and 'K' value. Second-line indicates an integer contains elements of an array.

// Output Description:
// Print the taken input in the same format.

// Sample Input :
// 5 3
// 1 2 3 4 5
// Sample Output :
// 5 3
// 1 2 3 4 5 



import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int k=sc.nextInt();
       System.out.println(size+" "+k);
       int a[]=new int[size];
       for(int i=0;i<size;i++){
           a[i]=sc.nextInt();
       }
       for(int i=0;i<size;i++){
           if(i!=0){
               System.out.print(" ");
           }
           System.out.print(a[i]);
       }
    }
}
