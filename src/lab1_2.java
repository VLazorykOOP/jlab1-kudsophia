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

    public static int[] noRepeat2(int[] a){
        int n = a.length;
        int[] duplicates = new int[n];
        int[] res = new int[n];
        int k = 0;
        for (int i=0; i<n; i++){
            int found = 0;
            for (int j=i+1; j<n; j++) {
                if (a[i] == a[j]) {
                    found++;
                }
            }
            if (found > 0) {
                duplicates[k++] = a[i];
            }
        }

        k = 0;
        for (int i=0; i<n; i++){
            if (!inArray(duplicates, a[i])) {
                res[k++] = a[i];
            }
        }

        return res;
    }

    static boolean inArray(int[] a, int t) {
        for (int i = 0; i < a.length; i++){
            if (t == a[i]) {
                return true;
            }
        }
        return false;
    }

    static int maxElement(int[] a) { //вихідний масив
        int max = a[0];
        for (int i = 0; i < a.length; i++){
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        int[] myArray = Input();
        System.out.println("Вихідний масив: ");
        int length_1 = myArray.length;
        Print(myArray, length_1);

        //----
        int[] aa = noRepeat2(myArray);
        for (int i=0; i<aa.length; i++) {
            System.out.print(aa[i]+" ");
        }
        int max = maxElement(aa);
        System.out.print("Max = " + max);
        //----

        Arrays.sort(myArray); //сортує за зростанням
        int length_2 = myArray.length;
        length_2 = noRepeat(myArray,length_2); //довжина нового масива

        System.out.println("Змінений массив: ");
        for (int i=0; i<length_2; i++)
            System.out.print(myArray[i]+" ");

        //int max = myArray[length_2-1];
        //System.out.print("Максимальне значення = "+max);

    }
}
