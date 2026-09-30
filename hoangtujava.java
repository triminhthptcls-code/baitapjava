import java.util.Scanner;

public class hoangtujava {
    public static void main(String[] args) {
        // Bài 1
        // public static void main(String[] args) {
        // for (int i = 100; i > 5; i -= 5) {
        // System.out.println(i);

        // }
        // }
        // }
        // Bài 2:
        // int sum = 0;
        // Scanner st = new Scanner(System.in);
        // System.out.println("Nhap so a");
        // int a = st.nextInt();
        // System.out.println("Nhap so b");
        // int b = st.nextInt();
        // for (int i = a; i <= b; i++) {
        // if (i % 2 != 0) {
        // sum = sum + i;

        // }

        // }
        // System.out.println("Tong" + sum);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}