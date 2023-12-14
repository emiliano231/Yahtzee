public class Die6
{

    private int value;

    public Die6() {
        this.roll();
    }

    public int roll() {
        this.value = (int)(Math.random() * 6) + 1;
        return  this.value;
    }

    public int getValue() {
        return roll();
    }

}
