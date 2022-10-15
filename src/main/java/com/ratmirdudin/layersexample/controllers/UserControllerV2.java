package com.ratmirdudin.layersexample.controllers;

import com.ratmirdudin.layersexample.dtos.UserDtoV2;
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
@RequestMapping("/api/v2/users")
@RequiredArgsConstructor
public class UserControllerV2 {

    @Autowired
    private final UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDtoV2> getUserById(@PathVariable("userId") Long userId) {
        UserModel userModel = userService.getUserById(userId);

        return ResponseEntity.ok(mapModelToDto(userModel));
    }

    private UserDtoV2 mapModelToDto(UserModel userModel) {
        return UserDtoV2
                .builder()
                .id(userModel.getId())
                .username(userModel.getUsername())
                .fullName(userModel.getFirstname() + " " + userModel.getLastname())
                .status(userModel.getStatus())
                .build();
    }
}
