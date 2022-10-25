package CustomerApp;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest){
        Customer1 customer = Customer1.builder()
                .name(customerRegistrationRequest.name())
                .email(customerRegistrationRequest.email())
                .build();
        customerRepository.save(customer);
    }
}
