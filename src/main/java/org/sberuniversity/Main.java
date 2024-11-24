package org.sberuniversity;

import org.sberuniversity.countmap.CountMap;
import org.sberuniversity.countmapImpl.CountMapImpl;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(5);
        map.add(5);

        System.out.println("Количество добавлений элемента 5: " + map.getCount(5));
        System.out.println("Количество добавлений элемента 6: " + map.getCount(6));
        System.out.println("Количество добавлений элемента 10: " + map.getCount(10));

        System.out.println("Количество разных элементов: " + map.size());
    }
}