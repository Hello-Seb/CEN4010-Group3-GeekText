/*
package com.Group3.GeekText;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/")
public class ProfilesController {

    private final ProfilesRepository profilesRepository;

    public ProfilesController(ProfilesRepository profilesRepository) {
        this.profilesRepository = profilesRepository;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Profiles createProfiles(@RequestBody Profiles profiles) {
        return profilesRepository.save(profiles);
    }

    @GetMapping("/")
    public Iterable<Profiles> getProfiles() {
        return profilesRepository.findAll();
    }
}
*/
