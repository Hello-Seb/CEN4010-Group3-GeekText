package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.services.ProfileService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProfilesRepository extends CrudRepository<Profile, Long> {


    List<Profile> findAll();


}
