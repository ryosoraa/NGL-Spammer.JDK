package com.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randoms {

    public List<String> random(String username, String message, int total) {
        Random random = new Random();
        List<String> randomChoise = new ArrayList<>();
        String type[] = { "",
                "confessions",
                "3words",
                "wfriendship",
                "tbh",
                "shipme",
                "yourcrush",
                "cancelled",
                "dealbreaker",
                "confessions" };

        while (1 <= total) {

            randomChoise.add("username=" + username
                    .concat("&question=" +
                            message
                                    .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug="
                                            + type[random.nextInt(9)].concat("&referrer="))));

            total--;
        }

        return randomChoise;

    }
}
