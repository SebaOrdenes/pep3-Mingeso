package calculadora.demo.Repositories;

import calculadora.demo.Models.Calculator;

public interface CalculatorRepository {
    public String add(Calculator calculator);
    public String subtract(Calculator calculator);
    public String multiply(Calculator calculator);
    public String divide(Calculator calculator);
}
