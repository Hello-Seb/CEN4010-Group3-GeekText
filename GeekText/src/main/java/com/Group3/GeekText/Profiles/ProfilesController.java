package com.Group3.GeekText.Profiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProfilesController {


    private final ProfilesRepository profilesRepository;

    public ProfilesController(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    @GetMapping("/getAllProfiles")
    public List<Profiles> getAllProfiles() {
        return profilesRepository.findAll();
    }
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }



}
