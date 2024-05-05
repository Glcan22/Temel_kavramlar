package com.example.temel_kavramlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDataAccessObject {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAll(){
        return personRepository.findAll();
    }
    public Person findById(Long id){
        return personRepository.findById(id).get();
    }

    public Person save(Person person){
        return personRepository.save(person);
    }

    public void delete(Person person){
        personRepository.delete(person);
    }
}
