package com.tw.bootcamp.cheannai.application;

import com.tw.bootcamp.chennai.domain.EmployeeRecord;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping(value="/employee",method = RequestMethod.GET)
    public EmployeeRecord getEmployee(){
        return new EmployeeRecord("AD");
    }
}
