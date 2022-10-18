package com.epam.mjc.collections.map;
import java.util.HashMap;
import java.util.Map;
public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        String[] s = sentence.replaceAll("[,.]", "").split(" ");
        for (String element : s
        ) {
            if (!element.isEmpty()) {
                int count = 1;
                if (map.get(element) != null) {
                    count = map.get(element) + 1;
                    map.put(element, count);
                } else {
                    map.put(element, count);
                }
            }
        }
        return map;
    }
}
