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
            assertEquals("", myHandler.handleRequest(new URI("test")));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

