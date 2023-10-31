package com.app;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.util.EntityUtils;

import com.app.api.Client;
import com.app.api.Request;
import com.app.composer.Composer;

public class App {
    public static void main(String[] args) throws ClientProtocolException, IOException, InterruptedException {
        System.out.println("Hello World!");
        Composer composer = new Composer();
        composer.composer();
    }

}
