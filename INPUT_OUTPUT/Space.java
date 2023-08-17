// Write a code to get the input in the given format and print the output in the given format

// Input Description:
// A single line contains a string.

// Output Description:
// Print the characters in a string separated by space.

// Sample Input :
// guvi
// Sample Output :
// g u v i


import java.util.Scanner;
public class Space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i!=0){
               System.out.print(" ");
           }
           System.out.print(ch[i]);
        }
    }
}
