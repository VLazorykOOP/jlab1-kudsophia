import java.util.Scanner;
import java.util.Arrays;
public class lab1_2 {
    static Scanner in;
    static int [] Input(){ //початковий ввід
        System.out.print("Розмірність масиву: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "]= ");
            a[i] = in.nextInt();
        }
        return a;
    }
    static void Print(int[] a, int n) { //вихідний масив
        for (int i = 0; i < n; ++i){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int noRepeat(int[] a, int n){
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
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] myArray = Input();
        System.out.println("Вихідний масив: ");
        int length_1 = myArray.length;
        Print(myArray, length_1);

        Arrays.sort(myArray); //сортує за зростанням
        int length_2 = myArray.length;
        length_2 = noRepeat(myArray,length_2); //довжина нового масива

        System.out.println("Змінений массив: ");
        for (int i=0; i<length_2; i++)
            System.out.print(myArray[i]+" ");

        int max = myArray[length_2-1];
        System.out.print("Максимальне значення = "+max);

    }
}
