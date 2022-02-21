package com.springapi.basicinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class Controller {

    @Autowired
    Services services;

    @GetMapping("/AllInfo")
    public List<Information> getAllObj(){
        return services.getAllInfo();
    }

    @GetMapping("/EmpDetails/{id}")
    public List<Information> getObjById(@PathVariable String id){
        return services.getIdDetails(id);
    }

}
