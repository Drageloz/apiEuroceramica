package com.euroceramica.dashboard.web.Controller;

import com.euroceramica.dashboard.domain.dto.AuthenticationRequest;
import com.euroceramica.dashboard.domain.dto.AuthenticationResponse;
import com.euroceramica.dashboard.domain.dto.Token;
import com.euroceramica.dashboard.domain.service.DashboardUserDetailsService;
import com.euroceramica.dashboard.web.Controller.security.JWTUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private DashboardUserDetailsService dashboardUserDetailsService;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = dashboardUserDetailsService.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);

            return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);
        } catch (BadCredentialsException e) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/validate")
    public ResponseEntity<Boolean> isTokenExpired(@RequestBody Token token){
            try {
                Boolean validateToken = jwtUtil.isTokenExpired(token.getJwt());
                return new ResponseEntity<>(validateToken, HttpStatus.OK);
            }
            finally {
                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
            }
//            catch(NullPointerException e){
//                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//            }
//            catch (IllegalArgumentException e){
//                return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//            }
    }
}
