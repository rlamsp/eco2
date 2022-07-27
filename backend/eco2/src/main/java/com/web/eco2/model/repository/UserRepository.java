package com.web.eco2.model.repository;

import com.web.eco2.domain.dto.user.UserInformation;
import com.web.eco2.domain.entity.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByName(String name);

    void deleteByEmail(String email);

    UserInformation findUserInfoByEmail(String email);

    void delete(User user);
}