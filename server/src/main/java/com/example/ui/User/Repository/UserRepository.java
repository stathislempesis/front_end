package com.example.ui.User.Repository;

import com.example.ui.User.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userRepository")
@Transactional
public interface UserRepository extends JpaRepository<User,Long> {



}