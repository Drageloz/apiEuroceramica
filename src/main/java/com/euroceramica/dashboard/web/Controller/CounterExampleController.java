package com.euroceramica.dashboard.web.Controller;

import com.euroceramica.dashboard.domain.CounterExample;
import com.euroceramica.dashboard.domain.service.CounterExampleService;
import com.euroceramica.dashboard.webController.requestBodyMapping.Value;
import com.hivemq.client.mqtt.datatypes.MqttQos;
import com.hivemq.client.mqtt.mqtt5.Mqtt5BlockingClient;
import com.hivemq.client.mqtt.mqtt5.Mqtt5Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @GetMapping("/set/{value}")
    public ResponseEntity<CounterExample> set(@PathVariable("value") Integer value){
        CounterExample counterExample = counterExampleService.getCounterById(1).get();
        counterExample.setCeValue(value);
        return new ResponseEntity<CounterExample>(counterExampleService.save(counterExample), HttpStatus.OK);
    }

    @PostMapping(path = "/setValue")
    public ResponseEntity<CounterExample> setValue(@RequestBody Value value){
        CounterExample counterExample = counterExampleService.getCounterById(1).get();
        counterExample.setCeValue(Integer.valueOf(value.getValue()));
        return new ResponseEntity<CounterExample>(counterExampleService.save(counterExample), HttpStatus.OK);
    }

    @GetMapping("/mqtt")
    public ResponseEntity<Boolean> mqtt(){
        String uuid = UUID.randomUUID().toString();
        System.out.println("Valor UUID: "+uuid);
        Mqtt5BlockingClient client = Mqtt5Client.builder()
                .identifier(uuid)
                .serverHost("localhost")
                .serverPort(1883)
                .buildBlocking();

        client.connect();

        client.toAsync().subscribeWith()
                .topicFilter("test/increment")
                .qos(MqttQos.AT_LEAST_ONCE)
                .callback(message ->{
                    CounterExample counterExample = counterExampleService.getCounterById(1).get();
                    counterExample.setCeValue(counterExample.getCeValue() + 1);
                })
                .send();
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
