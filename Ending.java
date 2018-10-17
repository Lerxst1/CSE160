import javafx.animation.*;

public class Ending extends RegionalEnterMethods {

	
	
	public static void goodEnding () {
		System.out.println("good ending :)");
		center.getChildren().remove(introText);
		introText.setText("With all the pieces in hand, you run back to Bachmair's office,\n"
				+ "eager to present your findings to him.");
		SequentialTransition t = new SequentialTransition(makePause(2000), makeFadeIn(introText, 1000), makePause(2000), makeFadeOut(introText, 1000));
		t.play();
		introText.setText("You open his office door and hand your notes over to Bachmair.\n"
				+ "He thanks you, and takes the lecture notes.\n"
				+ "\n"
				+ "\n"
				+ "Congrats, you got the good ending!");
		SequentialTransition t2 = new SequentialTransition(makePause(6000), makeFadeIn(introText, 500), makePause(1000), makeFadeOut(introText, 500));
		t2.play();
		center.getChildren().add(introText);
		
		
		
	}
	
	
	public static void badEnding () {
		try { Thread.sleep(1000); } catch (InterruptedException e1) { e1.printStackTrace();	}
		center.getChildren().clear();
		right.getChildren().clear();
		inGameScreen.getChildren().clear();
		
		System.out.println("bad ending :(");
		introText.setText("With all the pieces in hand, you run back to Bachmair's office,\n"
				+ "eager to present your findings to him.");
		SequentialTransition t = new SequentialTransition(makePause(3000), makeFadeIn(introText, 1000), makePause(2000), makeFadeOut(introText, 1000));
		t.play();
		introText.setText("You open his office door, only to find that he is gone.\n"
				+ "Without his notes, he was unable to teach, and thus was fired...\n"
				+ "\n"
				+ "\n"
				+ "You got the bad ending.");
		SequentialTransition t2 = new SequentialTransition(makePause(7000), makeFadeIn(introText, 500), makePause(1000), makeFadeOut(introText, 500));
		t2.play();
		
	}

	
}