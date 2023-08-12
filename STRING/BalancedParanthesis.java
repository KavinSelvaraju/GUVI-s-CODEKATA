//  you are given a string made up of parenthesis only.Your task is to check whether parenthesis are balanced or not.If they are balanced print 1 else print 0

// Input Description:
// You are given a string ‘s’

// Output Description:
// Print 1 for balanced and 0 for imbalanced

// Sample Input :
// {({})}
// Sample Output :
// 1


import java.util.Scanner;
public class BalancedParanthesis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int para_open=0;
        int para_close=0;
        int squ_open=0;
        int squ_close=0;
        int curly_open=0;
        int curly_close=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                para_open++;
            }
            if(ch[i]==')'){
                para_close++;
            }
           else if(ch[i]=='{'){
                curly_open++;
            }
           else if(ch[i]=='}'){
                curly_close++;
            }
           else if(ch[i]=='['){
                 squ_open++;
            }
           else if(ch[i]==']'){
                 squ_close++;
            }
        }
        if((para_open==para_close) && (curly_open==curly_close) && (squ_open==squ_close)){
            System.out.println("1");
        }
        else
          System.out.println("0");
    }
}

