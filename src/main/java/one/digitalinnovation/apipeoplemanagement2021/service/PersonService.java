package one.digitalinnovation.apipeoplemanagement2021.service;

import one.digitalinnovation.apipeoplemanagement2021.dto.MessageResponseDTO;
import one.digitalinnovation.apipeoplemanagement2021.dto.request.PersonDTO;
import one.digitalinnovation.apipeoplemanagement2021.entity.Person;
import one.digitalinnovation.apipeoplemanagement2021.mapper.PersonMapper;
import one.digitalinnovation.apipeoplemanagement2021.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created personDTO with ID " + savedPerson.getId())
                .build();
    }
}
