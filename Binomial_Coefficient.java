public class Binomial_Coefficient {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }

        return fact;
    
    }
    public static int Bio_Coeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);

        int Bio_Coeff = fact_n /(fact_r*fact_n_r);
        return Bio_Coeff;

    }
    public static void main(String[]args){
        System.out.println(Bio_Coeff(4,3));

    }
    
}
