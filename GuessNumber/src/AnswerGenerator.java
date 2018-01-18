import java.util.*;
public class AnswerGenerator {
    public String generateNum(){
        String sysNum = "";
        Random random = new Random();
        Set<Integer> numSet = new HashSet<>();
        while(sysNum.length() < 4){
            int n = random.nextInt(10);
            if(!numSet.contains(n)){
                numSet.add(n);
                sysNum = sysNum + String.valueOf(n);
            }
        }
        return sysNum;
    }
}
