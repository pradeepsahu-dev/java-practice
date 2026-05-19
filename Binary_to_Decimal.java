// Binary to decimal convertion


public class Binary_to_Decimal {

    public static void binaryTodecimal(int binNum){
        int binary = binNum;
        int pow = 0;
        int decnum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decnum = decnum + (lastDigit* (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of "+binary+ "="+ decnum );

    }
    public static void main(String[]args){
        binaryTodecimal(101);

    }
    
}
