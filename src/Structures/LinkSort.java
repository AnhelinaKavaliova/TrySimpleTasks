package Structures;

import java.util.Collections;
import java.util.LinkedList;
public class LinkSort {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("horse");
        strings.add("dog");
        strings.add("cat");

        Collections.sort(strings);

        for(String tmp : strings){
            System.out.println(tmp);
        }

    }
}
