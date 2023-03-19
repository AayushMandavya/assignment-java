import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        getMultiMessage();
        getInput();
        getTable();
    }
    public static int number;
    static Scanner inputObj = new Scanner(System.in);
    public static void getMultiMessage(){
        System.out.println("Multiplication Table:");
        System.out.println();
    }
    public static void getInput(){
        System.out.println("enter a number");
        number=inputObj.nextInt();
    }
    public static void getTable(){
        for (int i=1;i<=10;i++){
            System.out.println(number+"x"+i+"="+number*i);
        }
    }
}
