public class Guess {
    public String sysNum;
    public String result;
    public boolean isCorrect(String userNum){
        AnswerGenerator answer = new AnswerGenerator();
        this.sysNum = answer.generateNum();
        CompareNumber compareNumber = new CompareNumber();
        this.result = compareNumber.compare(this.sysNum, userNum);
        if(this.result.equals("4A0B"))
            return true;
        return false;
    }
}
