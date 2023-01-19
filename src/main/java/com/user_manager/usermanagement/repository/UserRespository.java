package com.user_manager.usermanagement.repository;

import com.user_manager.usermanagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<User, Integer> {
}
