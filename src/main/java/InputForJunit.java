import java.io.ByteArrayInputStream;

public class InputForJunit {
    public void systemIn(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}
