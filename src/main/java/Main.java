import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();

        try {
            int a1 = Integer.parseInt(a);
        }
        catch (Exception E){
            System.out.println("Not valid");
        }

        b = scanner.nextLine();
        try {
            int b1 = Integer.parseInt(b);
        }
        catch (Exception E){
            System.out.println("Not valid");
        }

        c = scanner.nextLine();

        try {
            int c1 = Integer.parseInt(c);
        }
        catch (Exception E){
            System.out.println("Not valid");
        }



    }
}