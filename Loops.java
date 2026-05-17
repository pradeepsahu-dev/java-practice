import java.util.Scanner;
public class Loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);


        //while loop

        // int i = 1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }
      


        // //print number from 1 to 10

        // int num =1;
        // while(num<=10){
        //     System.out.println(num);
        //     num++;
        // }


        // System.out.print("Enter a number");
        // int number = 1;
        // int n = sc.nextInt();
        //  while(number<=n){
        //     System.out.println(number);
        //     number++;
        //  }


        // for loop

        // for(int i=1; i<=5; i++){
        //     System.out.println(i);
        // }

        //reverse of a number 

        // for(int i=10; i>=1; i--){
        //     System.out.println(i);
        // }

        //print reverse

        int n = 10899;
        int rev = 0;

        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        System.out.println(rev);


    }
    
}
