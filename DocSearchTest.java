import java.io.IOException;
import java.net.URI;
import static org.junit.Assert.*;
import java.net.URISyntaxException;
import org.junit.Test;
import org.junit.Assert;

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
