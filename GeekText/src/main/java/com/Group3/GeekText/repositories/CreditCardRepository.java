package com.Group3.GeekText.repositories;

import com.Group3.GeekText.entities.CreditCard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardRepository extends CrudRepository<CreditCard, Long> {
    List<CreditCard> findAll();
}
