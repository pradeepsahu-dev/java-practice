
public class inverted_Half_Pyramid {

    public static void Inverted_half_pyamid(int n){
        //outer
        for(int i=1; i<=n; i++){
            // ineer
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");


            }
            System.out.println();

        }
    }
    
    public static void main(String[]args){
        Inverted_half_pyamid(5);
    }
   

    
}