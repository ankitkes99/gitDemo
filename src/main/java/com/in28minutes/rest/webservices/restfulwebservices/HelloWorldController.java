package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path="/helloWorldBean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Luck With Beauty");
    }
    @GetMapping(path="/helloWorldBean/pathVar/{name}")
    public HelloWorldBean helloWorldBeanPathVar(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Love You "+name));
    }

}
