//package org.yearup.moviecatalog.security.config.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.yearup.moviecatalog.account.model.Account;
//import org.yearup.moviecatalog.account.repo.AccountRepository;
//import org.yearup.moviecatalog.security.config.dto.RegisterRequest;
//
//@Service
//public class AuthService {
//
//    @Autowired
//    private AccountRepository accountRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public void signUp(RegisterRequest registerRequest) {
//        Account account = new Account();
//        account.setUserName(registerRequest.getUsername());
//        account.setEmail(registerRequest.getEmail());
//        account.setPassword(encodePassword(registerRequest.getPassword()));
//        accountRepository.save(account);
//    }
//    private String encodePassword(String password) {
//        return passwordEncoder.encode(password);
//    }
//
//
//}
