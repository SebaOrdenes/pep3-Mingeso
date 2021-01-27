package calculadora.demo.Repositories;

import calculadora.demo.Models.Calculator;
import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepositoryImplementation implements CalculatorRepository {

    @Override
    public String add(Calculator calculator) {
        try{
           int number1 = Integer.parseInt(calculator.getNumberOne());
           int number2= Integer.parseInt(calculator.getNumberTwo());
           int result= number1 + number2;
           return result + "";
        }
        catch(Exception e){
            return "Ocurrió un error al intentar sumar";
        }
    }

    @Override
    public String subtract(Calculator calculator) {
        try{
            int number1 = Integer.parseInt(calculator.getNumberOne());
            int number2= Integer.parseInt(calculator.getNumberTwo());
            int result= number1 - number2;
            return result + "";
        }
        catch(Exception e){
            return "Ocurrió un error al intentar restar";
        }
    }

    @Override
    public String multiply(Calculator calculator) {
        try{
            int number1 = Integer.parseInt(calculator.getNumberOne());
            int number2= Integer.parseInt(calculator.getNumberTwo());
            int result= number1 * number2;
            return result + "";
        }
        catch(Exception e){
            return "Ocurrió un error al intentar multiplicar";
        }
    }

    @Override
    public String divide(Calculator calculator) {
        try{
            int number1 = Integer.parseInt(calculator.getNumberOne());
            int number2= Integer.parseInt(calculator.getNumberTwo());
            float result= ((float)number1 / (float)number2);
            return result + "";
        }
        catch(Exception e){
            return "Ocurrió un error al intentar dividir";
        }
    }
}
