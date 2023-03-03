package com.Group3.GeekText.controllers;

import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProfilesController {

    @Autowired
    ProfileService profileService;

    private final ProfilesRepository profilesRepository;

    public ProfilesController(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    @GetMapping("/getAllProfiles")
    public List<Profile> getAllProfiles() {
        return profilesRepository.findAll();
    }

   @GetMapping("/profiles/{id}")
    public ResponseEntity<Profile> getById(@PathVariable long id) {
       Optional<Profile> profile = profileService.getById(id);

           return new ResponseEntity<>(profile.get(), HttpStatus.OK);

       }

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
