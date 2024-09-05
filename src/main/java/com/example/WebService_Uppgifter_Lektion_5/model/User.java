package com.example.WebService_Uppgifter_Lektion_5.model;

import com.example.WebService_Uppgifter_Lektion_5.response.Response;

public class User implements Response {

    private Long id;
    private String username;
    private String password;
    boolean isEnabled;

    public User () {}

    public User(Long id, String username, String password, boolean isEnabled) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isEnabled = isEnabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
