package com.net.ksi.springboot;

import com.net.ksi.springboot.model.User;
import com.net.ksi.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBackendApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception{
        this.userRepository.save(new User("Shafiq", "Islam", "ksishafiq007@yahoo.com"));
        this.userRepository.save(new User("Mitali", "Hasan", "mitali@yahoo.com"));
        this.userRepository.save(new User("Rahinur", "Mizan", "mahinur@gmail.com"));

    }

}
