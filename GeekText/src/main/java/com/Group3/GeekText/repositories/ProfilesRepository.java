package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfilesRepository extends CrudRepository<Profile, Integer> {
    List<Profile> findAll();
}
