package com.example.InterviewApp.v1.service;

import com.example.InterviewApp.utill.DataUtil;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DataOperationService {

    private int getRandomIntByRest(int min, int max){
        RestTemplate rest = new RestTemplate();
        ResponseEntity<String> exchange = rest.exchange(
                "https://www.random.org/integers/?num=1&min=1&max=100&col=2&base=10&format=plain&rnd=new",
                HttpMethod.GET,
                HttpEntity.EMPTY,
                String.class);
        return Integer.valueOf(exchange.getBody().trim());
    }

    public String addTwoRandomInt(){
        int restRandom = getRandomIntByRest(1,100);
        int javaGeneratedRandom = DataUtil.getRandomNumber();
        return String.format("Result for add 2 random Ints %d + %d = %d", restRandom,javaGeneratedRandom,restRandom+javaGeneratedRandom);
    }
}
