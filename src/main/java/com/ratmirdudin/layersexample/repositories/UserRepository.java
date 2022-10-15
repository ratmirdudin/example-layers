package com.ratmirdudin.layersexample.repositories;

import com.ratmirdudin.layersexample.domains.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
