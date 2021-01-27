package calculadora.demo.Services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalService {
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
}
