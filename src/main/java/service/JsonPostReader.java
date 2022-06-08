package service;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonPostReader {
    public String status;
    public String place_id;
    public String scope;
    public String reference;
    public String id;

    public JsonPostReader getReader() {
        Gson gson = new Gson();
        JsonPostReader jsonPostReader = null;
        try (FileReader fileReader = new FileReader("src/main/resources/postresponse.json")) {
            jsonPostReader = gson.fromJson(fileReader, JsonPostReader.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonPostReader;
    }
}

