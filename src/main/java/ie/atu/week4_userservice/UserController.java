package ie.atu.week4_userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final RegistrationClientService registrationClientService;

    @Autowired
    public UserController(RegistrationClientService registrationClientService) {
        this.registrationClientService = registrationClientService;
    }

    @PostMapping("/confirm-and-register")
    public Object confirmAndRegister(@RequestBody UserDetails userDetails) {
        System.out.println("User details received at UserController: " + userDetails);
        return registrationClientService.details(userDetails);
    }
}
