import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> al = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        fruits.add("mango");
        names.add("rahul");
        names.add("shiwangi");
        al.add(fruits);
        al.add(names);
        names.add(0, "HariRam");
        names.add(2,"vishwakarma");


        // for (String i : names) {
        //     System.out.println(i);
        // }
        // for (ArrayList<String> array : al) {
        //     for (String el : array) {
        //         System.out.println(el);
        //     }
        // }

        // Collections.reverse(names);
        System.out.println(names);
    }
}