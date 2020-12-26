package lk.kaveendra.springsecurityjpa.repo;

import lk.kaveendra.springsecurityjpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String userName);
}
