package calculadora.demo.Services;

import calculadora.demo.Models.Calculator;
import calculadora.demo.Repositories.CalculatorRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class CalculatorService {
    private final CalculatorRepository calculatorRepository;

    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }
    @PostMapping("/add")
    public String add(@RequestBody Calculator calculator){
        return calculatorRepository.add(calculator);
    }
    @PostMapping("/subtract")
    public String subtract(@RequestBody Calculator calculator){
        return calculatorRepository.subtract(calculator);
    }
    @PostMapping("/multiply")
    public String multiply(@RequestBody Calculator calculator){
        return calculatorRepository.multiply(calculator);
    }
    @PostMapping("/divide")
    public String divide(@RequestBody Calculator calculator){
        return calculatorRepository.divide(calculator);
    }
}
