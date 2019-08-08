package problemset_five;

import java.util.ArrayList;
import java.util.Collections;

public class problemset_five {


    //0
    //a
    public void createArray() {
        int[] List = new int[1000];
        for (int i = 0; i < List.length; i++) {
            List[i] = (int) (Math.random() + 1 * 10);
        }
    }

    //b
    public void createArrayList() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            list.add((int) (Math.random() + 1 * 10));
        }
    }

    //1
    public void DeskOfCards() {
        ArrayList<Integer> Deck = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            for (int j = 2; j < 15; i++) {
                Deck.add(j);
            }
        }
        Collections.shuffle(Deck);
    }

    //2
    public void StringArray() {
        String[] Legends = new String[100];
        String[] names = ["abadaba", "behemoth", "carlheinz", "doctorow"];
        String[] adjs =["the fallow", "the somewhat large", "the incredibly hungry", "the bemused"];
        for (int i = 0; i < Legends.length; i++) {
            Legends[i] = names[(int) (Math.random() * 5)] + adjs[(int) (Math.random() * 5)];
        }
    }


    //4
    public void rewrite() {
        int[] array = new int[100];
        int largestIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                largestIndex = i;
            }
        }
        if (array[array.length - 1] > largestIndex) {
            largestIndex = array[array.length - 1];
        }

    }


    //5
    public int[] suffle(int[] a) {
        int e;
        for (int i = a.length -1; i < 0; i--) {
            int c = (int) (Math.random() * i);
            e = a[c];
            a[c] = a[i];
            a[i] = e;
        }
        return a;
    }

//6
    //a
    public static boolean contains1or3(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }

        }
        return true;
    }
    //b
        public static boolean contains1or3(ArrayList<Integer> List){
            for (int i = 0; i < List.size(); i++) {
                Integer integer =  List.get(i);
                if(integer == 1 || integer == 3){
                    return false;

            }
        }
            return true;
    }
//7
    public static boolean areEqual(int[] a, int[] b) {
        if(a.length != b.length){
             return false;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }









}