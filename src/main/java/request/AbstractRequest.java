package request;

import DataForPlacaAPI.JsonBuild;

import java.net.http.HttpClient;

public abstract class AbstractRequest {
    public abstract void postRequest(JsonBuild jsonBuild);

    public abstract void getRequest();
    public HttpClient client = HttpClient.newHttpClient();
}
