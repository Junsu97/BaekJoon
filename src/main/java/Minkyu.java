public class Minkyu {
    public static void main(String[] args) {
        for (int j = 0; j < 13; j++) {
            if (j<7){
                for (int i = 0; i < 1+j; i++) {
                    System.out.printf("*");
                }
                System.out.println();
            }else {
                for (int i = 0; i < 6 - i; i++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
