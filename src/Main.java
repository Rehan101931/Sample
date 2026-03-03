import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X value");
        double x = sc.nextDouble();

        System.out.print("Enter Y value");
        double y = sc.nextDouble();
        boolean inEitherRectangle =
                Rectangle.LARGER.contains(x, y) || Rectangle.SMALLER.contains(x, y);

        boolean inEitherCircle =
                CircleFeature.Large.contains(x, y) || CircleFeature.Small.contains(x, y);

        boolean inShadedArea = inEitherRectangle && !inEitherCircle;

        if (inShadedArea) {
            System.out.println("The point(" + x + "," + y + ") is in the shaded area");
        } else {
            System.out.println("The point(" + x + "," + y + ") is not in the shaded area");
        }

        sc.close();
    }
}