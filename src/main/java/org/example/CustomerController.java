package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
public class CustomerController {
    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    CustomerRepository customerRepository;
    //create a customer
    @PostMapping("/createnewcustomer")
    public  String createNewCustomer(@RequestBody Customer customer){
        customerRepository.save(customer);
        return "customer created";
    }


    //list all customers
    @GetMapping("/listallcustomers")
    public List<Customer> getAllCustomers(){
        //return Arrays.asList(new Customer("vamsi","INDIA","AP","retail"));
        List<Customer> customerList = new LinkedList<>();

        Iterable<Customer> iterable = customerRepository.findAll();
        iterable.forEach(customerList::add);

        return customerList;
    }

}
