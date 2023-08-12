// Given a string 'S' print the sum of weight of the String. A weight of character is defined as the ASCII value of corresponding character.

// Input Description:
// You are given a string ‘s’

// Output Description:
// Print weight

// Sample Input :
// abc
// Sample Output :
// 294




  import java.util.Scanner;
public class WeightOfTheString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            sum+=(int)ch[i];
        }
        System.out.println(sum);
    }
}
