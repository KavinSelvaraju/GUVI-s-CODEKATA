// You are given a paragraph.Your task is to print the words that come just after articles.

// Input Description:
// You are given a string ‘s’

// Output Description:
// print the words that come just after articles and -1 if there are no articles

// Sample Input :
// The sun rises in the east

// Sample Output :
// sun east


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String output="";
        String s[]=input.split(" ");
        int count=0;
        int space=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals("The") || s[i].equals("the") || s[i].equals("an") || s[i].equals("a") || s[i].equals("A")){
                count++;
            }
        }
        if(count>0){
        for(int i=0;i<s.length;i++){
            if(s[i].equals("The") || s[i].equals("the") || s[i].equals("an") || s[i].equals("a") || s[i].equals("A")){
                if(space>0){
                    
                    output+=" ";
                }
                output+=s[i+1];
                space++;
            }
        }
        System.out.println(output);
    }
    else
     System.out.println("-1");
    }
}
