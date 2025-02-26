package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api")
public class PostController {

//    @RequestMapping(method = RequestMethod.POST, value = "/postMethod")
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {
        return searchParam;
    }
}
