package com.example.JpApp;

import com.example.JpApp.magicitem.MagicItem;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class DnDApp {

	public static void main(String[] args) {
		SpringApplication.run(DnDApp.class, args);
	}
//	public static void main(String[] args) throws IOException, InterruptedException {
//		final String BASE_URL = "https://www.dnd5eapi.co/api/magic-items";
//		HttpRequest req = HttpRequest.newBuilder()
//				.uri(URI.create(BASE_URL+"/adamantine-armor"))
//				.GET()
//				.version(HttpClient.Version.HTTP_2)
//				.build();
//
//		HttpClient client = HttpClient.newBuilder()
//				.build();
//
//		try{
//			HttpResponse<String> response = client.send(req, HttpResponse.BodyHandlers.ofString());
//			JsonObject jsonObject = new JsonParser().parse(response.body().toString()).getAsJsonObject();
//
//			System.out.println();
//			System.out.println(response.body());
//			MagicItem iitem = new MagicItem(
//					jsonObject.get("name").toString(),
//					jsonObject.get("rarity").toString(),
//					jsonObject.get("desc").toString(),
//					jsonObject.get("url").toString()
//
//			);
//		} catch (Error e){}
//	}


}
