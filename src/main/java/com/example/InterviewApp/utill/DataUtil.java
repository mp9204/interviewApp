package com.example.InterviewApp.utill;

import java.util.Random;

public class DataUtil {

    public static int getRandomNumber(){
        Random randpm = new Random();
        return randpm.nextInt(100-1)+1;
    }
}
