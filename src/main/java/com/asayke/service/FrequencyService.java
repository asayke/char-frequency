package com.asayke.service;

import java.util.Map;

public interface FrequencyService {
    Map<Character, Integer> findCharFrequency(String string);
}