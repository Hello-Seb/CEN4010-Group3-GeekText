package com.Group3.GeekText.CreditCards;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditCardsRepository extends CrudRepository<CreditCards, Integer> {
    List<CreditCards> findAll();
}
