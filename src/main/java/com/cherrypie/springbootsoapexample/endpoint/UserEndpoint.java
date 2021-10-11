package com.cherrypie.springbootsoapexample.endpoint;

import com.cherrypie.spring_boot_soap_example.GetUserRequest;
import com.cherrypie.spring_boot_soap_example.GetUserResponse;
import com.cherrypie.springbootsoapexample.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "https://cherrypie.com/spring-boot-soap-example",
                localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){

        GetUserResponse response = new GetUserResponse();
        response.setUser(UserService.getUser(request.getName()));

        return response;
    }

}
