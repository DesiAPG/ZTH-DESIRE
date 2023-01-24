package com.spring.zthdesire.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralControl {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> wave(){
        return new ResponseEntity<>("hello from spring", HttpStatus.OK);
    }
}
