package org.example.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.Util.RandomStringUtil;

public class Test {

    public static void main(String[] args) {
        String jsonString = "{\"success\":true}";

        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonString);

        System.out.println(jsonArray);


    }
}
