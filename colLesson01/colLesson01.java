package Function.colLesson01;

import java.util.Scanner;

public class colLesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = new String[10];

        String str = scanner.nextLine();
        String[] text = str.split(" ");
        for(int i = 0; i < text.length; i++){
            System.out.println(text[i]);
        }
}
