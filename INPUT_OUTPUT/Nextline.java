// Write a code to get the input in the given format and print the output in the given format

// Input Description:
// Three integers are given in line by line.

// Output Description:
// Print the integers in a single line separate by space.

// Sample Input :
// 2
// 4
// 5
// Sample Output :
// 2 4 5


import java.util.Scanner;
public class Nextline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        System.out.println(n1+" "+n2+" "+n3);
    }
}
