package DiceGame;
import java.util.*;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("플레이어 1의 이름을 입력하세요: ");
	        String player1Name = scanner.nextLine();

	        System.out.print("플레이어 2의 이름을 입력하세요: ");
	        String player2Name = scanner.nextLine();
	        
	        scanner.close();

	        DiceGame game = new DiceGame(player1Name, player2Name);
	        game.roll();

	    }
}