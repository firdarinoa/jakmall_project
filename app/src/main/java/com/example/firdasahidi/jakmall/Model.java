package com.example.firdasahidi.jakmall;

import org.json.JSONObject;

/**
 * Created by FirdaRinoa on 9/19/18.
 */

public class Model {
    public String jokes;
    public Model(String textview) {
        this.textview = textview;
    }

    // Constructor to convert JSON object into a Java class instance
    public Model(JSONObject object){
        try {
            this.jo = object.getString("name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    // Factory method to convert an array of JSON objects into a list of objects
    // User.fromJson(jsonArray);
    public static ArrayList<User> fromJson(JSONArray jsonObjects) {
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                users.add(new User(jsonObjects.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return users;
    }


}

