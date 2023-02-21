import java.util.Scanner;
import java.io.*;
public class lab1_4 {
    public static int countOccurencies(String text, char symbol) {
        int lastIndex = 0; //
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = text.indexOf(symbol, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст: ");
        String text = in.nextLine();
        String[] words = text.split(" ");
        System.out.println("Введіть символ або букву: ");
        //String symbol = in.nextLine();
        Scanner sc = new Scanner(System.in);
        char symbol = sc.next().charAt(0);
        System.out.println("З тексту: " + text + "\nсимвол '" + symbol + "' найбільшу кількість разів мають слова:\n");

        int maxCount = 0;
        for (int i = 0; i < words.length; i++) {
            int count = countOccurencies(words[i], symbol);
            if (count > maxCount) {
                maxCount = count;
            }
        }
        //System.out.println(maxCount);

        for (int i = 0; i < words.length; i++) {
            int count = countOccurencies(words[i], symbol);
            if (count == maxCount) {
                System.out.println(words[i]);
            }
        }
    }
}
