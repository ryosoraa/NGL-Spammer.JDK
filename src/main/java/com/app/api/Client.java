package com.app.api;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class Client {
    public HttpClient httpClient = HttpClientBuilder.create().build();

}