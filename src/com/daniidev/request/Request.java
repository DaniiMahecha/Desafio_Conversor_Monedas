package com.daniidev.request;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    String apiKey = "724c7af2e6ca9ea2f6b4f58d";
    String base;
    String target;


    public DTO callApi(String base, String target){
        this.base = base;
        this.target = target;
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + base + "/" + target);

        HttpClient client = HttpClient.newHttpClient();
        // Creando la solicitud
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
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
        //Deserializo al DTO el JSON
        return new Gson().fromJson(response.body(), DTO.class) ;
    }
}
