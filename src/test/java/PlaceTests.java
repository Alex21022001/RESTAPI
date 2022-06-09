import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import DataForPlacaAPI.JsonBuild;
import request.PlaceRequest;
import service.JsonGetReader;
import service.JsonPostReader;

public class PlaceTests {
    @ParameterizedTest
    @CsvFileSource(resources = "dataforrequests.csv")
    public void testGetRequest(String accuracy, String name, String phoneNumber, String address, String language) {
        PlaceRequest placeGETRequest = new PlaceRequest();
        placeGETRequest.getRequest();
        Assert.assertEquals(accuracy, JsonGetReader.getReader().accuracy);
        Assert.assertEquals(name, JsonGetReader.getReader().name);
        Assert.assertEquals(phoneNumber, JsonGetReader.getReader().phone_number);
        Assert.assertEquals(address, JsonGetReader.getReader().address);
        Assert.assertEquals(language, JsonGetReader.getReader().language);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "dataforrequests.csv")
    public void testPostRequest(String accuracy, String name, String phoneNumber, String address, String language) {
        JsonBuild jsonBuild = new JsonBuild(accuracy, name, phoneNumber, address, language);
        PlaceRequest placePOSTRequest = new PlaceRequest();
        placePOSTRequest.postRequest(jsonBuild);
        Assert.assertEquals("OK", JsonPostReader.getReader().status);
    }

}

