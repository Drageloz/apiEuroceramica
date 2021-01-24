package com.euroceramica.dashboard.webController;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class startController {
    //Este es el inicio de la aplicacion
    @GetMapping("")
    public ResponseEntity<Boolean> startConection(){
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
