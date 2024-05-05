package com.example.temel_kavramlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonService {

    @Autowired
    private PersonDataAccessObject personDataAccessObject;

    public List<PersonDataTransferObject>getAllPersons(){
        List<Person> persons = personDataAccessObject.findAll();
        List<PersonDataTransferObject> personDataTransferObjectList = new ArrayList<>();
        for(Person person : persons){
            PersonDataTransferObject personDataTransferObject = new PersonDataTransferObject();
            personDataTransferObject.setId(person.getId());
            personDataTransferObject.setName(person.getName());
            personDataTransferObjectList.add(personDataTransferObject);
        }
        return personDataTransferObjectList;
    }

    public Person savePerson(PersonDataTransferObject personDataTransferObject){

        Person person = new Person();
        person.setName(personDataTransferObject.getName());
        return personDataAccessObject.save(person);
    }

    public void deletePerson(Long id){
         personDataAccessObject.delete(personDataAccessObject.findById(id));
    }

}
