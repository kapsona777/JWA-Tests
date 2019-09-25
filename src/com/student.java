package com;

public class student {
    public String name;
    public String lastName;
    private int age;
    public void setAge(int _age) {
        age=_age;
    }
    public void printFullData(){
        System.out.println(name+" "+lastName+" "+age+" Wlis");
    }
}
