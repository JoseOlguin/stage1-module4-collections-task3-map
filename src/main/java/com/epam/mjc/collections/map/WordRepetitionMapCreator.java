package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> repetitionMap = new HashMap<>();

        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " .,");
        while (stringTokenizer.hasMoreTokens()) {
            String key = stringTokenizer.nextToken().toLowerCase();
            repetitionMap.compute(key, (k, v) -> v == null ? 1 : v + 1);
        }

        return repetitionMap;
    }
}
