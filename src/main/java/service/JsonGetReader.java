package service;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonGetReader {

    public String latitude;
    public String longitude;
    public String accuracy;
    public String name;
    public String phone_number;
    public String address;
    public String types;
    public String website;
    public String language;


    public  JsonGetReader getReader() {
        Gson gson = new Gson();
        JsonGetReader jsonGetReader = null;
        try (FileReader fileReader = new FileReader("src/main/resources/getresponse.json")) {
            jsonGetReader = gson.fromJson(fileReader, JsonGetReader.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonGetReader;
    }
}



