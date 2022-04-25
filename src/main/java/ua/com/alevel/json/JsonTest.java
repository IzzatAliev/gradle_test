package ua.com.alevel.json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

public class JsonTest {

    public void test() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonElement jsonElement = gson.fromJson(new FileReader("iua.json"), JsonElement.class);
        parse(jsonElement);
    }

    private void parse(JsonElement jsonElement) {
        System.out.println("jsonElement = " + jsonElement);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            for(Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getValue().isJsonArray()) {
                    for (JsonElement element : entry.getValue().getAsJsonArray()) {
                        parse(element);
                    }
                }
                if (entry.getValue().isJsonPrimitive()) {
                    String asString = entry.getValue().getAsString();
                    System.out.println("asString = " + asString);
                }
                if (entry.getValue().isJsonObject()) {
                    parse(entry.getValue().getAsJsonObject());
                }
            }
        } else if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            for (JsonElement element : jsonArray) {
                parse(element);
            }
        } else {
            System.out.println("jsonElement primitive = " + jsonElement);
        }
    }
}
