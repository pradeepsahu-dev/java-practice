import java.util.Scanner;
public class Sumof_natural_numbe {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        System.out.print("enter number");
        int n = sc.nextInt();
        while(number <= n){
        
          sum+=number;
          number++;
        }
        System.out.println(sum);


    }
}
