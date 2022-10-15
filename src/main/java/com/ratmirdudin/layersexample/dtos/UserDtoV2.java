package com.ratmirdudin.layersexample.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDtoV2 {

    private Long id;

    private String username;

    private String fullName;

    private String status;
}
