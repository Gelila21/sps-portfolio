package com.google.sps.servlets;

import java.util.ArrayList;
import java.util.List;

import com.github.gv2011.gson.GsonBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.eclipse.jetty.util.ajax.JSONObjectConvertor;

//import net.kut3.json.JsonArray;
//import net.kut3.json.JsonObject;


public class JsonConverter {

   


    private final com.github.gv2011.gson.Gson gson;

    public JsonConverter() {

        gson = new GsonBuilder().create();
    }

    public String convertToJson(List<Hobby> hobbies) {

        com.github.gv2011.gson.JsonArray jarray = gson.toJsonTree(hobbies).getAsJsonArray();
        var jsonObject = new JsonObject();
        jsonObject.add("hobbies", jarray);

        return jsonObject.toString();
    }
}