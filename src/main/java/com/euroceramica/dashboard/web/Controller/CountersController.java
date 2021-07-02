package com.euroceramica.dashboard.web.Controller;

import com.euroceramica.dashboard.domain.Counters;
import com.euroceramica.dashboard.domain.service.CountersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/Counters")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CountersController {

    @Autowired
    private CountersService countersService;

    @GetMapping("/all")
    public ResponseEntity<List<Counters>> getAll(){
        return new ResponseEntity<>(countersService.getAll(), HttpStatus.OK);
    }
}
