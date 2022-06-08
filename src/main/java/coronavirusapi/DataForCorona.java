package coronavirusapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.ArrayList;

public class DataForCorona {
    public static final String URL = "https://corona-virus-stats.herokuapp.com";
    public static final String GET_END_POINT = "/api/v1/cases/countries-search";



    public static String getResponse(HttpResponse<Path> response, String variable) {
        JSONParser parser = new JSONParser();
        String name = null;
        try (FileReader fileReader = new FileReader("src/main/resources/getresponse.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) jsonObject.get("data");
            for(Object elem:jsonArray){
                JSONArray jsarr = (JSONArray) elem;
                for (Object it:jsarr){
                    JSONObject obj = (JSONObject) it;
                    String counrty = (String) obj.get("country");
                    System.out.println("a"+counrty);
                }
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return name;

    }
}
