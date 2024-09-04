package gpt;

public class Test2 {

    public static int test(int[] N){
        String str = "";
        for(int n : N)
            str += n;
        return Integer.parseInt(new StringBuffer(str).reverse().toString());
    }

    public static void main(String[] args) {
        int arr[] =  {1,2,3,0,0};
        System.out.println(test(arr));
    }
}
