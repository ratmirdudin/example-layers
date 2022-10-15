package com.ratmirdudin.layersexample.controllers;

import com.ratmirdudin.layersexample.dtos.UserDtoV1;
import com.ratmirdudin.layersexample.models.UserModel;
import com.ratmirdudin.layersexample.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserControllerV1 {

    @Autowired
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDtoV1> getUserById(@PathVariable("userId") Long userId) {
        UserModel userModel = userService.getUserById(userId);

        return ResponseEntity.ok(mapModelToDto(userModel));
    }

    private UserDtoV1 mapModelToDto(UserModel userModel) {
        return UserDtoV1
                .builder()
                .id(userModel.getId())
                .username(userModel.getUsername())
                .firstname(userModel.getFirstname())
                .lastname(userModel.getLastname())
                .status(userModel.getStatus())
                .build();
    }
}
