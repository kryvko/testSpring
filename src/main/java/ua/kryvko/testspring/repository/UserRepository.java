package ua.kryvko.testspring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.kryvko.testspring.beans.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
