import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.print("Bitte geben Sie Ihre Namen ein : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println("Hallo, " + name + " !");
        sc.close();

    }
}