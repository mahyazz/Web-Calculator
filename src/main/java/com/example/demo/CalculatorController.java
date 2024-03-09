import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

	@GetMapping("/calc/{operator}/{op1}/{op2}")
	public String calculate(@PathVariable String operator, @PathVariable double op1, @PathVariable double op2) {
		double result;

		switch (operator) {
			case "add":
				result = op1 + op2;
				return op1 + " + " + op2 + " = " + result;
			case "subtract":
				result = op1 - op2;
				return op1 + " - " + op2 + " = " + result;
			case "multiply":
				result = op1 * op2;
				return op1 + " * " + op2 + " = " + result;
			case "divide":
				if (op2 != 0) {
					result = op1 / op2;
					return op1 + " / " + op2 + " = " + result;
				} else {
					return "Cannot divide by zero!";
				}
			default:
				return "Invalid operator. Supported operators: add, subtract, multiply, divide.";
		}
	}
}
