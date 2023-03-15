package com.Group3.GeekText.controllers;

import com.Group3.GeekText.entities.Profile;
import com.Group3.GeekText.repositories.CreditCardRepository;
import com.Group3.GeekText.entities.CreditCard;
import com.Group3.GeekText.repositories.ProfilesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CreditCardController {


    private final CreditCardRepository creditCardRepository;

    private final ProfilesRepository profilesRepository;

    public CreditCardController(CreditCardRepository creditCardRepository, ProfilesRepository profilesRepository) {this.creditCardRepository = creditCardRepository;
        this.profilesRepository = profilesRepository;
    }

    @GetMapping("/getAllCreditCards")
    public List<CreditCard> getAllCreditCards() {
        return creditCardRepository.findAll();
    }

    @PostMapping("/creditcards/{username}")
    public void postCreditCard(@RequestBody CreditCard creditCard, @PathVariable String username) {
        CreditCard newCreditCard = new CreditCard();
        newCreditCard.setCreditCardID(creditCard.getCreditCardID());
        newCreditCard.setCardholder(profilesRepository.findNameByUsername(username));
        newCreditCard.setBillingAddress(profilesRepository.findAddressByUsername(username));
        newCreditCard.setCvv(creditCard.getCvv());
        newCreditCard.setExpirationDate(creditCard.getExpirationDate());
        newCreditCard.setCreditCardNumber(creditCard.getCreditCardNumber());
        creditCardRepository.save(newCreditCard);
    }

//    @GetMapping("/profiles/name/{username}")
//    public ResponseEntity<String> username(@PathVariable String username) {
//        String name = profilesRepository.findNameByUsername(username);
//        return new ResponseEntity<>(name, HttpStatus.OK);
//
//    }


}
