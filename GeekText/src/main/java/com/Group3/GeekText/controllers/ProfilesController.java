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
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

//    @RequestMapping(value = "/profiles/{id}", method = RequestMethod.POST)
//    public List<Profile>
//    createProfile(@RequestBody Profile profile) {
//
//        ProfileService.createProfile(profile);
//
//        return new ArrayList<>();
//    }

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
