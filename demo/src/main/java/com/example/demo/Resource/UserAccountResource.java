package com.example.demo.Resource;

import com.example.demo.Model.UserAccount;
import com.example.demo.Repository.UserAccountRepository;
import com.example.demo.Services.UserAccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/userAccount")
@RestController
public class UserAccountResource {
    @Autowired
    private UserAccountService userAccountService;

    @GetMapping("/login/{userName}/{password}")
    boolean isUserPresent(@PathVariable String userName,@PathVariable String password){

        return userAccountService.doesUserExist(userName);

    }
    @GetMapping("/login")
    boolean login(@RequestParam(name="userName") String userName,@RequestParam(name="password") String password){

        return userAccountService.login(userName,password);

    }
    @PostMapping("/signUp")
    ResponseEntity<String> signUp(@RequestBody UserAccount newAccount){

        if(userAccountService.signUp(newAccount))
        {
            return new ResponseEntity<>(HttpStatus.valueOf(201));
        }
        return new ResponseEntity<>(HttpStatus.valueOf(204));

    }

}
