package com.Group3.GeekText;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfilesController {

    @Autowired
    public ProfilesRepository profilesRepository;

    @GetMapping("/getAllProfiles")
    public List<Profiles> getAllProfiles() {
        return profilesRepository.findAll();
    }
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }


}
