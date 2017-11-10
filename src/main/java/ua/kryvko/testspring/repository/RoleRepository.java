package ua.kryvko.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.kryvko.testspring.beans.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
