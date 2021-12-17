package com.ballaci.rest;

import com.ballaci.rest.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TheController implements PetsApi {

    @GetMapping("/aa")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @Override
    public ResponseEntity<List<Pet>> listPets(String limit) {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Spooky");
        pet.setTag("dogy");
        return new ResponseEntity<List<Pet>>(Collections.singletonList(pet), HttpStatus.OK);
    }
}
