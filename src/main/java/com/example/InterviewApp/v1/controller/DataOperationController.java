package com.example.InterviewApp.v1.controller;


import com.example.InterviewApp.v1.service.DataOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("DataOperation")
@RequestMapping(value = "/data-operation")
public class DataOperationController {

    private final DataOperationService dataOperationService;

    @Autowired
    public DataOperationController(DataOperationService dataOperationService) {
        this.dataOperationService = dataOperationService;
    }
    @GetMapping("/addTwoRandomInt")
    public Object addTwoRandomInt(){
        return dataOperationService.addTwoRandomInt();
    }

}
