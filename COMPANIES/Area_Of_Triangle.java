// Given base(B) and height(H) of a triangle find its area.
// Input Size : N <= 1000000
// Sample Testcase :
// INPUT
// 2 4
// OUTPUT
// 4





import java.util.Scanner;
public class Area_Of_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
       double ans=0.5*l*b;
        System.out.println(ans);
    }
}
