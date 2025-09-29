package org.example.service;

import org.example.entity.AppUser;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final Map<String, AppUser> users = Map.of(
            "giang", new AppUser("giang", "{noop}123456")  // {noop} means no password encoder
    );

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser user = users.get(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return User.withUsername(user.getUsername())
                .password(user.getPassword())
                .authorities("ROLE_USER")
                .build();
    }
}
