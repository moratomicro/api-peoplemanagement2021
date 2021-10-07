package one.digitalinnovation.apipeoplemanagement2021.controller;


import one.digitalinnovation.apipeoplemanagement2021.dto.MessageResponseDTO;
import one.digitalinnovation.apipeoplemanagement2021.dto.request.PersonDTO;
import one.digitalinnovation.apipeoplemanagement2021.entity.Person;
import one.digitalinnovation.apipeoplemanagement2021.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {

        return personService.createPerson(personDTO);
    }
}
