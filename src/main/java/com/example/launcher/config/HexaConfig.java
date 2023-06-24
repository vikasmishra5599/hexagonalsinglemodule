package com.example.launcher.config;

import com.example.core.port.APIServicePort;
import com.example.core.port.DBServicePort;
import com.example.core.port.WebServicePort;
import com.example.core.service.HexaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HexaConfig {

    private DBServicePort dbServicePort;
    private WebServicePort webServicePort;

    @Autowired
    public HexaConfig(DBServicePort dbServicePort, WebServicePort webServicePort) {
        this.dbServicePort = dbServicePort;
        this.webServicePort = webServicePort;
    }

    @Bean
    public APIServicePort apiService() {
        return new HexaService(dbServicePort, webServicePort);
    }
}
