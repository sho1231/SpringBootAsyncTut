package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TestController {
    @Autowired
    public ServiceClass serviceClass;
    @GetMapping
    public String test() {
        return "abc";
    }

    @GetMapping("/async")
    public String test123() throws InterruptedException {
        System.out.println("Thread:"+Thread.currentThread().getName());
        serviceClass.abctest();
        return "Done";
    }
}
