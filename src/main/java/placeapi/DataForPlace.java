package placeapi;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataForPlace {
    public static final String URL = "https://rahulshettyacademy.com";
    public static final String POST_END_POINT = "/maps/api/place/add/json";
    public static final String GET_END_POINT = "/maps/api/place/get/json";
    public static String GET_HEADER = null;

    public static String getHeaderForPlace() {
        String header = getResponse();
        String base = "?key=qaclick123&place_id=";
      return   GET_HEADER = base+header;
    }
    public static String getResponse() {
        JSONParser parser = new JSONParser();
        String name = null;
        try (FileReader fileReader = new FileReader("src/main/resources/postresponse.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            name = (String) jsonObject.get("place_id");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return name;

    }
}
