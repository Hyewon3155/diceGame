package DiceGame;

public class Player {
    private String name;
    private Dice d1;
    private Dice d2;

    public Player(String name) {
        this.name = name;
        this.d1 = new Dice();
        this.d2 = new Dice();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return d1.getValue() + d2.getValue();
    }

    public int getMax() {
        return Math.max(d1.getValue(), d2.getValue());
    }

    public void rollDice() {
        d1.roll();
        d2.roll();
    }

    public int getDice1Value() {
        return d1.getValue();
    }

    public int getDice2Value() {
        return d2.getValue();
    }
}
