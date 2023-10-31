package com.app.assets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuestionsAssets {
    public List<String> questions() throws IOException {

        List<String> questions = new ArrayList<>();
        String path = "src/main/java/com/app/json/question.json";

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File(path);

        JsonNode json = objectMapper.readTree(file);

        for (JsonNode quest : json) {
            questions.add(quest.asText().replace(" ", "+"));
        }

        return questions;
    }
}

