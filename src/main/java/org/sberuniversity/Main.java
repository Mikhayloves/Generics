package org.sberuniversity;

import org.sberuniversity.CountMap.CountMap;
import org.sberuniversity.CountMapImpl.CountMapImpl;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(5);
        map.add(5);
        map.add(4);



        System.out.println("Количество добавлений элемента 5: " + map.getCount(5));
        System.out.println("Количество добавлений элемента 6: " + map.getCount(6));
        System.out.println("Количество добавлений элемента 10: " + map.getCount(10));

        System.out.println("Количество разных элементов: " + map.size());
        System.out.println("Количство повторений элемента до удаления: " + map.remove(5));
        System.out.println("Количество разных элементов " + map.size());

        map.addAll(map);
        Map<Integer, Integer> toMapCheckMap = map.toMap();
        System.out.println(toMapCheckMap);
        Map<Integer, Integer> toCheckMap = new HashMap<>();
        map.toMap(toCheckMap);
        System.out.println(toCheckMap);
    }
}