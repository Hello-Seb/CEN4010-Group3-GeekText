package com.Group3.GeekText.controllers;

import com.Group3.GeekText.repositories.CreditCardsRepository;
import com.Group3.GeekText.entities.CreditCards;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CreditCardsController {


    private final CreditCardsRepository creditCardsRepository;

    public CreditCardsController(CreditCardsRepository creditCardsRepository) {
        this.creditCardsRepository = creditCardsRepository;
    }

    @GetMapping("/getAllCreditCards")
    public List<CreditCards> getAllCreditCards() {
        return creditCardsRepository.findAll();
    }




}
