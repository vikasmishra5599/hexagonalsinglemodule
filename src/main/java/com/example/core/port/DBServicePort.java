package com.example.core.port;


import com.example.core.data.Person;

public interface DBServicePort {
    Person getPerson(String fname);
}
