package com.example.JpApp.magicitem;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

@Service
public class MagicItemService {
    final String BASE_URL = "https://www.dnd5eapi.co/api/magic-items/";
    public List<MagicItem> getMagicItem(String magicItem){
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL+magicItem))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpClient client = HttpClient.newBuilder()
                .build();

        try{
            HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonObject = new JsonParser().parse(response.body().toString()).getAsJsonObject();
            return List.of(
                new MagicItem(
                    jsonObject.get("name").toString(),
                    jsonObject.get("rarity").toString(),
                    jsonObject.get("desc").toString(),
                    jsonObject.get("url").toString()
                )
            );
        } catch (Error | IOException | InterruptedException e){}

        return null;
    }
}
