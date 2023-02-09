import java.util.Scanner;
public class LabFirst {
    public static void main(String[] args){
        System.out.println("Task1:");
        System.out.print("a = ");
        Scanner a = new Scanner(System.in);
        double num1 = a.nextDouble();
        System.out.print("b = ");
        Scanner b = new Scanner(System.in);
        double num2 = b.nextDouble();
        double res = num1 + num2;
        System.out.print(res);
    }
}
