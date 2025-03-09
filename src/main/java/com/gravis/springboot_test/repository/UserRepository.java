package com.gravis.springboot_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gravis.springboot_test.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository se charge des méthodes CRUD
    // Ex : save(), findById(), findall(), deleteById(), delete(), deleteAll()
}