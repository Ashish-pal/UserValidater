package userValidater;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidate {
    @Test
    public void givenFirstName() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ashish");
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenEmailAddress() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Pal");
        Assert.assertFalse(result);
    }
}
