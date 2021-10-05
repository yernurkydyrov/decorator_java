package pattern;

import java.text.MessageFormat;

public class ZinedineZidane extends DecoratorFootball{
    public ZinedineZidane(
            SoccerPLayer newFootball
    ) {
        super ( newFootball );
    }

    public String getSkills() {
        return MessageFormat.format ( "{0}FEINT ZIDANE, CIRCULAR CONE DRIBBLE DRILL " , tempFootball.getSkills () );
    }

    public double getCost() {
        return tempFootball.getCost () + 60_000_000.00;
    }

    public int numberOfBalloonDor() {
        return tempFootball.numberOfBalloonDor () + 1;
    }

}
