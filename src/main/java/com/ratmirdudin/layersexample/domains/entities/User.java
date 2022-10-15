package com.ratmirdudin.layersexample.domains.entities;

import com.ratmirdudin.layersexample.domains.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "app_user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_user_id")
    private Long id;

    @Column(name = "app_user_username", nullable = false, unique = true, updatable = false)
    private String username;

    @Column(name = "app_user_firstname")
    private String firstname;

    @Column(name = "app_user_lastname")
    private String lastname;

    @Enumerated(EnumType.STRING)
    @Column(name = "app_user_status", columnDefinition = "varchar(7) default 'Offline'")
    private Status status;
}