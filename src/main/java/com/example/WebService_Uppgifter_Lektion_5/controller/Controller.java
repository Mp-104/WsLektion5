package com.example.WebService_Uppgifter_Lektion_5.controller;

import com.example.WebService_Uppgifter_Lektion_5.model.User;
import com.example.WebService_Uppgifter_Lektion_5.response.ErrorResponse;
import com.example.WebService_Uppgifter_Lektion_5.response.Response;
//import com.example.WebService_Uppgifter_Lektion_5.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class Controller {

    private final List<User> userList = new ArrayList<>(
            List.of(
                    new User(0L, "test", "pass", true),
                    new User(1L, "benny", "hill", true)
            )
    );


    @PostMapping("/u={username}/p={password}")
    public ResponseEntity<Response> createUser (@PathVariable("username") String username, @PathVariable("password") String password) {

        User user = new User((long) userList.size(), username, password, true );

        if (username.length() > 0 && password.length() > 0)  {

            if (username.length() > 4) {

                userList.add(user);

                return ResponseEntity.status(201).body(user);

            }

            return ResponseEntity.status(454).body(new ErrorResponse("username must be more than 4 characters"));

        }

        return ResponseEntity.status(455).body(new ErrorResponse("Credentials cannot be null"));

    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getUserById (@PathVariable("id") Long id) {

        if ( id >= userList.size()) {

            return ResponseEntity.status(404).body(new ErrorResponse("ingen sådan användare"));

        }

        return ResponseEntity.status(200).body(userList.get(Math.toIntExact(id)));

    }


}
