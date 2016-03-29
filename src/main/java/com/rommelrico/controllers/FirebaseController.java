package com.rommelrico.controllers;

import com.rommelrico.models.FirebaseToken;
import com.rommelrico.services.FirebaseTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by rommelrico on 3/24/16.
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/v1/firebase")
public class FirebaseController {

    @Autowired
    FirebaseTokenService firebaseTokenService;

    @RequestMapping(value = "/token/", method = RequestMethod.GET)
    @ResponseBody
    public List<FirebaseToken> token() {
        return firebaseTokenService.getToken();

    }
}
