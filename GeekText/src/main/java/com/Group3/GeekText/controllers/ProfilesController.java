package com.Group3.GeekText.controllers;
import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.entities.Profile;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/profiles/username/{username}")
    public List<Profile> getByUsername(@PathVariable String username) {return profilesRepository.findByUsername(username); }


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

        if (updatedProfile.getUsername() != null) {
            currentProfile.setUsername(updatedProfile.getUsername());
        }
        if (updatedProfile.getPassword() != null) {
            currentProfile.setPassword(updatedProfile.getPassword());
        }
        if (updatedProfile.getName() != null) {
            currentProfile.setName(updatedProfile.getName());
        }
        if (updatedProfile.getEmailAddress() != null) {
            currentProfile.setEmailAddress(updatedProfile.getEmailAddress());
        }

        profilesRepository.save(currentProfile);

    }



}
