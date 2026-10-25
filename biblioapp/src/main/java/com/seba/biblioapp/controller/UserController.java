package com.seba.biblioapp.controller;

import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.seba.biblioapp.model.User;


public class UserController {
    
    public User buscarPorRut(String rut){
        Gson gson = new Gson();
       try (Reader reader = new InputStreamReader(getClass().getResourceAsStream("/user_data.json"))){
            Type userListType = new TypeToken<List<User>>(){}.getType();
            List<User> usuarios = gson.fromJson(reader, userListType);
            for (User u : usuarios){
                if (u.getRut().equalsIgnoreCase(rut.trim())){
                    return u;
                }
            } 
       }
        catch (Exception e){
        e.printStackTrace();
        }
        return null;
    }

}
