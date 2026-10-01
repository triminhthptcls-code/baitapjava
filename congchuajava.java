import java.util.Scanner;

public class congchuajava {
    public static void main(String[] args) {
        // Bài 1
        Scanner st2 = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban");
        int age = st2.nextInt();
        st2.nextLine();
        System.out.println("Nhap ten cua ban");
        String name = st2.nextLine();
        for (int i = 0; i <= age; i++) {
            System.out.println(name);
        }
        // Bài 2
        // for (int i = 1; i <= 9; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        // Bài 3
        // Scanner st2 = new Scanner(System.in);
        // System.out.println("Nhap so cua ban");
        // int a = st2.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // int j = i * a;
        // System.out.println(a + " x " + i + " = " + j);
        // }
        // }

    }
}