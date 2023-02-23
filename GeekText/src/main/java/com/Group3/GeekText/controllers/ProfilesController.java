package com.Group3.GeekText.controllers;

import com.Group3.GeekText.repositories.ProfilesRepository;
import com.Group3.GeekText.entities.Profiles;
import org.springframework.http.ResponseEntity;
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
    public List<Profiles> getAllProfiles() {
        return profilesRepository.findAll();
    }
    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }

    /*
    @RequestMapping(value = "/createProfile" , method = RequestMethod.POST)
    public @ResponseBody Profiles save(@RequestBody Profiles jsonString) {

        Profiles profile=personService.savedata(jsonString);
        return profile;
    }
*/

}
