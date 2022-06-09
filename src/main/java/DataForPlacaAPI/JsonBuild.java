package DataForPlacaAPI;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonBuild {
    public static String accuracy;
    public static String name;
    public static String phoneNumber;
    public static String address;
    public static String language;

    public JsonBuild(String accuracy, String name, String phoneNumber, String address, String language) {
        this.accuracy = accuracy;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.language = language;
    }


    public  String crateJson() {
        String json = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": "+accuracy+","+"\n" +
                "  \"name\": \""+name+"\",\n" +
                "  \"phone_number\": \""+phoneNumber+"\",\n" +
                "  \"address\": \""+address+"\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \""+language+"\"\n" +
                "}";

        return json;
    }
}
