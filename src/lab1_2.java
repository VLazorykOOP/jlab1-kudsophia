import java.util.Scanner;
import java.util.Arrays;
public class lab1_2 {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] myArray = Input();
        System.out.println("Вихідний масив: ");
        int length_1 = myArray.length;
        Print(myArray, length_1);

        Arrays.sort(myArray);
        int length_2 = myArray.length;
        length_2 = withoutRepetition(myArray,length_2);

        System.out.println("Змінений массив: ");
        for (int i=0; i<length_2; i++)
            System.out.print(myArray[i]+" ");

        int max = myArray[length_2-1];
        System.out.print("Максимальне значення = "+max);

}
    static int [] Input(){
        System.out.print("Розмірність масиву= ");
        int n = in.nextInt();
        int[] a = new int[400];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }
        return a;
    }
    static void Print(int[] a, int n) {
        for (int i = 0; i < n; ++i){
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
