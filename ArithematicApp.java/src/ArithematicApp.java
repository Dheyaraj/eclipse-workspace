import java.util.Scanner;
public class ArithematicApp{
    public static void main(String[]args){
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        System.out.println("Enter base");
        float height= sc.nextFloat();
        float base= sc.nextFloat();
        float ca= 0.5f*base*height ;
    
        System.out.println("Area of is:"+ca);
    }
}
Syso
