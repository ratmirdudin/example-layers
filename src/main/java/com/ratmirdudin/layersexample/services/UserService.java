package com.ratmirdudin.layersexample.services;

import com.ratmirdudin.layersexample.domains.entities.User;
import com.ratmirdudin.layersexample.exceptions.ResourceNotFoundException;
import com.ratmirdudin.layersexample.models.UserModel;
import com.ratmirdudin.layersexample.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserModel getUserById(Long id) {
        log.info("Finding user with id: {}", id);
        User user = userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return mapEntityToModel(user);
    }

    private UserModel mapEntityToModel(User user) {
        return UserModel.builder()
                .id(user.getId())
                .username(user.getUsername())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .status(user.getStatus().toString())
                .build();
    }
}
