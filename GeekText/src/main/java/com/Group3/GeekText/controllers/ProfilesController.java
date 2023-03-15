package com.Group3.GeekText.controllers;
import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.repositories.CreditCardRepository;
import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.entities.CreditCard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/profiles/username/{username}")
    public List<Profile> getByUsername(@PathVariable String username) {return profilesRepository.findByUsername(username); }

    @GetMapping("/profiles/name/{username}")
    public ResponseEntity<String> username(@PathVariable String username) {
        String name = profilesRepository.findNameByUsername(username);
        return new ResponseEntity<>(name, HttpStatus.OK);

    }

    @PostMapping("/profiles")
    public void postProfile(@RequestBody Profile profile) {
        Profile newProfile = new Profile();
        newProfile.setProfileID(profile.getProfileID());
        newProfile.setUsername(profile.getUsername());
        newProfile.setPassword(profile.getPassword());
        newProfile.setName(profile.getName());
        newProfile.setEmailAddress(profile.getEmailAddress());
        newProfile.setHomeAddress(profile.getHomeAddress());
        profilesRepository.save(newProfile);
    }

    @PutMapping("/profiles/update/{username}")
    public void updateProfile(@PathVariable String username, @RequestBody Profile updatedProfile) {

        Profile currentProfile = profilesRepository.findProfileByUsername(username);

        currentProfile.setUsername(updatedProfile.getUsername());
        currentProfile.setPassword(updatedProfile.getPassword());
        currentProfile.setName(updatedProfile.getName());
        currentProfile.setEmailAddress(updatedProfile.getEmailAddress());

        profilesRepository.save(currentProfile);

    }



}
