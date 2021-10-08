package one.digitalinnovation.apipeoplemanagement2021.utils;

import one.digitalinnovation.apipeoplemanagement2021.dto.request.PersonDTO;
import one.digitalinnovation.apipeoplemanagement2021.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Reine Alexandre";
    private static final String LAST_NAME = "Morato";
    private static final String CPF_NUMBER = "000.232.336-21";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1975, 5, 14);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("14-05-1975")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
        //PAREI AQUI, 21 MINUTOS E 23 SEGUNDOS DA AULA 11.
    }

}
