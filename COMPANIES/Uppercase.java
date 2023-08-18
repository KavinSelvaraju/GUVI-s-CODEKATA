// Given a string and a number K, change every kth character to uppercase from beginning in string.
// Sample Testcase :
// INPUT
// string 2
// OUTPUT
// sTrInG



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.next();
       int num=sc.nextInt();
       if(num==0){
           System.out.println(s);
       }
       else{
       char ch[]=s.toCharArray();
       String a="";
       for(int i=0;i<ch.length;i++){
           if((i+1)%num==0){
               a+=Character.toUpperCase(ch[i]);
           }
           else{
               a+=ch[i];
           }
       }
       System.out.println(a);
    }
}
}
