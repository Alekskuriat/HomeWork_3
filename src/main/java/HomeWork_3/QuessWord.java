package HomeWork_3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class QuessWord {

    public static void main(String[] args) {

    int hiddenWord, checkBoundary, maxLength = 0;
    char letterRiddle = 0,  letterUser = 0;
    String userWord;

    String[] words = {"apple", "orange", "lemon", "banana",
            "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};

    for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength)
                maxLength = words[i].length();
        }


    char[] symbols = new char[maxLength];
        for (int i = 0; i < maxLength ; i++) {
            symbols[i] = 35;
        }

    hiddenWord = (int)(Math.random() * words.length);

    Scanner sc = new Scanner(System.in);
    System.out.print("Введите слово: ");
    userWord = sc.nextLine().toLowerCase(Locale.ROOT);

    while(true) {

        checkBoundary = (words[hiddenWord].length() < userWord.length()) ?
                words[hiddenWord].length() : userWord.length();

        for (int i = 0; i < checkBoundary; i++) {
            if (words[hiddenWord].length() > i) {
                letterRiddle = words[hiddenWord].charAt(i);
            }
            letterUser = userWord.charAt(i);
            if (letterRiddle == letterUser)
                symbols[i] = letterUser;
        }

        System.out.println(Arrays.toString(symbols));

        if (words[hiddenWord].equals(userWord)) {
            System.out.println("Поздравляю, вы угадали!");
            break;
        }

        System.out.print("Неугадали, попробуйте еще раз: ");
        userWord = sc.nextLine().toLowerCase(Locale.ROOT);


        }
    }






}
