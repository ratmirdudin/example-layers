package com.ratmirdudin.layersexample.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoV1 {

    private Long id;

    private String username;

    private String firstname;

    private String lastname;

    private String status;
}
