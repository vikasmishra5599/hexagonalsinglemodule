package com.example.service.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HexRepository extends JpaRepository<Person, Long> {
    List<Person> getPersonByName(String name);
}
