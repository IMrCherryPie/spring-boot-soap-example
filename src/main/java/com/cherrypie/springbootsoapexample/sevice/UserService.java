package com.cherrypie.springbootsoapexample.sevice;

import com.cherrypie.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User sam = new User();
        sam.setName("Sam");
        sam.setEmpId(1);
        sam.setSalary(12310.1d);

        User gordon = new User();
        gordon.setName("Gordon");
        gordon.setEmpId(2);
        gordon.setSalary(13310.1d);

        User jack = new User();
        jack.setName("Jack");
        jack.setEmpId(3);
        jack.setSalary(14310.1d);

        users.put(sam.getName(), sam);
        users.put(gordon.getName(), gordon);
        users.put(jack.getName(), jack);
    }

    public static User getUser(String name){

        return users.get(name);
    }

}
