package com.asayke.service;

import java.util.List;
import java.util.Map;

public interface FrequencyService {
    List<Map.Entry<Character, Integer>> findCharFrequency(String string);
}