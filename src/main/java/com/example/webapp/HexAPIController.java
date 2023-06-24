package com.example.webapp;

import com.example.core.data.Person;
import com.example.core.port.APIServicePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.logging.log4j.util.Strings.isEmpty;

@RestController
@CrossOrigin
@EnableJpaRepositories
public class HexAPIController {

    @Autowired
    private APIServicePort hexService;

    @GetMapping(path = "/name")
    public Person sayHello(@RequestParam String n) {
        //any validation here
        String name = isEmpty(n) ? "" : n.toLowerCase();

        return hexService.getHelloMsg(name);
    }
}

