import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();
        int x = name.indexOf(" ");
        x++;
        System.out.println(x);
        char first_letter = name.charAt(0);
        char second_letter = name.charAt(x);
        System.out.println(first_letter + " . " + second_letter);

    }
}