package com.garby.oauth2demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class LoginController {

    private static String authorisationRequestBaseUri = "oauth2/authorisation";
    Map<String, String> oauth2AuthenticationUrls = new HashMap<>();

    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;

    @GetMapping("/oauth_login")
    public String getLoginPage(Model model) {
        // ...
        return "oauth_login";
        /* This method has to send a map of the clients available and their authorization endpoints
         to the view (MVC), which will be gotten from the ClientRegistrationRepository bean */
    }


}
