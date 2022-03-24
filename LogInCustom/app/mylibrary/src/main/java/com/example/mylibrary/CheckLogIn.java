package com.example.mylibrary;

public class CheckLogIn {
    private boolean checkLog(String username, String password) {
        return username.equals("admin") && password.equals("admin");
    }
}
