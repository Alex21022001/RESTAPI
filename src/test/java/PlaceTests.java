import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import DataForPlacaAPI.JsonBuild;
import request.PlaceRequest;
import service.JsonGetReader;
import service.JsonPostReader;

public class PlaceTests {
    @Test
    public void testGetRequest() {
        PlaceRequest coronaVirusRequests = new PlaceRequest();
        JsonGetReader jsonGetReader = new JsonGetReader();
        coronaVirusRequests.getRequest();
        Assert.assertEquals("English",jsonGetReader.getReader().language);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "postrequestdata.csv")
    public void testPostRequest(String accuracy, String name, String phoneNumber, String address, String language){
        JsonBuild jsonBuild = new JsonBuild(accuracy,name,phoneNumber,address,language);
       PlaceRequest placeRequest = new PlaceRequest();
       placeRequest.postRequest(jsonBuild);
    }

}

