package com.asayke.controller;

import com.asayke.dto.StringDTO;
import com.asayke.service.FrequencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "/string/")
@RequiredArgsConstructor
public class FrequencyController {
    private final FrequencyService frequencyService;

    @PostMapping(value = "/find-frequency")
    public ResponseEntity<Map<Character, Integer>> findCharFrequency(@RequestBody StringDTO stringDTO) {
        return ResponseEntity.ok(frequencyService.findCharFrequency(stringDTO.getString()));
    }
}