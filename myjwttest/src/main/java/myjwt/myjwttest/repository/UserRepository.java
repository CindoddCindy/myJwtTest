package myjwt.myjwttest.repository;

import myjwt.myjwttest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUserNameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userId);

    Optional<User> findByUsername (String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
