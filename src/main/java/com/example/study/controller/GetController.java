package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api") //localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod")//localhost:8080/api/getMethod
    public String getRequest() {
        return "Hi getMethod";
    }

    @GetMapping(value = "/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        System.out.println(id);
        System.out.println(pwd);
        return "id: " + id + ", password: " + pwd;
    }

    @GetMapping(value = "/getMultiParameter")
//    public String getMultiParameter(SearchParam searchParam){
    public SearchParam getMultiParameter(SearchParam searchParam) {

        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

//        return "OK";
        return searchParam;
    }
}
