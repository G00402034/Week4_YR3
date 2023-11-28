package ie.atu.week4_userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "confirmation-service-1", url = "http://localhost:8082")
public interface RegistrationClientService {
    @PostMapping("/confirm")
    Map<String, String> someDetails(@RequestBody UserDetails userDetails);
}
