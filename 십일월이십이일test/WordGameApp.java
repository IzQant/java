package 십일월이십이일test;

import java.util.Scanner;

public class WordGameApp {
	Scanner in;
	String startword = "국민대";
	Player[] players;
	
	WordGameApp() {
		in = new Scanner(System.in);
	}
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
        game.createPlayer();
        game.run();
		
	}
	void createPlayer() {
		System.out.print("참가자의 수를 입력하세요 :");
		int playernum = in.nextInt();
		in.nextLine();
		players = new Player[playernum];
		for (int i = 0; i < players.length; i++) {
			System.out.print("참가자의 이름을 입력하세요");
			String playerName = in.nextLine();
			players[i] = new Player(playerName, in);
		}	
	}
		
		
	void run() {
		String currentWord = startword;
		System.out.println("시작 단어는" + startword + "입니다.");

        while (true) {
            for (Player player : players) {
                System.out.println(player.getName() + ">>");
                String userWord = player.getWordFromUser();
                if (!player.checkSuccess(currentWord)) {
                    System.out.println(player.getName() + "이 졌습니다");
                    return;
                }
                currentWord = userWord;
            }
        }
	}
}

class Player extends WordGameApp {
	Scanner in;
	String name;
	String word;
	
	String getName() {
		return name;
	}
	
	String getWordFromUser() {
		System.out.print(name + ">>");
	    word =  in.nextLine();
	    return word;
	}
	
	boolean checkSuccess(String lastWord) {
		char lastChar = lastWord.charAt(lastWord.length() - 1);
        char firstChar = word.charAt(0);

        if (lastChar == firstChar) {
            return true;
        } else {
            return false;
        }
	}
	
	Player(String name, Scanner scanner) {
		this.name = name;
		this.in = scanner;
	}
}

