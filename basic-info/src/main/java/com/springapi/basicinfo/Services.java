package com.springapi.basicinfo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class Services {

    public List<Information> getAllInfo(){
        List<Information> list = new ArrayList<Information>();
        list.add(new Information("22684","Amit Vishwakarma","Quantiphi","Intern - Framework Engineer"));
        list.add(new Information("Q03367","Shehbaz Ansari","Quantiphi","Software Developer"));
        list.add(new Information("Q03344","Shaikh Ahmed Reza","Quantiphi","Software Developer"));
        list.add(new Information("Q01226","Ankita Vaidya","Quantiphi","Senior Software Developer"));
        list.add(new Information("Q03423","Neha Jangam","Quantiphi","Human Resource Lead"));
        return list;
    }

    public List<Information> getIdDetails(String id){
        return getAllInfo().stream().filter(item -> Objects.equals(item.getId(), id)).collect(Collectors.toList());
    }

}
