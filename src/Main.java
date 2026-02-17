//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = getstringinput(sc, "What is your name?");
        String greeting = getstringinput(sc, "What is your prefered greeting ?");


        sc.close();
        System.out.println(greeting + "," + name);
    }

    public static String getstringinput(Scanner sc, String prompt) {
        System.out.print(prompt + " ");
        return sc.nextLine();
    }
}
