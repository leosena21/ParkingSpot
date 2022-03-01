package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.security.JWTUtil;
import com.api.parkingcontrol.security.UserSS;
import com.api.parkingcontrol.services.UserSSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/auth")
public class AuthControllerImp {

    private final JWTUtil jwtUtil;

    public AuthControllerImp(JWTUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }


    @RequestMapping(value = "/refresh_token", method = RequestMethod.POST)
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        UserSS user = UserSSService.authenticated();
        String token = jwtUtil.generateToken(user.getUsername());
        response.addHeader("Authorization", "Bearer " + token);
        response.addHeader("access-control-expose-headers", "Authorization");
        return ResponseEntity.noContent().build();
    }
}
