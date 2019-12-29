package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest
{
    @Test
    public void demoTest()
    {
        String message = "Hello, duniaaa..!!!";

        System.out.println(message);

        Assert.assertEquals(message, "Hello, duniaaa..!!!");
    }
}
