package lk.kaveendra.springsecurityjpa.service;

import lk.kaveendra.springsecurityjpa.MyUserDetails;
import lk.kaveendra.springsecurityjpa.model.User;
import lk.kaveendra.springsecurityjpa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user=userRepo.findByUserName(s);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found :" + s));
        return user.map(MyUserDetails::new).get();
    }
}
