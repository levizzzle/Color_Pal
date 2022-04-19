package com.example.colorpal.data;

import com.example.colorpal.data.model.LoggedInUser;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {
        String user = "admin@colorpal.com";
        String pass = "pass1234";

        try {
            if (username.equals(user)  && password.equals(pass)){
                LoggedInUser admin = new LoggedInUser
                        (java.util.UUID.randomUUID().toString(), "Admin");
                return new Result.Success<>(admin);
            }
            else {
                LoggedInUser fakeUser = new LoggedInUser
                        (java.util.UUID.randomUUID().toString(), "Jane Doe");
                return new Result.Success<>(fakeUser);
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}