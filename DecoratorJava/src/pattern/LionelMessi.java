package pattern;

public class LionelMessi extends DecoratorFootball{
    public LionelMessi(SoccerPLayer newFootball) {
        super ( newFootball );
        System.out.println ("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t===G.O.A.T===\n");
    }

    public String getSkills() {
        return "%sFEINT ZIDANE, CIRCULAR CONE DRIBBLE DRILL, ONE AGAINST TWO DRIBBLE DRILL, ROUND THE CYCLIC CONE DRIBBLE DRILL".formatted ( tempFootball.getSkills () );
    }

    public double getCost() {
        return tempFootball.getCost () + 200_000_000.00;
    }

    public int numberOfBalloonDor() {
        return tempFootball.numberOfBalloonDor () + 5;
    }

}
