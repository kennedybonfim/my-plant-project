package br.com.myplant.myplant.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test" )
public class Controller {
    @GetMapping
    public void test(){
        System.out.println("test");
    }
}
