package com.example.lesson39.controllers;

import com.example.lesson39.model.Purchase;
import com.example.lesson39.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/puchase")
public class PurchaseController {

    private  final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchase(){
        return purchaseRepository.findAllPurchase();
    }
}
