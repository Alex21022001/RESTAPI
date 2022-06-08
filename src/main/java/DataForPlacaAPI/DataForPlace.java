package DataForPlacaAPI;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import service.JsonPostReader;

public class DataForPlace {
    public static final String URL = "https://rahulshettyacademy.com";
    public static final String POST_END_POINT = "/maps/api/place/add/json";
    public static final String GET_END_POINT = "/maps/api/place/get/json";
    public static String GET_HEADER = null;

    public static String getHeaderForPlace() {
        JsonPostReader jsonPostReader = new JsonPostReader();
        String header = jsonPostReader.getReader().place_id;
        String base = "?key=qaclick123&place_id=";
      return   GET_HEADER = base+header;
    }

}
