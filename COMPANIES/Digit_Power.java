// Given a number 'N' print the sum of each digit to the power of number of digits in given input.
// Example :
// Input => 1234
// => ( 1 ^ 4 ) + ( 2 ^ 4 ) + ( 3 ^ 4 ) + ( 4 ^ 4 )
// => 1 + 16 + 81 + 256
// Output => 354
// N <=100000000000
// Sample Testcase :
// INPUT
// 1234
// OUTPUT
// 354



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        
        int sum=0;
        int n=0;
        while(num>0){
            int power=1;
            n=num%10;
            for(int i=0;i<count;i++){
                power*=n;
            }
            sum+=power;
            num/=10;
            
        }
        System.out.println(sum);
    }
}
