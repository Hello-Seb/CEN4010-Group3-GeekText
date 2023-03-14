package com.Group3.GeekText.controllers;
import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.repositories.CreditCardRepository;
import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.entities.CreditCard;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

//    @GetMapping("/profiles/id/{id}")
//    public ResponseEntity<Profile> getById(@PathVariable long id) {
//       Optional<Profile> profile = profilesRepository.findById(id);
//
//           return new ResponseEntity<>(profile.get(), HttpStatus.OK);
//       }

    @GetMapping("/profiles/username/{username}")
    public List<Profile> getByUsername(@PathVariable String username) {return profilesRepository.findByUsername(username); }

    @GetMapping("/profiles/name/{username}")
    public ResponseEntity<String> username(@PathVariable String username) {
        String name = profilesRepository.findNameByUsername(username);
        return new ResponseEntity<>(name, HttpStatus.OK);

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
        newProfile.setPassword(profile.getPassword());
        newProfile.setName(profile.getName());
        newProfile.setEmailAddress(profile.getEmailAddress());
        newProfile.setHomeAddress(profile.getHomeAddress());
        profilesRepository.save(newProfile);
    }

    @PatchMapping("/profiles/{username}")
    public ResponseEntity<Profile> updateProfile(@PathVariable String username, @RequestBody Profile profile) {

        //Profile updatedProfile = profilesRepository.findByUsername(username);
        {
            profile.setProfileID(profile.getProfileID());
            profile.setUsername(profile.getUsername());
            profile.setName(profile.getName());
            profile.setEmailAddress(profile.getEmailAddress());
        }

        return null;
    }



}
