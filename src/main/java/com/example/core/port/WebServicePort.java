package com.example.core.port;


import com.example.core.data.UniversityByState;

import java.util.List;

public interface WebServicePort {
    List<UniversityByState> getUniversities(String country);
}
