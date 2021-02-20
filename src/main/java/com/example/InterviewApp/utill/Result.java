package com.example.InterviewApp.utill;

import java.io.Serializable;

public class Result implements Serializable {

    private int result;

    public Result() {
    }

    public Result(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
