package com.example.temel_kavramlar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

    //getter
    public Long getId(){
        return id;
    }
    // setter
    public void setId(Long newId){
        this.id= newId;
    }
    //getter
    public String getName(){
        return name;
    }
    // setter
    public void setName(String newName){
        this.name= newName;
    }
    //getter
    public int getAge(){
        return age;
    }
    // setter
    public void setAge(int newAge){
        this.age= newAge;
    }

}
