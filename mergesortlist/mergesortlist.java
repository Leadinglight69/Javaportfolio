package Datenstruckturen;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class mergesortlist {

    public static void main(String[] args) {
        Random random = new Random(1);
        long startTime;
        ArrayList<Integer> list = new ArrayList<>();
        int temp;
        int lenght = 4200000;


        Instant start = Instant.now();
        startTime = System.currentTimeMillis();

        //erstellt zufaelige nummern
        for (int i = 0; i < lenght; i++) {
            do {
                temp = random.nextInt(0, lenght * 10);
            }
            while (list.contains(temp));
            list.add(temp);
        }


        mergeSort(list);

        System.out.println(list);
        System.out.println("Sotierung dauerte : " + (System.currentTimeMillis() - startTime) + "ms!");
        Instant ende = Instant.now();
        Duration dauer = Duration.between(start,ende);
        System.out.println("Die sotierung dauerte " + dauer.getSeconds() + " Sekunden");
    }

    public static void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }

        int mid = list.size() / 2;

        ArrayList<Integer> left = new ArrayList<>(mid);
        ArrayList<Integer> right = new ArrayList<>(list.size()-mid);
        for (int i = 0; i < list.size(); i++) {
            if (i < mid) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        // Teilt beide Arrays auf bis die Größe 1 geteilt sind !
        mergeSort(left);
        mergeSort(right);
        // Führt die liste von Links und Rechts in der richtigen Reihenfolge zusammen!!
        merge(list, left, right);
    }
    public static void merge(ArrayList<Integer> arr, ArrayList<Integer> left, ArrayList<Integer> right) {
        // Ganzzahlen, um den richtigen Wert aus jedem Array auszuwählen!
        int checkIndex = 0, checkL = 0, checkR = 0;
        // Vergleicht die Werte in beiden Arrays und platziert sie an der richtigen Position!
        while (checkL < left.size() && checkR < right.size()) {
            // geht von der kleinsten zur groesten nummer!
            if (left.get(checkL) < right.get(checkR)) {
                arr.set(checkIndex, left.get(checkL));
                checkL++;
            } else {
                arr.set(checkIndex, right.get(checkR));
                checkR++;
            }
            checkIndex++;
        }
        // Wenn nur das linke Array übrig ist wird es drangehaengt
        while (checkL < left.size()) {
            arr.set(checkIndex, left.get(checkL));
            checkIndex++;
            checkL++;
        }
        // gleiche fuer rechts bis kein arraz mehr uebrig ist
        while (checkR < right.size()) {
            arr.set(checkIndex, right.get(checkR));
            checkIndex++;
            checkR++;
        }
    }
}
