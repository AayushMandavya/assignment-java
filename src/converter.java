import java.util.Scanner;

public class converter {
    public static void main(String[] args){
        getrupee();
        convert();
    }
    public static float rupee;
    static Scanner inputObj=new Scanner(System.in);
    public static void getrupee(){
        System.out.println("Enter your amount in rupee");
        rupee=inputObj.nextFloat();
    }
    public static void convert(){
        System.out.println("Rs."+rupee+"is equal to"+"$"+(rupee/135.03));
    }
}
