// Given a sentence interchange the between the word 'and'.
// Input Size : |S| <= 1000000
// Sample Testcase :
// INPUT
// jack and jill went up and down to get water
// OUTPUT
// jill and jack went down and up to get water


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s[]=str.split(" ");
        String temp="";
        for(int i=0;i<s.length;i++){
             if(s[i].equals("and")){
                 temp=s[i-1];
                 s[i-1]=s[i+1];
                 s[i+1]=temp;
             }
        }
        for(int j=0;j<s.length;j++){
            if(j!=0){
                System.out.print(" ");
            }
            System.out.print(s[j]);
        }
    }
}
