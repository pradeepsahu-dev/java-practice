public class Test3 {
    public static boolean Palindrom(int n){
        int original = n;
        int reverse = 0;

        while(n>0){
            int rem = n%10;
            reverse = reverse*10+rem;
            n = n/10;  
        }
        return reverse == original;

       
    }
    public static void main(String[]args){
        
        if(Palindrom(232)){
             System.out.println("yes this is palindrome");
         }else{
            System.out.println("not palindrome");
         }
        
    }

    
}
