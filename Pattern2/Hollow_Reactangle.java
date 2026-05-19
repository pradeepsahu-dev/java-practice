public class Hollow_Reactangle{

    public static void hollow_rectangle(int totRow, int totCol){
        //outer loop
        for(int i=1; i<=totRow; i++){

            //inner columns (boundary)
            for(int j=1; j<=totCol; j++){
                //check boundary (i,j)
                if(i==1 || i==totRow || j==1 || j==totCol){
                    System.out.print("*"+" ");

                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[]args){
        hollow_rectangle(6, 5);
        
    }
}