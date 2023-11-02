package codeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class Line {

    public static String WhoIsNext(String[] names, int n) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(names));
        int position = n;
        position -= 1;
        int len = names.length;
        while (position >= len) {
            int num = position - len;
            position = (int) Math.floor(num / 2);
        }
        return names[position];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"Name::Sheldon", "Name::Leonard", "Name::Penny", "Name::Rajesh", "Name::Howard"};
        for (int i = 1; i < 2000; i++) {
            System.out.println(WhoIsNext(names, i) + "      ->    " + i);
        }
        System.out.println(WhoIsNext(names, 52));
    }
}
// pos % 10 == 0 ? names.get(4) : pos % 10 > 5 ? names.get(((position % 10) / 2) - 1) : names.get((position % 10) - 1);
/*
* Sheldon, Leonard, Penny, Rajesh and Howard are in the queue
*  for a "Double Cola" drink vending machine; there are no other
*  people in the queue. The first one in the queue (Sheldon) buys a can,
*  drinks it and doubles! The resulting two Sheldons go to the end of the queue.
*  Then the next in the queue (Leonard) buys a can, drinks it and gets to the end
* of the queue as two Leonards, and so on.

For example, Penny drinks the third can of cola and the queue will look like this:

Rajesh, Howard, Sheldon, Sheldon, Leonard, Leonard, Penny, Penny
Write a program that will return the name of the person who will drink the n-th cola.

Input:
The input data consist of an array which contains at least 1 name, and single integer
*  n which may go as high as the biggest number your language of choice supports
*  (if there's such limit, of course).

Output / Examples:
Return the single line — the name of the person who drinks the n-th can of cola.
*  The cans are numbered starting from 1.

let names = &vec![Name::Sheldon, Name::Leonard, Name::Penny, Name::Rajesh, Name::Howard];
assert_eq!(who_is_next(names, 1), Name::Sheldon);
assert_eq!(who_is_next(names, 6), Name::Sheldon);
assert_eq!(who_is_next(names, 52), Name::Penny);
assert_eq!(who_is_next(names, 7230702951), Name::Leonard);
* */

//    public static String WhoIsNext(String[] names, int n) {
//        ArrayList<String> arr = new ArrayList<>(Arrays.asList(names));
//        int position = n;
//        if (position == 0) {
//            return arr.get(position);
//        }
//        if (position <= 5) {
//            return arr.get(position - 1);
//        } else {
//            position -= 5;
//            if (position % 10 == 0) {
//                return arr.get(4);
//            } else {
//                position %= 10;
//                position = (int) Math.ceil((double) position / 2);
//                return arr.get(position - 1);
//            }
//        }
//    }
