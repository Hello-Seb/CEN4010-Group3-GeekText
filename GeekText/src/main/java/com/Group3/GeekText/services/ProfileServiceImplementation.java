/*
Sebastian Barnes - I am testing this class to see if it can accomplish more than our existing classes.
I haven't been unable to get it working yet, but I'm leaving it here as I continue to make changes.
 */

//package com.Group3.GeekText.services;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//import com.Group3.GeekText.entities.Profile;
//import com.Group3.GeekText.repositories.ProfilesRepository;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class ProfileServiceImplementation implements  ProfileService{
//    private static Map<String, Profile> ProfilesRepository = new HashMap<>();
//    static  {
//    }
//
//
//    public void createProfile(Profile profile){
//        ProfilesRepository.put(profile.getId(), profile);
//    }
//
//
//    public void updateProfile(String id, Profile profile){
//        ProfilesRepository.remove(id);
//        profile.setId(id);
//        ProfilesRepository.put(id, profile);
//    }
//
//    @Override
//    public Collection<Profile> getProfiles() {
//        return ProfilesRepository.values();
//    }
//}
