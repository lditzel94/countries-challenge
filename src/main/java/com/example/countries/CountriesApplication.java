package com.example.countries;

import com.example.countries.model.Country;
import com.example.countries.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CountriesApplication {

    public static void main( String[] args ) {
        SpringApplication.run( CountriesApplication.class, args );
    }

    @Bean
    CommandLineRunner runner( CountryRepository repository ) {
        return args -> {
            var country = new Country();
            country.setName( "Argentina" );
            repository.save( country );
        };
    }
}
