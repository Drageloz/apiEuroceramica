package com.euroceramica.dashboard.webController;

import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.domain.service.CounterExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/CountersExample")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CounterExampleController {

    @Autowired
    public CounterExampleService counterExampleService;

    @GetMapping("/all")
    public ResponseEntity<List<CounterExample>> getAll(){
        return new ResponseEntity<>(counterExampleService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/increment")
    public ResponseEntity<CounterExample> increment(){
        CounterExample counterExample = counterExampleService.getCounterById(1).get();
        counterExample.setCeValue(counterExample.getCeValue() + 1);
        return new ResponseEntity<CounterExample>(counterExampleService.save(counterExample), HttpStatus.OK);
    }

    @GetMapping("/decrement")
    public ResponseEntity<CounterExample> decrement(){
        CounterExample counterExample = counterExampleService.getCounterById(1).get();
        counterExample.setCeValue(counterExample.getCeValue() - 1);
        return new ResponseEntity<CounterExample>(counterExampleService.save(counterExample), HttpStatus.OK);
    }

}
