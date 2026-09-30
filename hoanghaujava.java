import java.util.Scanner;

public class hoanghaujava {
    public static void main(String[] args) {
        Scanner soc = new Scanner(System.in);
        System.out.println("Nhap chu cai ");
        String alphabet = soc.next();
        switch (alphabet) {

            case "A", "a":
                System.out.println("Ada");
                break;
            case "B", "b":
                System.out.println("Basic");
                break;
            case "C", "c":
                System.out.println("Cobol");
                break;
            case "D", "d":
                System.out.println("dBase III");
                break;
            case "F", "f":
                System.out.println("Fortran");
            case "P", "p":
                System.out.println("Pascal");
                break;
            case "V", "v":
                System.out.println("Visual C+");
                break;
            default:
                break;
        }
        soc.close();
    }

}
