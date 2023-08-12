// Given a string S, print 'yes' if it has a vowel in it else print 'no'.
// Sample Testcase :
// INPUT
// codekata
// OUTPUT
// yes


import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='O'|| ch[i]=='u'|| ch[i]=='u'){
                count++;
            }
        }
        if(count>0)
          System.out.println("yes");
        else
        System.out.println("no");
    }
}
