import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class AnswerGeneratorTest {

    @Test
    public void generateNum() {
        AnswerGenerator answer = new AnswerGenerator();
        int limit = 100;
        for(int j = 0; j < limit; j++){
            String num = answer.generateNum();
            Set<Character> set = new HashSet<>();
            int count = 0;
            for(int i = 0; i < num.length(); i++){
                char c = num.charAt(i);
                set.add(c);
                if(c >= '0'&& c <= '9'){
                    count ++;
                }
            }
            assertTrue(count == 4);
            assertTrue(set.size() == 4);
        }
    }
}
