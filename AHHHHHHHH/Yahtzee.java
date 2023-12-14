
public class Yahtzee
{
    Die6 die1 = new Die6();
    Die6 die2 = new Die6();
    Die6 die3 = new Die6();
    Die6 die4 = new Die6();
    Die6 die5 = new Die6();
    private Die6[] dice = {die1, die2, die3, die4, die5};
    int [] values = new int[6];

    /**
     * Roll the die! Generate random number 1 <= x <= 6 and assign to value
     * Note that roll does NOT return the new value
     */
    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public int roll(int dieNumber){
        
        return dice[dieNumber - 1].roll();
    }

    public String summarize() {

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;

         for(int i=0; i < 5; i++){
            if(dice[i].getValue() == 1) d1=d1+1;
            if(dice[i].getValue() == 2) d2=d2+1;
            if(dice[i].getValue() == 3) d3=d3+1;
            if(dice[i].getValue() == 4) d4=d4+1;
            if(dice[i].getValue() == 5) d5=d5+1;
            if(dice[i].getValue() == 6) d6=d6+1;
        }

        return "1-" + d1 + "; " + "2-" + d2 + "; " + "3-" + d3 + "; " 
        + "4-" + d4 + "; " + "5-" + d5 + "; " + "6-" + d6;
    }

    /**
     * Roll the die and return the new value
     * @return Die value
     */
    public String rollAndGetValue() {
        roll();
        summarize();
        return summarize();
    }

    public String toString() {
        return "Dice values: " + die1.getValue() + " " + die2.getValue() + " " 
        + die3.getValue() + " " + die4.getValue() + " "+ die5.getValue();
    }

}