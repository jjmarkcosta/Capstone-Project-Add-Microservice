package com.nmscinema.Capstone_Project_Add_Microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmscinema.Capstone_Project_Add_Microservice.model.Purchase;
import com.nmscinema.Capstone_Project_Add_Microservice.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

	@Autowired
	PurchaseRepository repository;

	@GetMapping("/save")
	public Boolean savePurchase(@RequestParam String customerName, @RequestParam String movieName,
			@RequestParam Integer ticketNumber, @RequestParam String customerEmail) {

		Purchase purchase = new Purchase(null, customerName, movieName, ticketNumber, customerEmail);

		try {
			repository.save(purchase);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
