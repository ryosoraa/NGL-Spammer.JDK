package com.app.service;

public class Types {

    public String type(int choise, String username, String message) {

        String request;

        switch (choise) {
            case 1:
                return "username=" + username
                        .concat("&question=" +
                                message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=&referrer="));
            case 2:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=confessions&referrer="));
            case 3:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=3words&referrer="));
            case 4:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=wfriendship&referrer="));
            case 5:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=tbh&referrer="));
            case 6:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=shipme&referrer="));
            case 7:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=yourcrush&referrer="));
            case 8:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=cancelled&referrer="));
            case 9:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=dealbreaker&referrer="));
            case 10:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=confessions&referrer="));
            default:
                break;
        }
        return null;
    }
}
