package com.daniidev.request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    String apiKey = "724c7af2e6ca9ea2f6b4f58d";
    String base;
    String target;


    public String callApi(String base, String target){
        this.base = base;
        this.target = target;
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base + "/" + target;

        HttpClient client = HttpClient.newHttpClient();
        // Creando la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();


        HttpResponse<String> response;
        {
            try {
                response= client.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return response.body();
    }
}
