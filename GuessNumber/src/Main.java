import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Guess guess = new Guess();
        int times = 6;
        System.out.println("Welcome!");
        System.out.println();
        System.out.printf("Please input your number(%d):", times);
        while(times > 0){
            String userNum = sc.nextLine();
            if (isDuplicate(userNum)){
                System.out.println("Cannot input duplicate numbers!");
                continue;
            }
            if(guess.isCorrect(userNum)){
                System.out.println("Congratulations!");
                break;
            }
            else{
                times--;
                System.out.println(guess.result);
                System.out.println();
                if (times != 0){
                    System.out.printf("Please input your number(%d):", times);
                }

            }
        }
        if(times == 0){
            System.out.println("Game over");
        }
    }
    public static boolean isDuplicate(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        if(set.size() < 4){
            return true;
        }
        return false;
    }
}