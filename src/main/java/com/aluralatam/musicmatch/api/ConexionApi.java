package com.aluralatam.musicmatch.api;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexionApi {
    public String ConectarApi (String url, String dato){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().build();

        try{
            HttpResponse response =
        } catch (Exception | RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
