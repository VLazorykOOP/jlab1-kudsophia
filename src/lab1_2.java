import java.util.Scanner;
import java.util.Arrays;
public class lab1_2 {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] myArray = Input();
        System.out.println("Вихідний масив:");
        Print(myArray);

        Arrays.sort(myArray);
        int length = myArray.length;
        length = withoutRepetition(myArray,length);

        System.out.println("Змінений массив:");
        for (int i=0; i<length; i++)
            System.out.print(myArray[i]+" ");
}
    static int [] Input(){
        System.out.print("Розмірність масиву= ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }
        return a;
    }
    static void Print(int[] a) {
        for (int i = 0; i < a.length; ++i){
            System.out.print(a[i]+" ");
        }
    }
    public static int withoutRepetition(int[] a, int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (a[i] != a[i+1]){
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            a[i] = temp[i];
        }
        return j;
    }
}
