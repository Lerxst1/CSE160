
public class Locations extends RegionalEnterMethods {

	//set theory
	public static void ess () {
		leave.setOnAction(e ->  {introText.setText("You leave the ESS building.");});
		introText.setText("You stroll into the ESS building, making sure to stop by room\n" 
				+ "079.");
		
		continu.setText("Continue");
		center.getChildren().add(continu);
		
		continu.setOnMouseClicked(e -> {
			center.getChildren().remove(continu);
			introText.setText("After some searching, you find a series of notes\n"
					+ "on the various aspects of Set Theory.\n"
					+ "\n"
					+ "You found a piece of the curriculum! Good job!");
			add();
		});
		
		
		if (piecesFound == 5)
			Ending.goodEnding();
		else {
			move.setOnAction(f -> {move();} );
			fight.setOnAction ( f -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(f -> {introText.setText("You leave ESS. To move to another region,\n"
					+ " press Move."); } );
			search.setOnAction(f -> {introText.setText("You already have Set Theory."); });
			}
	}
	
	
	//induction
	public static void rothCafe () {
		
		leave.setOnAction(e ->  {introText.setText("You leave the Roth Cafe.");});
		introText.setText("As you walk into the first floor of the Roth Cafe, your eyes\n"
				+ "are immediately drawn to the left wall. You see, spraypainted\n"
				+ "on the wall, a proof of Mathematical Induction.\n"
				+ "\n"
				+ "Congrats, you found Mathematical Induction!");
		

		
		
		add();
		if (piecesFound == 5)
			Ending.goodEnding();
		else {
			move.setOnAction(f -> {move();} );
			fight.setOnAction ( f -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(f -> {introText.setText("You leave the Roth Cafe.\n"
					+ " To move to another region, press Move."); } );
			search.setOnAction(f -> {introText.setText("You already have Mathematical Induction."); });
			}
	}
	
	
	//EQ relations
	public static void benedict () {
		leave.setOnAction(e ->  {introText.setText("You leave Benedict College.");});
		introText.setText("You pull open the grey metal door, and enter the main hallway of Benedict\n"
				+ "College. On both sides of you, you see large green doors, blocking your path\n"
				+ "to the dorm rooms. Just as you are about to ask an H Quad resident for\n"
				+ "assistance, you notice that one of the doors to the LDS Center is open.\n"
				+ "As you carefully walk down the stairs, you see a small book on one of the\n"
				+ "collapsable tables. Taking a closer look, you see that the handwriting in it\n"
				+ "resembles Bachmair's. Sure enough, the book contains his entire lesson plan\n"
				+ "for teaching Equivalence Relations.");
		search.setOnAction(e -> {introText.setText("You pull open the grey metal door, and enter the main hallway of Benedict\n"
				+ "College. On both sides of you, you see large green doors, blocking your path\n"
				+ "to the dorm rooms. Just as you are about to ask an H Quad resident for\n"
				+ "assistance, you notice that one of the doors to the LDS Center is open.\n"
				+ "As you carefully walk down the stairs, you see a small book on one of the\n"
				+ "collapsable tables. Taking a closer look, you see that the handwriting in it\n"
				+ "resembles Bachmair's. Sure enough, the book contains his entire lesson plan\n"
				+ "for teaching Equivalence Relations.");
		add();
		});
		
		
		
		if (piecesFound == 5)
			Ending.goodEnding();
		else {
			move.setOnAction(f -> {move();} );
			fight.setOnAction ( f -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(f -> {introText.setText("You leave Benedict..\n"
					+ " To move to another region, press Move."); } );
			search.setOnAction(f -> {introText.setText("You already have Equivalence Relations."); });
			}
	}
	
	//propositional logic
	public static void humanities () {
		leave.setOnAction(e ->  {introText.setText("You leave the humanities building.");});
		introText.setText("You step into the humanities building.\n"
				+ "As you walk into the Atrium, you notice a binder sitting on one\n"
				+ "of the tables. It is titled ''A is Guilty': Propositional Logic\n"
				+ "for Dummies'\n\n"
				+ "You have acquired knowledge of propositional logic!");
		search.setOnAction(e -> {introText.setText("You step into the humanities building.\n"
				+ "As you walk into the Atrium, you notice a binder sitting on one\n"
				+ "of the tables. It is titled ''A is Guilty': Propositional Logic\n"
				+ "for Dummies'\n\n"
				+ "You have acquired knowledge of propositional logic!");
		add();});

		
		
		if (piecesFound == 5)
			Ending.goodEnding();
		else {
			move.setOnAction(f -> {move();} );
			fight.setOnAction ( f -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(f -> {introText.setText("You leave the Humanities Building.\n"
					+ " To move to another region, press Move."); } );
			search.setOnAction(f -> {introText.setText("You already have Propositional Logic."); });
			}
		
	}
	
	//WOP
	public static void west () {
		leave.setOnAction(e ->  {introText.setText("You leave West Side Dining.");});
		search.setOnAction(e -> {introText.setText("You walk over and sit down with him.\n"
				+ "He hands over a strange packet of papers. Inside, you find a proof of the\n"
				+ "Well-Ordering Principle!");
		add();});

		
		
		if (piecesFound == 5)
			Ending.goodEnding();
		else {
			move.setOnAction(f -> {move();} );
			fight.setOnAction ( f -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(f -> {introText.setText("You leave West Side Dining.\n"
					+ " To move to another region, press Move."); } );
			search.setOnAction(f -> {introText.setText("You walk over and sit down with him.\n"
					+ "He hands over a strange packet of papers. Inside, you find a proof of the\n"
					+ "Well-Ordering Principle!"); });
			}
	}
}
