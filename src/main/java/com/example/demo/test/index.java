package com.example.demo.test;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class index {
    @ResponseBody
    @GetMapping("indexss")
    public String indexs() {
        //region Description
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        //endregion
        return "this is a text...";
    }

    public ArrayList testSd() {

        return new ArrayList();

    }
}
