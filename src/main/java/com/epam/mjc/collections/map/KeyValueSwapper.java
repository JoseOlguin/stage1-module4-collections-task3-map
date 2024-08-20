package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String, Integer> swappedMap = new HashMap<>();

        sourceMap.forEach(
            (sourceKey, sourceValue) -> {
                Integer swappedValue = swappedMap.get(sourceValue);
                if (swappedValue == null || sourceKey < swappedValue) {
                    swappedMap.put(sourceValue, sourceKey);
                }
            }
        );

        return swappedMap;
    }
}
