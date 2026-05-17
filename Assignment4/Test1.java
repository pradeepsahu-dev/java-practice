import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
         
        Scanner sc =new Scanner(System.in);

        int number;
        int choice;
        int evensum=0;
        int oddSum=0;

        do{
            System.out.println("Enter the number");
            number = sc.nextInt();

            if(number% 2==0){
                evensum+=number;

            }else{
                oddSum+=number;
            }

            System.out.println("press 1 for continue and press 0  foor no");
            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Sum of Even number" + evensum);
        System.out.println("Sum of odd number" + oddSum);


        

    }
    
}
