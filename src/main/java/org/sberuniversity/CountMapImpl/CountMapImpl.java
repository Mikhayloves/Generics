package org.sberuniversity.CountMapImpl;

import org.sberuniversity.CountMap.CountMap;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    Map<T, Integer> map = new HashMap<>();

    // добавляет элемент в этот контейнер.
    @Override
    public void add(T t) {
        map.put(t, map.getOrDefault(t, 0) + 1);
    }
    //Возвращает количество добавлений данного элемента
    @Override
    public int getCount(T t) {
        return map.getOrDefault(t, 0);
    }
    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    @Override
    public int remove(T t) {
        map.getOrDefault(t, 0);
        return map.remove(t);
    }

    //количество разных элементов
    @Override
    public int size() {
        return map.size();
    }

    //Добавить все элементы из source в текущий контейнер,
    // при совпадении ключей,     суммировать значения
    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> sourceMap = source.toMap();
        for (Map.Entry<T, Integer> entry : sourceMap.entrySet()) {
            T key = entry.getKey();
            int value = entry.getValue();
            map.put(key, map.getOrDefault(key, 0) + value);
        }
    }
    //Вернуть java.util.Map. ключ - добавленный элемент,
    // значение - количество его добавлений
    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<>(map);
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(map);
    }
}
