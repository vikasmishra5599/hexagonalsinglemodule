package com.example.service.db;

import com.example.core.port.DBServicePort;
import com.example.core.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.util.CollectionUtils.isEmpty;

@Service
public class HexDao implements DBServicePort {

    @Autowired
    HexRepository hexRepository;

    @Override
    public Person getPerson(String fname) {
        List<com.example.service.db.Person> persons = hexRepository.getPersonByName(fname);
        if(isEmpty(persons)) {
            return null;
        }

        com.example.service.db.Person entity = persons.get(0);
        return Person.builder()
                .fname(entity.getName())
                .lname(entity.getLname())
                .age(entity.getAge())
                .country(entity.getCountry())
                .build();
    }
}
