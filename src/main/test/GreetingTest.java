import com.example.herokupipeexample.Greeting;
import io.logz.logback.LogzioLogbackAppender;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingTest {


    @Test
   public void testGreeting(){
        Logger logger = LoggerFactory.getLogger(LogzioLogbackAppender.class);

        logger.info("Testing the Greeting class");

        long testId = 0;
        String testContent = "Hello world!";

        Greeting greeting = new Greeting(testId, testContent);

        Assert.assertEquals(testId, greeting.getId());
        Assert.assertEquals(testContent, greeting.getContent());
    }
}
