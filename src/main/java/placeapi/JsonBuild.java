package placeapi;

public class JsonBuild {
    String accuracy;
    String name;
    String phoneNumber;
    String address;
    String language;

    public JsonBuild(String accuracy, String name, String phoneNumber, String address, String language) {
        this.accuracy = accuracy;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.language = language;
    }

    public  String crateJson() {
        String json = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": 49.9996377758606,\n" +
                "    \"lng\": 36.24502092656298\n" +
                "  },\n" +
                "  \"accuracy\": " + accuracy + " ,\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                "  \"address\": \"" + address + "\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"" + language + "\"\n" +
                "}";

        return json;
    }
}
