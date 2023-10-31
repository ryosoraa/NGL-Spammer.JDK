package com.app.service;

public class Types {

    public String type(String username, int choise, String message, String deviceID) {

        switch (choise)

        {
            case 1:
                return "username=" + username
                        .concat("&question=" +
                                message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=&referrer=")));
            case 2:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=confessions&referrer=")));
            case 3:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=3words&referrer=")));
            case 4:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=wfriendship&referrer=")));
            case 5:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=tbh&referrer=")));
            case 6:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=shipme&referrer=")));
            case 7:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=yourcrush&referrer=")));
            case 8:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=cancelled&referrer=")));
            case 9:
                return "username=" + username
                        .concat(
                                "&question=" + message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=dealbreaker&referrer=")));
            default:
                return "username=" + username
                        .concat("&question=" +
                                message
                                        .concat("&deviceId=" + deviceID.concat("&gameSlug=&referrer=")));
        }
    }
}
