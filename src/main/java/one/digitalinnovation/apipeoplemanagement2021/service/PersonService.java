package one.digitalinnovation.apipeoplemanagement2021.service;

import one.digitalinnovation.apipeoplemanagement2021.dto.MessageResponseDTO;
import one.digitalinnovation.apipeoplemanagement2021.entity.Person;
import one.digitalinnovation.apipeoplemanagement2021.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }
}
