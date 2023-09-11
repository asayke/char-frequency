package com.asayke.service.implementation;

import com.asayke.service.FrequencyService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class FrequencyServiceImplementation implements FrequencyService {
    @Override
    public Map<Character, Integer> findCharFrequency(String string) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
            sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        }

        return frequencyMap;
    }
}