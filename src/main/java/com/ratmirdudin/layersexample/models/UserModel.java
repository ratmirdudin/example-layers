package com.ratmirdudin.layersexample.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private Long id;

    private String username;

    private String firstname;

    private String lastname;

    private String status;
}