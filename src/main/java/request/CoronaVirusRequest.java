package request;

import coronavirusapi.DataForCorona;
import placeapi.DataForPlace;
import placeapi.JsonBuild;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;

public class CoronaVirusRequest extends AbstractRequest{


    @Override
    public void postRequest(JsonBuild jsonBuild) {

    }

    @Override
    public void getRequest() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(DataForCorona.URL+DataForCorona.GET_END_POINT))
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
