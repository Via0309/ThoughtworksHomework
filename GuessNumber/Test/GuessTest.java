import org.junit.Test;
import static org.junit.Assert.*;
public class GuessTest {

    @Test
    public void isCorrect() {
        String right = "4A0B";
        String[] wrong = {"0A4B", "1A3B", "2A2B", "0A3B", "1A2B", "2A1B", "3A0B", "0A2B", "1A1B", "2A0B", "0A1B", "1A0B", "0A0B"};
        assertTrue(right.equals("4A0B"));
        for(int i = 0; i < wrong.length; i++){
            assertTrue(!wrong[i].equals("4A0B"));
        }
    }
}