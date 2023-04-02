package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfilesRepository extends CrudRepository<Profile, Long> {

    List<Profile> findAll();

    List<Profile> findByUsername(String Username);

    Profile findProfileByUsername(String Username);

    @Query("SELECT x.name FROM Profile x WHERE x.username = :username")
    String findNameByUsername(@Param("username") String username);

    @Query("SELECT x.homeAddress FROM Profile x WHERE x.username = :username")
    String findAddressByUsername(@Param("username") String username);
}




