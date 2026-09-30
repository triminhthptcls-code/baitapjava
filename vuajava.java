import java.util.Scanner;

public class vuajava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong cua ban");
        double salary = sc.nextDouble();
        System.out.println("Nhap grade cua ban");
        String grade = sc.next();
        if (salary <= 0) {
            System.out.println("Bi vk duoi khoi nha");

        } else {
            if (grade.equals("A")) {
                double tienchovk = salary + 300;
                System.out.println("tien cho vk " + tienchovk);

            } else if (grade.equals("B")) {
                double tienchovk = salary + 250;
                System.out.println("tien cho vk " + tienchovk);
            } else {
                double tienchovk = salary + 100;
                System.out.println("tien cho vk " + tienchovk);

            }
        }
        sc.close();
    }

}
