package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Payment;
import com.example.repository.PaymentRepository;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentRepository paymentrepository;
	
	@PostMapping("/add")
	public Payment addNewProduct(@RequestBody Payment p) {
		return paymentrepository.save(p);
	}
	
	@GetMapping("/get")
	public List<Payment> allPayment(){
		return paymentrepository.findAll();
	}
	

}
