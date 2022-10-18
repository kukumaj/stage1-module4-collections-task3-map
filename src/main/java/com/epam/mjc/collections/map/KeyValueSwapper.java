package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()
        ) {
            if (map.containsKey(entry.getKey())) {
                for (Map.Entry<String, Integer> entry2 : map.entrySet()
                ) {
                    if (entry.getValue().equals(entry2.getKey())) {
                        if (entry.getKey() <= entry2.getValue()) {
                            map.put(entry.getValue(), entry2.getValue());

                        } else {
                            map.put(entry.getValue(), entry.getKey());
                        }
                    }
                }
            } else {
                map.put(entry.getValue(), entry.getKey());
            }
        }
        return map;
    }
}
