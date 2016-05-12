package com.packtpub.apps.rxjava_essentials.chapter8.api.stackexchange.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class UsersResponse {

    @SerializedName("items")
    @Expose
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

}
