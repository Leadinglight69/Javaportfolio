package DoubleLinkedList;


public class Main {
    public static void main(String[] args) {
        List<String> list = new List<>("Darksouls", "Doom");

        list.push(String.valueOf(420));
        list.append("Pokemon");
        list.add(2, "Zelda"); // if Index is too high  value gets Appended to the end!
        list.add(3, "AnimalCrossing");
        list.add(33, "StardewValley");
        list.add(666, "CSGO");
        list.append("AmongUS");
        list.push(String.valueOf(42));

        System.out.println("-----START-----");
        list.printList();
        System.out.println("\nDie Liste enthaelt: " + list.size() + " Nodes!\n");
        list.printListReverse();

        System.out.println("\nList Getter Below!");
        System.out.println(list.seekList(0));
        System.out.println(list.seekListReverse(0));
    }
}
