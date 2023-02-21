import java.util.Scanner;
import java.io.*;
public class lab1_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть текст: ");
        String text = in.nextLine();
        String[] words = text.split(" ,.:;-?!+");
        System.out.println("Введіть символ або букву: ");
        String symbol = in.nextLine();
        System.out.println("З тексту: "+text+"\nсимвол '"+symbol+"' найбільшу кількість разів мають слова:\n");

        int count = 0;
        for (int i=0; i<words.length; i++) {
            String word = words[i];
            if (word.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println(count);
        }
}
