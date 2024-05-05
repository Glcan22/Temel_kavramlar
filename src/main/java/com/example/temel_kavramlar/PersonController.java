package com.example.temel_kavramlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // @Controllerla arasındaki fark tam olarak ne anlayamadım
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<PersonDataTransferObject> getAllPersons(){
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    public Person savePerson(@RequestBody PersonDataTransferObject personDataTransferObject){
        return personService.savePerson(personDataTransferObject);
    }

    @DeleteMapping("/persons/{id}")
    public  void deletePerson(@PathVariable Long id){
         personService.deletePerson(id);
    }
}
