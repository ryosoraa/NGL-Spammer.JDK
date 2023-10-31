package com.app.api;

import java.io.UnsupportedEncodingException;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

public class Request {
    public static HttpPost request(String username) throws UnsupportedEncodingException {

        // MENENTUKAN API TARGET
        String postUrl = "https://ngl.link/api/submit";
        HttpPost httpPost = new HttpPost(postUrl);

        // CONTENTC TYPE
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");

        // MENENTUKAN ISI MASSAGE
        String request = "username=" + username
                .concat("&question=ppppppp&deviceId=f317828d-2aaf-48c4-aa3c-4f1b7deae77e&gameSlug=&referrer=");
        StringEntity entity = new StringEntity(request);
        httpPost.setEntity(entity);

        return httpPost;
    }
}
