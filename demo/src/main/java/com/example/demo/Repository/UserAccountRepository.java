package com.example.demo.Repository;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Model.UserAccount;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface UserAccountRepository extends MongoRepository<UserAccount,String> {
    @Query(value = "{'userName':?0,'password':?1}")
    UserAccount findByUserNamePassword( String userName,String password);

    @Query(value = "{'userName':?0}")
    UserAccount findByUserName( String userName);
}
