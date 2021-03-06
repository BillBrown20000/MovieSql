package org.yearup.moviecatalog.account.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yearup.moviecatalog.account.model.Account;
import org.yearup.moviecatalog.account.repo.AccountRepository;
import org.yearup.moviecatalog.movie.exception.ResourceNotFoundException;
import org.yearup.moviecatalog.movie.repository.MovieRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    private MovieRepository movieRepository;

    protected void verifyAccount(Long accountId) throws ResourceNotFoundException {
        Optional<Account> accounts = accountRepository.findById(accountId);
        if (accounts.isEmpty()){
            throw new ResourceNotFoundException("Account with id " + accountId + " not found");
        }
    }

    public Account createAccount(Account accounts){
        accountRepository.save(accounts);
        return accounts;
    }

    public List<Account> getAllAccounts(){
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts :: add);
        return accounts;
    }

    public Optional<Account> getAccountById(Long accountId){
        return accountRepository.findById(accountId);
    }

    public void updateAccount(Account account, Long accountId){
        for (Account accounts1 : accountRepository.findAll()){
            if (accounts1.getUserId().equals(accountId)){
                accountRepository.save(account);
            }
        }
    }

    public void deleteAccountById(Long accountId){
        accountRepository.deleteById(accountId);
    }

}

