import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import placeapi.JsonBuild;
import request.PlaceRequest;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class PlaceTests {
    @Test
    public void testGetRequest() throws IOException, InterruptedException, ExecutionException {
        PlaceRequest coronaVirusRequests = new PlaceRequest();
        coronaVirusRequests.getRequest();


    }

    @ParameterizedTest
    @CsvFileSource(resources = "postrequestdata.csv")
    public void testPostRequest(String accuracy, String name, String phoneNumber, String address, String language){
        JsonBuild jsonBuild = new JsonBuild(accuracy,name,phoneNumber,address,language);
       PlaceRequest placeRequest = new PlaceRequest();
       placeRequest.postRequest(jsonBuild);
    }

}

