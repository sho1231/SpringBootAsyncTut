package controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class ServiceClass {
    /*For method to be implemented asynchronously using @Async we need the method to be non static as
    * well as the class to be managed by spring application context*/

//    @Async
    public void abctest() throws InterruptedException {
        System.out.println("Thread test:"+Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(10);
        System.out.println("async req done");
    }
}
