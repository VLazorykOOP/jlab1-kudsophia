import java.util.Scanner;
public class lab1_1 {
    public static void main(String[] args) {
        System.out.print("a = ");
        Scanner num1 = new Scanner(System.in);
        double a = num1.nextDouble();
        System.out.print("b = ");
        Scanner num2 = new Scanner(System.in);
        double b = num2.nextDouble();
        double res = (a/(b*b - 2)) + (b/(a*a + 2));
        System.out.print("Res = " + res);

    }
}
