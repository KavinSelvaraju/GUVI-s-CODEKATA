// How many possible ways are to shuffle given number of playing cards?.
// Input Size : |N| <= 1000000
// Sample Testcase :
// INPUT
// 7
// OUTPUT
// 5040



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int sum=1;
       for(int i=1;i<=num;i++){
           sum*=i;
       }
       System.out.println(sum);
    }
}
