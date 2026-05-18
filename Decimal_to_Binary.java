public class Decimal_to_Binary {
    public static void decimaltoBinary(int n){
        int decimal = n;
        int pow = 0;
        int binary = 0;
        while(n>0){
            int rem = n%2;
            binary = binary+(rem*(int)Math.pow(10,pow));
            pow ++;
            n = n/2;
        }
        System.out.println("Decimal of "+ decimal+"=" +binary);
    }
    public static void main(String[]args){
        decimaltoBinary(5);

    }
}
