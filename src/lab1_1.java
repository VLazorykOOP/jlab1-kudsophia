import java.util.Scanner;
public class lab1_1 {
    public static void main(String[] args) {

        System.out.println("1.double to double:");
        System.out.print("a = ");
        Scanner num1_1 = new Scanner(System.in);
        double a1 = num1_1.nextDouble();
        System.out.print("b = ");
        Scanner num1_2 = new Scanner(System.in);
        double b1 = num1_2.nextDouble();
        double res1 = (a1/(b1*b1 - 2)) + (b1/(a1*a1 + 2));
        System.out.println("Res = " + res1);

        System.out.println("2.int to double:");
        System.out.print("a = ");
        Scanner num2_1 = new Scanner(System.in);
        int a2 = num2_1.nextInt();
        System.out.print("b = ");
        Scanner num2_2 = new Scanner(System.in);
        int b2 = num2_2.nextInt();
        int res2 = (a2/(b2*b2 - 2)) + (b2/(a2*a2 + 2));
        double Res2 = res2;
        System.out.println("Res = " + Res2);

        System.out.println("3.double to int:");
        System.out.print("a = ");
        Scanner num3_1 = new Scanner(System.in);
        double a3 = num3_1.nextDouble();
        System.out.print("b = ");
        Scanner num3_2 = new Scanner(System.in);
        double b3 = num3_2.nextDouble();
        double res3 = (a3/(b3*b3 - 2)) + (b3/(a3*a3 + 2));
        int Res3 = (int) res3;
        System.out.println("Res = " + Res3);
        num1_1.close();
        num1_2.close();
        num2_1.close();
        num2_2.close();
        num3_1.close();
        num3_2.close();
    }
}
