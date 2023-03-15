package com.Group3.GeekText.services;

import com.Group3.GeekText.entities.Author;
import com.Group3.GeekText.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Group3.GeekText.entities.Profile;
import java.util.Collection;
import java.util.Optional;
import java.util.*;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

}