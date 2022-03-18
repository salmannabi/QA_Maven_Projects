package com.qa.solid.dependency_inversion.exercise;

public class Project {	
    public void implement(Developer developer) {
        developer.writeMessage();
    }
}
