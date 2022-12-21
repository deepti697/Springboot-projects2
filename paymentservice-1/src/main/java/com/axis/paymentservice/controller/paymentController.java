package com.axis.paymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class paymentController {
	@GetMapping("/payNow/{price}")
    public String payNow(@PathVariable String price) {
                return "Payment with " + price + " is successful";

    }
    
    @GetMapping("/greet")
    public String greet() {
        return "hello";
    }

}
