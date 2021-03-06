package repository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import rest.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
