import java.util.Scanner;
public class lab1_3 {
    static Scanner in;
    public static void main(String[] args) {
        int n = 0;
        in = new Scanner(System.in);
        System.out.print("Розмірність 2 масивів = ");
        n = in.nextInt();
        int[][] myArray1=Input(n);
        int[][] myArray2=Input(n);
        System.out.println("Вихідні масиви:\n");
        Print(myArray1);
        Print(myArray2);
    }
    static int[][] Input (int n){
        int a[][] = new int[20][20];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                System.out.print("a["+i+","+j+"]= ");
                a[i][j]=in.nextInt();
            }
        System.out.println();
        return a;
    }
    static void Print(int[][] a){
        for (int i = 0; i < a.length; ++i, System.out.println() )
            for (int j = 0; j < a[i].length; ++j)
                System.out.print(a[i][j]+"\t");
        System.out.println();
    }
}
