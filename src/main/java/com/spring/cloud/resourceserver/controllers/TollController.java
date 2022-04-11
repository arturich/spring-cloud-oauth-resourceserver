package com.spring.cloud.resourceserver.controllers;

import java.util.ArrayList;
import java.util.List;

import com.spring.cloud.resourceserver.repository.TollData;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollController {

    private List<TollData> tollData;

    public TollController()
    {
        tollData = new ArrayList<>();

        tollData.add(new TollData("900", "1VB4GHA",  "2022-04-08-2021T16:45:07"));
        tollData.add(new TollData("901", "BB40003",  "2022-04-08-2021T16:45:40"));
        tollData.add(new TollData("902", "B200VV4",  "2022-04-08-2021T16:46:02"));
    }


    @RequestMapping("/api/tolldata")
    public List<TollData> getTollData()
    {
        return tollData;
    }
    
}
