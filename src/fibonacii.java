import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args){
        getNumber();
        getFibo();
    }
    public static int a=0;
    public static int b =1;
    public static int number;
    public static int sum;
    static Scanner inputObj=new Scanner(System.in);

    public static void getNumber(){
        System.out.println("enter number");
        number=inputObj.nextInt();
    }

    public static void getFibo(){
        System.out.println(a+","+b);
        sum=a+b;
        for (int i=0;i<number-2;i++){
            System.out.println(","+sum);
            a=a+b;
            b=sum;
            sum=a+b;
        }
    }
}
