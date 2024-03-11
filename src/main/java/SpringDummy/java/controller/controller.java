package SpringDummy.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {

    @GetMapping("/first")
    public String getMethodName() {
        System.out.println("Enteredddddddd");
        return "hello";
    }
    
    
}
