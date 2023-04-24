package Lv6;

public class Min {
    public static void main(String[] args) {
        int line = 7;
        for(int i = 1; i < line+1; i++){
            for(int j = 0; j < line - i; j++){
                System.out.print("  ");
            }
            for(int k = 0; k < i * 2 -1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
