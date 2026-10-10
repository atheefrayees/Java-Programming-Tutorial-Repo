package uk.ac.westminster.productsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable("id") Long id) {

        Address address = new Address("122A, SriVajiragnana Mawatha", "Maradana" ,"Colombo 0900");

        return new Customer(id, "Atheef", "atheefrayes@gmail.com", address);
    }
}