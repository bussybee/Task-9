package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class TransformList {

    public static List<Integer> uniq(List<Integer> list){
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (indexOf(output, list.get(i)) == -1) {
                output.add(list.get(i));
            }
        }
        return output;
    }

    public static int indexOf(List<Integer> list, int value){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                index = i;
            }
        }
        return index;
    }
}
