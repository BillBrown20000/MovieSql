//package org.yearup.moviecatalog.security.config.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.yearup.moviecatalog.security.config.repos.UserRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {

//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUserName(String username) throws UsernameNotFoundException {
//        userRepository.findByUserName(username).orElseThrow
//                (() -> new UsernameNotFoundException("no user found with" + username));
//
//    }
//}
