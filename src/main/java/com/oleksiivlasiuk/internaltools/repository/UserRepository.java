package com.oleksiivlasiuk.internaltools.repository;

import com.oleksiivlasiuk.internaltools.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
