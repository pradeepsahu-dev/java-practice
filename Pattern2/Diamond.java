public class Diamond {

    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.println(" "+" ");

            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.println("*"+" ");

            }
        
            
        }
    }

    public static void main(String[]args){

    }
    
}
