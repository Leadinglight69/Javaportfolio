package Datenstruckturen;

import java.util.HashMap;
import java.util.Scanner;

public class woerterbuchx2 {

    static boolean stop = false;

    private static final HashMap<String, String> dictionaryEnglish = new HashMap<>();

    private static final HashMap<String, String> dictionaryGerman = new HashMap<>();

    private static int buffer;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int user3 = 0;
        //Englisch
        initEnglishDictionary(dictionaryEnglish);
        //Deutsch
        initGermanDicrtionary(dictionaryGerman);

        while (!stop) {
            System.out.println("Wähle die Sprache von nach \n" + "1 English => German | 2 German => English | 3 Einfügen | 4 Exit/Stop/Stopp");
            try {
                user3 = Integer.parseInt(input.nextLine());
                buffer = user3;
                switch (user3) {
                    case 1:
                        while (!stop) {
                            startDictionary(input, dictionaryEnglish);
                        }
                        stop = false;
                        break;
                    case 2:
                        while (!stop) {
                            startDictionary(input, dictionaryGerman);
                        }
                        stop = false;
                        break;
                    case 3:
                        addWords(input, dictionaryEnglish, dictionaryGerman);
                        break;
                    case 4:
                        stop = true;
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Hier nur nummern | Only Numbers");
            }
        }
    }

    private static void initGermanDicrtionary(HashMap<String, String> dictionaryGerman) {
        dictionaryGerman.put("Österreich", "austria");
        dictionaryGerman.put("Hello", "Hallo");
        dictionaryGerman.put("World", "Weld");
        dictionaryGerman.put("Sinking", "Untergang");
        dictionaryGerman.put("die", "sterben");
        dictionaryGerman.put("Stone", "Stein");
        dictionaryGerman.put("Ocean", "Ozean");
        dictionaryGerman.put("the", "der,die,das");
        dictionaryGerman.put("Rock", "Felsen");
    }

    private static void initEnglishDictionary(HashMap<String, String> dictionaryEnglish) {
        dictionaryEnglish.put("Austria", "Österreich");
        dictionaryEnglish.put("Hallo", "Hello");
        dictionaryEnglish.put("Weld", "World");
        dictionaryEnglish.put("Untergang", "Sinking");
        dictionaryEnglish.put("sterben", "die");
        dictionaryEnglish.put("Stein", "Stone");
        dictionaryEnglish.put("Ozean", "Ocean");
        dictionaryEnglish.put("die", "the");
        dictionaryEnglish.put("Rock", "Felsen");
    }

    private static void startDictionary(Scanner input, HashMap<String, String> dictionary) {
        System.out.println("Was willst du (1 suchen | 2 löschen | 3 Alles Ausgeben | 4 Zurück) ");
        try {
            int user3 = Integer.parseInt(input.nextLine());
            switch (user3) {
                case 1:
                    search(input, dictionary);
                    break;

                case 2:
                    delete(input, dictionaryEnglish, dictionaryGerman);
                    break;
                case 3:
                    System.out.println(dictionary);
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("Computer sagt nein");
                    break;
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Hier nur Nummern | Only Numbers");
        }
    }

    private static void delete(Scanner input, HashMap<String, String> dictionaryENG, HashMap<String, String> dictionaryGER) {
        String userinput;
        String translation;
        System.out.println("gib ein Wort ein");
        userinput = input.nextLine();
        switch (buffer) {
            case 1:
                translation = dictionaryENG.get(userinput);
                if (translation != null && dictionaryGER.remove(translation, userinput)) {
                    dictionaryENG.remove(userinput, translation);
                    System.out.println(dictionaryENG);
                }
                break;
            case 2:
                translation = dictionaryGER.get(userinput);
                if (translation != null && dictionaryENG.remove(translation, userinput)) {
                    dictionaryGER.remove(userinput, translation);
                    System.out.println(dictionaryGER);
                }
                break;
        }
    }

    private static void addWords(Scanner input, HashMap<String, String> dictionaryEnglish, HashMap<String, String> dictionaryGerman) {
        String user2;
        String user;
        System.out.println("gib das englische Wort ein");
        user = input.nextLine();
        System.out.println("gib das deutsche ein");
        user2 = input.nextLine();
        dictionaryEnglish.put(user, user2);
        dictionaryGerman.put(user2, user);
    }

    private static void search(Scanner input, HashMap<String, String> dictionary) {
        String user;
        System.out.println("Gib ein Wort |" + " Tip a Word");
        user = input.nextLine();

        if (dictionary.containsKey(user)) {
            System.out.println(user + " = " + dictionary.get(user));
        } else {
            System.out.println("Dieses Wort kenne ich nicht");
            System.out.println("don't know that word");
            System.out.println();
        }
    }
}
