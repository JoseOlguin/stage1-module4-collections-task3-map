package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (Map.Entry<Integer, Integer> entry : functionMap.entrySet()) {
            if (requiredValue == entry.getValue()) {
                return true;
            }
        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer, Integer> functionMap = new HashMap<>();
        sourceList.forEach(listValue -> functionMap.put(listValue, 5 * listValue + 2 ));
        return functionMap;
    }
}
