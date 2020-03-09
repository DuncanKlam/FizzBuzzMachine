import java.sql.SQLOutput;

public class FizzBuzz {

    private int lengthOfLoop;
    private String firstWord;
    private String secondWord;

    public FizzBuzz(int fizzBuzzAmount){
        lengthOfLoop = fizzBuzzAmount;
    }

    public void doTheFizzBuzz(){
        for(int i = 0; i <= lengthOfLoop; i++){
            firstWord = Integer.toString(i);
            secondWord = "";
            if (i%5 == 0){
                firstWord = "";
                secondWord = "Buzz";
            }
            if (i%3 == 0){
                firstWord = "Fizz";
            }
            printTheFizzBuzz(firstWord,secondWord);
        }
    }

    public void printTheFizzBuzz(String aFirstWord, String aSecondWord){
        System.out.println(aFirstWord+aSecondWord);
    }
}
