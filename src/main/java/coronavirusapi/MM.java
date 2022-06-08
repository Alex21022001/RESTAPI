package coronavirusapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class MM {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        String name = null;
        try (FileReader fileReader = new FileReader("src/main/resources/getresponse.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray jsonArray = (JSONArray) jsonObject.get("data");
            for (Object it:jsonArray){
                JSONObject el = (JSONObject) it;
                name = (String) el.get("rows");
                System.out.println(name);
            }
            System.out.println(name);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
