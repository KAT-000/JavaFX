package com.seba.biblioapp.model;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.Gson;

public class UserManager {

    ArrayList<User> user_ArrayList = new ArrayList<>();


    public UserManager(){
        loadData();
    }
 

    public void loadData(){
        InputStream cadena = getClass().getResourceAsStream("/user_data.json");

        InputStreamReader lector = new InputStreamReader(cadena);

        Gson gson = new Gson();

        User[] users = gson.fromJson(lector, User[].class);

        for( User usuario :  users){
            user_ArrayList.add(usuario);
        }
    }

    

}
