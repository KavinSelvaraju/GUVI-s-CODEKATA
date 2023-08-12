// Write a program to get a string S, Type of conversion (1 - Convert to Lowercase, 2 - Convert to Uppercase) T, and integer P . Convert the case of the letters in the positions which are multiples of P.(1 based indexing).

// Input Description:
// Given a string S, Type of conversion T, and integer P

// Output Description:
// Convert the case of the letters and print the string

// Sample Input :
// ProFiLe
// 1
// 2
// Sample Output :
// Profile


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int type=sc.nextInt();
        int position=sc.nextInt();
        char ch[]=input.toCharArray();
        String output="";
        switch(type){
            case 1:
                    for(int i=0;i<ch.length;i++){
                        if((i+1)%position==0){
                            output+=Character.toLowerCase(ch[i]);
                        }
                        else
                         output+=ch[i];
                    }
                    System.out.println(output);
                    break;
            case 2:
                    for(int i=0;i<ch.length;i++){
                        if((i+1)%position==0){
                            output+=Character.toUpperCase(ch[i]);
                        }
                        else
                         output+=ch[i];
                    }
                    System.out.println(output);
                    break;
        }
    }
}
