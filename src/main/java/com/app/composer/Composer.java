package com.app.composer;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;

import com.app.api.Client;
import com.app.api.Request;
import com.app.assets.DeviceIdAssets;
import com.app.assets.QuestionsAssets;
import com.app.interfaces.Menu;
import com.app.service.Randoms;
import com.app.service.Types;

public class Composer {

    public void composer() throws IOException, InterruptedException {
        Menu menu = new Menu();
        Types types = new Types();
        Client client = new Client();
        Request request = new Request();
        QuestionsAssets questionsAssets = new QuestionsAssets();
        DeviceIdAssets deviceIdAssets = new DeviceIdAssets();
        Randoms randoms = new Randoms();
        Random random = new Random();
        Random randomDevice = new Random();
        int mes = 1;

        List<String> choise = menu.menus(); // pilihan
        List<String> requestList = new ArrayList<>(); // request tinggal mengolah
        List<HttpPost> httpPosts = new ArrayList<>(); // results http post
        List<HttpResponse> httpResponses = new ArrayList<>(); // kumpulan respons

        for (int i = 0; i < Integer.parseInt(choise.get(2)); i++) {
            requestList.add(types.type(choise.get(0),
                    Integer.parseInt(choise.get(1)),
                    questionsAssets.questions().get(random.nextInt(99)),
                    deviceIdAssets.device().get(randomDevice.nextInt(148))));
        }

        for (String post : requestList) {
            httpPosts.add(request.request(post));
            System.out.println("=================");
            System.out.println(post);
        }

        System.out.println(httpPosts.size());

        for (HttpPost httpPost : httpPosts) {
            Thread.sleep(2000);
            System.out.println(httpPost);
            HttpResponse response = client.httpClient.execute(httpPost);
            Header connectionCloseHeader = response.getFirstHeader("Connection");
            if (connectionCloseHeader != null && connectionCloseHeader.getValue().equalsIgnoreCase("close")) {
                ((CloseableHttpClient) client.httpClient).close();
            }
            httpResponses.add(response);
            System.out.println("message " + mes + "sucsesfully send!");
            System.out.println(response);
            System.out.println("POST BANGGG!!!");
            mes++;
        }

        // HttpPost post = request.request(api);

    }
}
