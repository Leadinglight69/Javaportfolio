package Datenstruckturen;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

public class bublesortlist {

        public static void main(String[] args) {

            Random random = new Random();
            ArrayList<Integer> usedNumber = new ArrayList<>();
            int temp;
            int lenght = 10;

            for (int i = 0; i < lenght; i++) {
                do {
                    temp = random.nextInt(lenght *69 );
                }
                while (usedNumber.contains(temp));
                usedNumber.add(temp);
            }
            // zeit in milisecunden
            long startTime = System.currentTimeMillis();
            Instant start = Instant.now();

            // sotieren startet hier
            for (int i = 0; i < lenght - 1; i++) {
                for (int j = 1; j < lenght; j++) {
                    temp = usedNumber.get(j);
                    int check = j - 1;

                    if (usedNumber.get(check) > temp) {
                        usedNumber.set(j, usedNumber.get(check));
                        usedNumber.set(check, temp);
                    }
                }
            }
            System.out.println(usedNumber);
            // aktuelle zeit - startzeit = zeit die benoetigt wurde
            System.out.println("Sotiert in: " + (System.currentTimeMillis() - startTime) + "ms!");
            Instant ende = Instant.now();

            Duration dauer = Duration.between(start,ende);
            System.out.println("Die sotierung dauerte " + dauer.getSeconds() + " Sekunden");
        }
    }

