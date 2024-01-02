package 십일월일일;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Character hiddenString = new Character("hello");
        Character userString = new Character();
        int remainder = 5;
        
        System.out.println("단어 맞추기 게임을 시작합니다!");

        while (remainder > 0) {
            System.out.println(userString.getUserString());

            System.out.print("한 문자를 입력하세요: ");
            char guess = in.next().charAt(0);

            boolean isCorrect = hiddenString.guessLetter(guess);
            
            if (isCorrect) {
                if (hiddenString.isWordGuessed()) {
                    System.out.println("축하합니다.");
                    break;
                }
            }
            remainder--;
        }

        in.close();
    }
}

class Character {
    private String hS;
    private StringBuilder uS;
    Scanner in = new Scanner(System.in);
    
    public Character() {
        uS = new StringBuilder("-----");
    }

    public Character(String word) {
        hS = word;
        uS = new StringBuilder("-----");
    }

    public boolean guessLetter(char ch) {
        boolean isCorrect = false;
        
        for (int i = 0; i < hS.length(); i++) {
            if (hS.charAt(i) == ch && uS.charAt(i) == '-') {
                uS.setCharAt(i, ch);
                isCorrect = true;
            }
        }
        
        return isCorrect;
    }

    public String getHiddenString() {
        return hS;
    }

    public String getUserString() {
        return uS.toString();
    }

    public boolean isWordGuessed() {
        return uS.indexOf("-") == -1;
    }
}
