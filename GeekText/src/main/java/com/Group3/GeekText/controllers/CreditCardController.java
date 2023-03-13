package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.repositories.CreditCardRepository;
import com.Group3.GeekText.entities.CreditCard;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CreditCardController {


    private final CreditCardRepository creditCardRepository;

    public CreditCardController(CreditCardRepository creditCardRepository) {this.creditCardRepository = creditCardRepository;}

    @GetMapping("/getAllCreditCards")
    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    @PostMapping("/creditcards/{username}")
    public void postCreditCard(@RequestBody CreditCard creditCard, @RequestBody Profile username) {
        CreditCard newCreditCard = new CreditCard();
        newCreditCard.setCreditCardID(creditCard.getCreditCardID());
        //newCreditCard.setCardholder(username.getUsername());
        newCreditCard.setCvv(creditCard.getCvv());
        newCreditCard.setExpirationDate(creditCard.getExpirationDate());

    }


}
