package com.springintro.messagingapp.repository;

import com.springintro.messagingapp.userentity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
