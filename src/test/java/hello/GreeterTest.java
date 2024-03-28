package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

import dto.MyDto;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class GreeterTest {
	
	private Greeter greeter = new Greeter();
	private MyDto dtoObject = new MyDto(null, 20, null);

	@Test
	public void greeterSaysHello() {
		assertThat(greeter.sayHello(), containsString("Hello"));

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
      
        Set<ConstraintViolation<MyDto>> violations = validator.validate(dtoObject);
		assertThat(violations.size(), is(1));
        for (ConstraintViolation<MyDto> violation : violations) {
        	System.out.println(violation.getMessage()); 
        }
	}

}
