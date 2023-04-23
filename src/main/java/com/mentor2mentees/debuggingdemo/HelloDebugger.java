package com.mentor2mentees.debuggingdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 912vi
 */
@RestController
public class HelloDebugger {


    @GetMapping("hello-debugger")
    public String helloDebug() {
        return process();
    }

    private String process() {
        String s ="Hello";
       return decorate(s);
    }

    private String decorate(String s) {
        return "-"+s+"-";
    }


}
