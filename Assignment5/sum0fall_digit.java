public class sum0fall_digit {
    public static int sumfDigit(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum = sum + lastdigit;
            n = n/10;
        }
        return sum;

    }
    public static void main(String[]args){
        System.out.println(sumfDigit(2322));
    }
    
}
