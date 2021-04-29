package com.aadvprog2021.b15.rekrUIt_FE.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String welcome() throws Exception {
        return "index";
    }

    
}
