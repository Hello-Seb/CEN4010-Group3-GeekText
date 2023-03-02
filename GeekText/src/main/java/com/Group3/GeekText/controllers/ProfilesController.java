package com.Group3.GeekText.controllers;

import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.entities.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class ProfilesController {


    private final ProfilesRepository profilesRepository;

    public ProfilesController(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    @GetMapping("/getAllProfiles")
    public List<Profile> getAllProfiles() {
        return profilesRepository.findAll();
    }

//    @GetMapping("/profiles/{id}")
//    public ResponseEntity<Profile> findProfileID(long id) {
//        Profile profile = profilesRepository.findByID(id);
//        return ResponseEntity.ok(profile);
//    }

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

    @PostMapping("/profiles")
    public void postProfile(@RequestBody Profile profile) {
        Profile newProfile = new Profile();
        newProfile.setProfileID(profile.getProfileID());
        newProfile.setUsername(profile.getUsername());
        newProfile.setName(profile.getName());
        newProfile.setEmailAddress(profile.getEmailAddress());
        newProfile.setHomeAddress(profile.getHomeAddress());
        profilesRepository.save(newProfile);
    }





}
