import java.io.IOException;
import java.net.URI;
import static org.junit.Assert.*;
import java.net.URISyntaxException;
import org.junit.Test;
import org.junit.Assert;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class DocSearchTest {
 
    @Test 
    public void testRequest() {
        try {
            Handler myHandler = new Handler("technical/");
            assertEquals("Don't know how to handle that path!", myHandler.handleRequest(new URI("test")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

// USE THESE COMMANDS: javac -cp ".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar" *.java
// USE THESE COMMANDS: java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore DocSearchTest