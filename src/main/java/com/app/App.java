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

public class App {
    public static void main(String[] args) throws ClientProtocolException, IOException {

        HttpPost httpPost = new HttpPost(postUrl);

        HttpPost post = Request.request();
        HttpResponse httpResponse = Client.httpClient.execute(post);
        System.out.println("Hello World!");

        // MENGADAHI RESPONES
        HttpEntity responseEntity = httpResponse.getEntity();
        String response = EntityUtils.toString(responseEntity);

        // Print the response
        System.out.println(response);

        final String api = "https://ngl.link/api/submit";
    }

}
