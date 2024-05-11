package com.cressy.PayGO.infrastructure.security;

import com.cressy.PayGO.entities.UserEntity;
import com.cressy.PayGO.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserEntity user = userRepository.findByEmail(username).orElseThrow(()-> new UsernameNotFoundException("User not found"));

        return new User(
                user.getPassword(),
                user.getEmail(),
                rolesToAuthorities(user)
        );
    }

    public Collection<GrantedAuthority> rolesToAuthorities(UserEntity userEntity){
        return Collections.singleton(new SimpleGrantedAuthority(String.valueOf(userEntity.getRole())));
    }

}
