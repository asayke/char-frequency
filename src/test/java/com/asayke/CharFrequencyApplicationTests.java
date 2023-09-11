package com.asayke;

import com.asayke.exception.InputStringIsEmptyException;
import com.asayke.service.FrequencyService;
import com.asayke.service.implementation.FrequencyServiceImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class CharFrequencyApplicationTests {
    private FrequencyService frequencyService;

    @BeforeEach
    void setUp() {
        frequencyService = new FrequencyServiceImplementation();
    }

    @Test
    void referenceExample() {
        List<Map.Entry<Character, Integer>> foundCharFrequency = frequencyService.findCharFrequency("aaaaabcccc");

        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        charFrequency.put('a', 5);
        charFrequency.put('c', 4);
        charFrequency.put('b', 1);

        Assertions.assertEquals(foundCharFrequency, new ArrayList<>(charFrequency.entrySet()));
    }

    @Test
    void test2() {
        List<Map.Entry<Character, Integer>> foundCharFrequency = frequencyService.findCharFrequency("za");

        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        charFrequency.put('a', 1);
        charFrequency.put('z', 1);

        Assertions.assertEquals(foundCharFrequency, new ArrayList<>(charFrequency.entrySet()));
    }

    @Test
    void test3() {
        List<Map.Entry<Character, Integer>> foundCharFrequency = frequencyService.findCharFrequency("0");

        Map<Character, Integer> charFrequency = new LinkedHashMap<>();
        charFrequency.put('0', 1);

        Assertions.assertEquals(foundCharFrequency, new ArrayList<>(charFrequency.entrySet()));
    }

    @Test
    void test4() {
        Assertions.assertThrows(InputStringIsEmptyException.class, () -> frequencyService.findCharFrequency(""));
    }
}