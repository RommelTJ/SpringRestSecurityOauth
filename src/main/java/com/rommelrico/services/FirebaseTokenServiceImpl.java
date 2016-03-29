package com.rommelrico.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.firebase.security.token.TokenGenerator;
import com.rommelrico.models.FirebaseToken;
import org.springframework.stereotype.Service;

/**
 * Created by rommelrico on 3/24/16.
 */
@Service
public class FirebaseTokenServiceImpl implements FirebaseTokenService {

    @Override
    public List<FirebaseToken> getToken() {
        List<FirebaseToken> myList = new ArrayList<FirebaseToken>();

        Map<String, Object> authPayload = new HashMap<String, Object>();
        authPayload.put("uid", "rommel");
        authPayload.put("some", "arbitrary");
        authPayload.put("data", "here");

        TokenGenerator tokenGenerator = new TokenGenerator("REDACTED");
        String token = tokenGenerator.createToken(authPayload);
        myList.add(new FirebaseToken(token));

        return myList;
    }

}
