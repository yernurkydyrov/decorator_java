package pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SoccerPLayer soccerPLayer = new LionelMessi (
                new ZinedineZidane (
                        new Decorator ()
                )
        );
        System.out.printf ( "Skills: %s\n\nPrice on Transfer Market: %s$\n\nAmount of Balloon d'Or: %d%n" , soccerPLayer.getSkills () , (int)soccerPLayer.getCost () , soccerPLayer.numberOfBalloonDor () );
    }
}
