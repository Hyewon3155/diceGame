package DiceGame;
public class DiceGame {
	Player player1;
    Player player2;
    
    public DiceGame(String player1Name, String player2Name) {
    		this.player1 = new Player(player1Name);
    		this.player2 = new Player(player2Name);
    }
    	
    public void roll() {
        System.out.println("게임을 시작합니다!");
        player1.rollDice();
        System.out.println(player1.getName() + "의 주사위 값: " + player1.getDice1Value() + ", " + player1.getDice2Value());

        player2.rollDice();
        System.out.println(player2.getName() + "의 주사위 값: " + player2.getDice1Value() + ", " + player2.getDice2Value());

    }
    
    public void viewScore() {
        System.out.println(player1.getName() + "의 총합: " + player1.getSum());
        System.out.println(player2.getName() + "의 총합: " + player2.getSum());

        if (player1.getSum() > player2.getSum()) {
            System.out.println(player1.getName() + "이(가) 승리하였습니다!");
        } else if (player1.getSum() < player2.getSum()) {
            System.out.println(player2.getName() + "이(가) 승리하였습니다!");
        } else {
            if (player1.getMax() > player2.getMax()) {
                System.out.println(player1.getName() + "이(가) 승리하였습니다!");
            } else if (player1.getMax() < player2.getMax()) {
                System.out.println(player2.getName() + "이(가) 승리하였습니다!");
            } else {
                System.out.println("무승부입니다!");
            }
        }
    }
}

