package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Profiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfilesRepository extends CrudRepository<Profiles, Integer> {
    List<Profiles> findAll();
}
