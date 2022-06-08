package request;

import placeapi.DataForPlace;
import placeapi.JsonBuild;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;


public class PlaceRequest extends AbstractRequest {


    public void postRequest(JsonBuild jsonBuild) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(DataForPlace.URL + DataForPlace.POST_END_POINT))
                .POST(HttpRequest.BodyPublishers
                        .ofString(jsonBuild.crateJson()))
                .build();
        HttpResponse<Path> response = null;
        try {
            File file = new File("src/main/resources/postresponse.json");
            file.delete();
            file.createNewFile();
            response = client.send(request, HttpResponse.BodyHandlers.ofFile(Path.of("src/main/resources/postresponse.json")));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void getRequest() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(DataForPlace.URL + DataForPlace.GET_END_POINT + DataForPlace.getHeaderForPlace()))
                .build();
        HttpResponse<Path> response = null;
        try {
            File file = new File("src/main/resources/getresponse.json");
            file.delete();
            file.createNewFile();

            response = client.send(request, HttpResponse.BodyHandlers.ofFile(Path.of("src/main/resources/getresponse.json")));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
