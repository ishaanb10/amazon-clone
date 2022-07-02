package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
//use lombok for getter and setter i.e @Getter @Setter

@Document(collection = "emp_details")
public class EmployeeModel {
    @Id
    private String id;
    private String name;
    private String dept;
    private String email;
    private int contact;


    private Map<String,String>AddressList;


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }





    public EmployeeModel(@JsonProperty("name") String name, @JsonProperty("dept") String dept, @JsonProperty("email") String email, @JsonProperty("contact") int contact) {


        this.name = name;
        this.dept = dept;
        this.email = email;
        this.contact = contact;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public int getContact() {
        return contact;
    }


}
