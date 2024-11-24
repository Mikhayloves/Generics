package org.sberuniversity.CountMapImpl;

import org.sberuniversity.CountMap.CountMap;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    private final Map<T, Integer> map = new HashMap<>();


    @Override
    public void add(T t) {
        map.put(t, map.getOrDefault(t, 0) + 1);
    }

    @Override
    public int getCount(T t) {
        return map.getOrDefault(t, 0);
    }

    @Override
    public int remove(T t) {
        map.getOrDefault(t, 0);
        return map.remove(t);
    }


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        Map<T, Integer> sourceMap = source.toMap();
        for (Map.Entry<T, Integer> entry : sourceMap.entrySet()) {
            T key = entry.getKey();
            int value = entry.getValue();
            map.put(key, map.getOrDefault(key, 0) + value);
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return new HashMap<>(map);
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.putAll(map);
    }
}
