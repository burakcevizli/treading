package com.cryptocurrency.repository;

import com.cryptocurrency.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
