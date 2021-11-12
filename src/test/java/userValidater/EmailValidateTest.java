package userValidater;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;

public class EmailValidateTest {
    private String email2Test;
    private boolean expected2Result;

    public EmailValidateTest(String email, boolean expectedResult) {
        this.email2Test = email;
        this.expected2Result = expectedResult;
    }

    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc", false},
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc.111@abc.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}});
    }

    @Test
    public void givenEmailShow() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress(this.email2Test);
        Assert.assertEquals(this.expected2Result,result);
    }
}

