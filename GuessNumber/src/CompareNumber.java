import java.util.*;

public class CompareNumber {
    public String compare(String sysNum, String userNum){
        int equal = 0;
        Set<Character> sysSet = new HashSet<>();
        Set<Character> userSet = new HashSet<>();
        for(int i = 0; i < sysNum.length(); i++){
            sysSet.add(sysNum.charAt(i));
            userSet.add(userNum.charAt(i));
            if(sysNum.charAt(i) == userNum.charAt(i))
                equal++;
        }
        sysSet.retainAll(userSet);
        int common = sysSet.size();
        String result = String.valueOf(equal) + "A" + String.valueOf(common-equal) + "B";
        return result;
    }
}
