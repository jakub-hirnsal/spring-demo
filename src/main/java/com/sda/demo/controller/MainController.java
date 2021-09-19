package com.sda.demo.controller;

import com.sda.demo.component.SimpleCalculator;
import com.sda.demo.controller.dto.RequestDTO;
import com.sda.demo.controller.dto.ResponseDTO;
import com.sda.demo.service.HardServiceImpl;
import com.sda.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private SimpleCalculator simpleCalculator;
    private MyService myService;

    private String appName;


    //@Autowired
    public MainController(
            SimpleCalculator simpleCalculator,
            @Qualifier(value = "simpleServiceImpl") MyService myService,
            @Value("${app.name}") String appName
    ) {
        this.simpleCalculator = simpleCalculator;
        this.myService = myService;
        this.appName = appName;
        System.out.println("Creating MainController.. ");
        myService.printName();
    }


    @GetMapping(
            value = "/hello-world/{name}/data/{last}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ResponseDTO> getHelloWorld(
            @PathVariable String name,
            @PathVariable String last
    ) {
        if (name.startsWith("J")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity
                .ok()
                .body(new ResponseDTO(
                        "Hello",
                        name
                ));
    }

    @PostMapping(
            value = "/data",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<String> postEntity(
            @RequestBody RequestDTO body
    ) {
        return ResponseEntity.ok(body.toString());
    }

    @GetMapping(
            value = "/search",
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public ResponseEntity<String> search(
            @RequestParam String name,
            @RequestParam(name = "lastName") String surname,
            @RequestParam(required = true) Integer year
    ) {
        var data = new StringBuilder()
                .append("Your first name is ")
                .append(name)
                .append(", your last name is ")
                .append(surname)
                .append(", and your age is ")
                .append(year)
                .append(" and app name is ")
                .append(this.appName)
                .toString();

        return ResponseEntity.ok(data);
    }

}
