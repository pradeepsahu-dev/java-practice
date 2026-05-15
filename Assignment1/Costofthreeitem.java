import java.util.Scanner;

public class Costofthreeitem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil+pen+eraser;
        System.out.println("Total cost:" + total);
         
        float gst = total*18/100;

        float Total = total+gst;
        System.out.println("Including GST:" +Total);


    }
    
}
