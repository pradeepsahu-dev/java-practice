// Inverted and rotated Half Pyramid

public class invertedRotated_HalfPyramid {
    public static void rotatedhalf_Pyramid(int rows){
        //outer line
        for(int i=1; i<=rows; i++){

            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print(" "+" ");
                
            }

            // star
            for(int j=1; j<=i; j++){
                System.out.print("*"+ " ");
            }

            System.out.println();
        }

    }

    public static void main(String[]args){
        rotatedhalf_Pyramid(6);

    }
    
}
