package myjwt.myjwttest.repository;

import myjwt.myjwttest.model.Role;
import myjwt.myjwttest.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
