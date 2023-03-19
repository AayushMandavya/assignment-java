
public class question5 {
    static int[] a={0,2,1,5,3,4};
    static int ans[]=new int[a.length];
    public static void main(String[] args){
        getAns();
        Result();
    }
    public static void getAns(){
        for(int i=0;i< a.length;i++){
            ans[i]=a[a[i]];
        }
    }
    public static void Result(){
        for (int element:ans){
            System.out.println(element+"");
        }
    }
}
