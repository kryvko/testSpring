package ua.kryvko.testspring.repository;

import org.springframework.data.repository.CrudRepository;
import ua.kryvko.testspring.beans.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

}
