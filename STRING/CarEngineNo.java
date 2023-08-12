// In XYZ country there is rule that car’s engine no. depends upon car’ number plate. Engine no is sum of all the integers present on car’s Number plate.The issuing authority has hired you in order to provide engine no. to the cars.Your task is to develop an algorithm which takes input as in form of string(Number plate) and gives back

// Engine number.

// Input Description:
// You are given a string ’s’

// Output Description:
// Print the engine number

// Sample Input :
// HR05-AA-2669
// Sample Output :
// 28

  import java.util.Scanner;
public class CarEngineNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>'0' && ch[i]<='9')
            sum+=Character.getNumericValue(ch[i]);
        }
        System.out.println(sum);
    }
}
