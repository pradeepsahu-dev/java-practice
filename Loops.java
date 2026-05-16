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


        System.out.print("Enter a number");
        int number = 1;
        int n = sc.nextInt();
         while(number<=n){
            System.out.println(number);
            number++;
         }
        


    }
    
}
