package com.euroTech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before (order = 0)
    public void setUp(){
        System.out.println("***BEFORE SCENARIO***");
    }
    @After (order = 0)
    public void tearDown(){
        System.out.println("****AFTER SCENARIO****");
    }
    @Before (value = "@rosa",order = 1)
    public void setUpRosa(){
        System.out.println("***BEFORE SCENARIO ROSA***");
    }
    @After (value = "@rosa",order = 1)
    public void tearDownRosa(){
        System.out.println("****AFTER SCENARIO ROSA****");
    }
}
