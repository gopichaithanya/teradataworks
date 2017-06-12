package org.emf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HadoopWorks on 11-06-2017.
 */
@Controller
public class EmployeeController {
    @RequestMapping(path="/", method= RequestMethod.GET)
    public String goHome(){
        return "index";
    }
}
