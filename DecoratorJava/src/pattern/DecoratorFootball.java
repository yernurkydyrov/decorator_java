package pattern;

public abstract class DecoratorFootball implements SoccerPLayer {

    protected SoccerPLayer tempFootball;

    public DecoratorFootball(SoccerPLayer newFootball) {
        tempFootball = newFootball;
    }

    public String getSkills() {
        return tempFootball.getSkills ();
    }

    public double getCost() {
        return tempFootball.getCost ();
    }

    public int numberOfBalloonDor() {
        return tempFootball.numberOfBalloonDor ();
    }
}
