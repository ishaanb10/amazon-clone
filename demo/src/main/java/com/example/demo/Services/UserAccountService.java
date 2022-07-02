package com.example.demo.Services;

import com.example.demo.Model.UserAccount;
import com.example.demo.Repository.UserAccountRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {
@Autowired
    private UserAccountRepository userAccountRepository;


    public UserAccount getUserAccount(String userName){return userAccountRepository.findByUserName(userName);}
    public boolean doesUserExist(String userName){
        if(getUserAccount(userName)!=null){
            return true;
    }
        return false;
    }
    public boolean login(String userName,String password){
        if(userAccountRepository.findByUserNamePassword(userName,password)!=null){
            return true;
        }
        return false;
    }
    public boolean signUp(UserAccount userAccount){
        if(userAccountRepository.findByUserName(userAccount.getUserName())!=null)
        {
            return false;
        }
        else {
            userAccountRepository.insert(userAccount);
        }
        return true;
    }

}
