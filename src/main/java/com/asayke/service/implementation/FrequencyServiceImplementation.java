package com.asayke.service.implementation;

import com.asayke.exception.InputStringIsEmptyException;
import com.asayke.service.FrequencyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Slf4j
public class FrequencyServiceImplementation implements FrequencyService {
    @Override
    public List<Map.Entry<Character, Integer>> findCharFrequency(String string) {
        if (string.isEmpty()) throw new InputStringIsEmptyException("Input string is empty");

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> resultList = new ArrayList<>(frequencyMap.entrySet());
        resultList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        log.info("The frequency of characters for the {} is found", string);

        return resultList;
    }
}