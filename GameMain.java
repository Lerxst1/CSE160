import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.media.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.util.Duration;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.input.KeyCode;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.animation.*;

public class GameMain extends Application {
//Scenes, Panes, Objects from other classes
	private final int WINDOW_WIDTH = 1920;
	private final int WINDOW_HEIGHT = 1000;
	StackPane mainMenu = new StackPane();
	Scene scene = new Scene(mainMenu, WINDOW_WIDTH, WINDOW_HEIGHT);
	
	static VBox left = new VBox(80);
	static StackPane right = new StackPane();
	static StackPane center = new StackPane();
	static GridPane top = new GridPane();	
	static StackPane bottom = new StackPane();	
	static BorderPane inGameScreen = new BorderPane(center, top, right, bottom, left);
	
	TextArchive text = new TextArchive();
	Images image = new Images();
	
//Images and Sound
	//Main Menu Background
	ImageView BQView = new ImageView(new Image("img/BachmairQuest.png"));
	//Main Menu Music
	MediaPlayer mainMenuPlayer = new MediaPlayer(new Media(getClass().getResource("music/daggerfall theme.mp3").toString()));
	//World Theme
	MediaPlayer musicPlayer = new MediaPlayer(new Media(getClass().getResource("music/satorl marsh.mp3").toString()));
	//Click
	MediaPlayer click = new MediaPlayer(new Media(getClass().getResource("music/click.mp3").toString()));
	//World Map 
	static ImageView mapView = new ImageView(new Image("img/SBUMap No Cheats.png"));
	//Bachmair Shrugging
	Image bachShrug = new Image("img/bachShrug.jpg");
	ImageView bachShrugView = new ImageView(bachShrug);
	
//Buttons
	//Main Menu
	Button exit = new Button("Exit");
	Button start = new Button("Start");
	Button clickMe = new Button("Difficulty");
	//In-Game
	static Button move = new Button("Move");
	static Button search = new Button("Search");
	static Button fight = new Button("Fight");
	static Button leave = new Button("Leave");
	Button quit = new Button("Quit");
	//Intro
	static Button continu = new Button("Continue");
		
//Effects and Fonts
	Glow glow = new Glow();
	Font mainMenuFont = new Font("Freestyle Script", 28);
	Font inGameFont = new Font("Consolas", 15);
	DropShadow redShad = new DropShadow();
	DropShadow whiteShad = new DropShadow();
	
//Text and TextFields
	Text actions = new Text("Actions");
	Text name = new Text();
	Text enterYourName = new Text("Enter your name:");
	TextField nameField = new TextField();
	String playerName = "";
	Text topName = new Text();
	static Text piecesCollected = new Text();
	static Text introText = new Text();
	static Text playerLocation = new Text("");
	static TextField moveField = new TextField();
	static Text bottomText = new Text();
	static Text dialogue1 = new Text(); static Text dialogue2 = new Text();
	static Text dialogue3 = new Text(); static Text dialogue4 = new Text();
	static Text dialogue5 = new Text(); static Text dialogue6 = new Text();
	static Text movesRemaining = new Text();
	
//Shapes
	Rectangle greenActionRectangle = new Rectangle();
	Circle c = new Circle();
	
//Other
	static int numTurns; //NUMBER OF MOVES -----------------------------------------NUMBER OF MOVES
	boolean hasAPuzzle = false;
	static int piecesFound;
	
	
	
//Methods
	public void mainMenuMouseEnter (Button b) {
		b.setEffect(redShad);
		}
	public void mainMenuMouseExit (Button b) {
		b.setEffect(null);
		}

	boolean setHard = false;
	public void changeDifficulty () {
		if (!setHard) {
			subtract5Turns();
			clickMe.setText("Difficulty: Hard");
			clickMe.setScaleX(1.5);
			setHard = true;
		}
		else if (setHard) {
			add5Turns();
			clickMe.setText("Difficulty: Normal");
			clickMe.setScaleX(1.5);
			setHard = false;
		}
	}
	
	public static void fadeOut(Node n, int duration) {
		FadeTransition t = new FadeTransition(Duration.millis(duration), n);
		t.setFromValue(1.0);
	    t.setToValue(0.0);
	    t.setCycleCount(1);
	    t.play();
	}
	
	public static void add () {
		piecesFound++;
		piecesCollected.setText("Curriculum Pieces Collected: " + piecesFound + "/5");
	}
	public static void subtract () {
		numTurns--;
		movesRemaining.setText("Moves Remaining: " + numTurns);
	}
	
	public static void subtract (int n) {
		numTurns -= n;
		movesRemaining.setText("Moves Remaining: " + numTurns);
	}
	public static void add5Turns () {
		numTurns += 5;
		movesRemaining.setText("Moves Remaining: " + numTurns);
	}
	public static void subtract5Turns () {
		numTurns -= 5;
		movesRemaining.setText("Moves Remaining: " + numTurns);
	}
	public static void fadeIn(Node n, int duration) {
		FadeTransition t = new FadeTransition(Duration.millis(duration), n);
		t.setFromValue(0.0);
	    t.setToValue(1.0);
	    t.setCycleCount(1);
	    t.play();
	}
	
	public static void fadeInArray(Node [] n, int duration) {
		FadeTransition t;
		for (int i = 0; i < n.length; i++) {
			t = new FadeTransition(Duration.millis(duration), n[i]);
			t.setFromValue(0.0);
		    t.setToValue(1.0);
		    t.setCycleCount(1);
		    t.play();
		}
	}
	public static PauseTransition makePause(int duration) {
		PauseTransition p = new PauseTransition(Duration.millis(duration));
		return p;
	}
	
	public static FadeTransition makeFadeIn(Node n, int duration) {
		FadeTransition f = new FadeTransition(Duration.millis(duration), n);
		f.setFromValue(0.0);
	    f.setToValue(1.0);
	    f.setCycleCount(1);
	    return f;
	}
	
	public static FadeTransition makeFadeOut(Node n, int duration) {
		FadeTransition f = new FadeTransition(Duration.millis(duration), n);
		f.setFromValue(1.0);
	    f.setToValue(0.0);
	    f.setCycleCount(1);
	    return f;
	}
	
	public void makeText(Text n) {
		n.setFont(inGameFont);
		n.setScaleX(2);
		n.setScaleY(2);
		n.setTextAlignment(TextAlignment.CENTER);
		n.setStyle("-fx-font-weight: normal;");
		n.setFill(Color.LAWNGREEN);
	}
	
	public void makeCenterText(Text n) {
		n.setFont(inGameFont);
		n.setScaleX(1.25);
		n.setScaleY(1.25);
		n.setTranslateX(60);
		n.setTextAlignment(TextAlignment.LEFT);
		n.setStyle("-fx-font-weight: normal;");
		n.setFill(Color.LAWNGREEN);
	}

	
	public void makeActionButtonArray(Button [] b) {
		for (int i = 0; i < b.length; i++) {
			b[i].setTextFill(Color.BLACK);
			b[i].setShape(greenActionRectangle);
			b[i].setScaleX(2);
			b[i].setScaleY(2);
			b[i].setStyle("-fx-background-color: #7CFC00; ");
		}
	}
	
	public void edit (Node n, double x, double y, double sX, double sY) {
		n.setTranslateX(x);
		n.setTranslateY(y);
		n.setScaleX(sX);
		n.setScaleY(sY);
	}
	
	public static void move () {
		subtract();
		center.getChildren().remove(bottomText);
		inGameScreen.getChildren().remove(Images.getNewCSPic());
		introText.setText("Where would you like to move to? (Ex: E4)");
		center.getChildren().add(moveField);
		inGameScreen.getChildren().add(mapView);
		
		moveField.setOnKeyPressed(f -> { 
			
			if (f.getCode().equals(KeyCode.ENTER)) {
				String coord = moveField.getText();
				switch (coord) {
					case "A5": RegionalEnterMethods.enterA5(); break;
					case "A6": RegionalEnterMethods.enterA6(); break;
					
					case "B5": RegionalEnterMethods.enterB5(); break;
					case "B6": RegionalEnterMethods.enterB6(); break;
					
					case "C2": RegionalEnterMethods.enterC2(); break;
					case "C3": RegionalEnterMethods.enterC3(); break;
					case "C4": RegionalEnterMethods.enterC4(); break;
					case "C5": RegionalEnterMethods.enterC5(); break;
					
					case "D1": RegionalEnterMethods.enterD1(); break;
					case "D2": RegionalEnterMethods.enterD2(); break;
					case "D3": RegionalEnterMethods.enterD3(); break;
					case "D4": RegionalEnterMethods.enterD4(); break;
					case "D5": bottomText.setText("You are already in area D5.");
					center.getChildren().add(bottomText);
					try { Thread.sleep(1500); } catch (InterruptedException e1) { e1.printStackTrace();	}
					center.getChildren().remove(bottomText);
					break;
					
					case "D6": RegionalEnterMethods.enterD6(); break;
					
					case "E1": RegionalEnterMethods.enterE1(); break;
					case "E2": RegionalEnterMethods.enterE2(); break;
					case "E3": RegionalEnterMethods.enterE3(); break;
					case "E4": RegionalEnterMethods.enterE4(); break;
					case "E5": RegionalEnterMethods.enterE5(); break;
					
					case "F4": RegionalEnterMethods.enterF4(); break;
					
					default: bottomText.setText("Invalid area code."); center.getChildren().add(bottomText); break;
				}
			}					
		});		
	}
	
	
	
	
	public void start (Stage primaryStage) {
		//Main Menu Screen, Panes, etc.
		primaryStage.setResizable(false);
		numTurns = 15; piecesFound = 0;
		mainMenuPlayer.play(); //THIS MIGHT BE OFF SOMETIMES
		makeText(dialogue1); makeText(dialogue2); makeText(dialogue3); makeText(dialogue4); makeText(dialogue5); makeText(dialogue6);
		
		click.setCycleCount(1);	
		movesRemaining.setText("Moves Remaining: " + numTurns);

		mainMenu.getChildren().add(BQView);

		redShad.setColor(Color.RED);
		redShad.setRadius(5);
		redShad.setSpread(.5);
		whiteShad.setColor(Color.WHITE);
		whiteShad.setRadius(5);
		whiteShad.setSpread(.5);
		
		greenActionRectangle.setArcWidth(20);
		greenActionRectangle.setArcHeight(20);
		greenActionRectangle.setWidth(80);
		greenActionRectangle.setHeight(60);


		exit.setStyle("-fx-background-color: #111111; ");
		exit.setTextFill(Color.WHITE);
		exit.setFont(mainMenuFont);
		edit(exit, 0, 450, 3, 2.5);
		exit.setShape(c);
		exit.setOnMouseEntered(e -> { mainMenuMouseEnter(exit); });
		exit.setOnMouseExited(e -> {mainMenuMouseExit(exit); });
		exit.setOnMouseClicked(e -> {System.exit(0); });
		mainMenu.getChildren().add(exit);			

		start.setStyle("-fx-background-color: #111111; ");
		start.setTextFill(Color.WHITE);
		start.setFont(mainMenuFont);
		edit(start, 0, 275, 3, 2.5);
		start.setShape(c);
		start.setOnMouseEntered(e -> { mainMenuMouseEnter(start); });
		start.setOnMouseExited(e -> {mainMenuMouseExit(start); });
		start.setOnMouseClicked(e -> { 
			Scene mainGame = new Scene(inGameScreen, WINDOW_WIDTH, WINDOW_HEIGHT);
			startGame(primaryStage, mainGame); });
		mainMenu.getChildren().add(start);
		
		clickMe.setStyle("-fx-background-color: #111111; ");
		clickMe.setTextFill(Color.WHITE);
		clickMe.setFont(mainMenuFont);
		edit(clickMe, 0, 362.5, 1.7, 1.7);
		clickMe.setShape(c);
		clickMe.setOnMouseEntered(e -> { mainMenuMouseEnter(clickMe); });
		clickMe.setOnMouseExited(e -> {mainMenuMouseExit(clickMe); });
		clickMe.setOnMouseClicked(e -> { changeDifficulty(); });
		mainMenu.getChildren().add(clickMe);
		
		primaryStage.setTitle("BachmairQuest");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
//START GAME METHOD
	public void startGame(Stage primaryStage, Scene mainGame) {
		exit.setVisible(false);
		start.setVisible(false);
		clickMe.setVisible(false);
		primaryStage.setScene(mainGame);
		inGameScreen.setBackground(new Background(new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY)));	
		

		makeText(enterYourName);
		
		center.getChildren().add(enterYourName);
		enterYourName.setTranslateY(-60);
		
		center.getChildren().add(nameField);
		nameField.setMaxWidth(200);
		edit(nameField, 0, 0, 2, 2);
		
		nameField.setOnKeyPressed(e -> { 
			if (e.getCode().equals(KeyCode.ENTER))		
				startGameForReal(); 
			});	
	}

	
	
//ONCE THE PLAYER ENTERS THEIR NAME
	public void startGameForReal() {
		playerName += nameField.getText();
		center.getChildren().removeAll(enterYourName, nameField);
		
		quit.setOnAction(e -> { click.play();System.exit(0); });
		
	//Format left VBox
		left.setStyle("-fx-border-color: lawngreen");
		left.setPadding(new Insets(80));
		left.setAlignment(Pos.TOP_CENTER);
	//Format top GridPane
		top.setStyle("-fx-border-color: lawngreen");
		top.setPadding(new Insets(25));
	//Format Right StackPane
		right.setStyle("-fx-border-color: lawngreen");
		right.setPadding(new Insets(300));
		right.setAlignment(Pos.CENTER);
	//Format bottom StackPane
		bottom.setStyle("-fx-border-color: lawngreen");
		bottom.setPadding(new Insets(25));
	//Format center StackPane
		center.setStyle("-fx-border-color: lawngreen");
		center.setPadding(new Insets(25));
		center.setAlignment(Pos.TOP_LEFT);
		
		bottom.getChildren().add(movesRemaining);
		edit(movesRemaining, -500, 0, 1, 1);
		
		makeText(actions);
		makeCenterText(introText);
		makeText(topName);
		makeText(playerLocation);
		makeText(piecesCollected);
		makeText(movesRemaining);
		
		piecesCollected.setText("Curriculum Pieces Collected: " + piecesFound + "/5");
		
		topName.setText(playerName);
		bottom.getChildren().add(topName);
		topName.setTranslateX(500);
		top.add(playerLocation, 0, 0);
		playerLocation.setTranslateX(200);
		top.add(piecesCollected, 1, 0);
		piecesCollected.setTranslateX((WINDOW_WIDTH/2)+300);
		
		Button [] actionButtons = {move, search, fight, leave, quit};
		makeActionButtonArray(actionButtons);
		left.getChildren().addAll(actions, move, search, fight, leave, quit);
		
		
		introText.setText(text.introText());
		center.getChildren().addAll(introText);
		inGameScreen.getChildren().add(mapView);
		center.getChildren().add(continu);
		edit(mapView, 750, -290, .5, .5);
		edit(continu, 30, 200, 1, 1);
		center.getChildren().add(bachShrugView);
		bachShrugView.setTranslateY(300);
		
		Button [] continueButton = {continu};
		makeActionButtonArray(continueButton);
		
		Text [] initialText = {topName, piecesCollected, actions};
		
		
		fadeInArray(actionButtons, 3000);
		fadeInArray(initialText, 3000);
		fadeIn(movesRemaining, 3000);
		
		SequentialTransition t = new SequentialTransition(makePause(5000), makeFadeIn(introText, 1), 
				makeFadeIn(mapView, 1), makeFadeIn(bachShrugView, 1), makeFadeIn(continu, 1));
		t.play();
		
		continu.setOnMouseClicked(e -> { 	
			click.play();
				enterTheWorld(); 
			});	
	}
	
	public void enterTheWorld() {
		center.getChildren().removeAll(continu, bachShrugView);
		introText.setText(text.coords());
		introText.setTranslateX(50);
		continu.setText("Begin");
		center.getChildren().add(continu);
		SequentialTransition t = new SequentialTransition(makePause(4000), makeFadeIn(continu, 1));
		t.play();
		
		moveField.setMaxWidth(100);
		edit(moveField, 40, 50, 2, 2);
		
		continu.setOnMouseClicked(e -> { 	
			mainMenuPlayer.stop();
			click.play();
			inGameScreen.getChildren().remove(mapView);
			center.getChildren().remove(continu);	
			try { Thread.sleep(1000); } catch (InterruptedException e1) { e1.printStackTrace();	}
			enterBachmairOffice();
					
		});
	}	
	
	
//PLAYER SPAWNS IN BACHMAIR'S OFFICE
public void enterBachmairOffice () {
	musicPlayer.setVolume(.7);
	musicPlayer.play();
	introText.setText(text.newCS());
	leave.setTextFill(Color.RED);
	makeText(bottomText);
	center.getChildren().add(bottomText);
	edit(bottomText, 20, 800, 1.3, 1.3);

	
	leave.setOnAction(e -> { 
		click.play();
		center.getChildren().remove(introText);
		try { Thread.sleep(1000); } catch (InterruptedException e1) { e1.printStackTrace();	}
		enterD5(); 
		});
	
	
			
	
	
}
	
	
//----------- D5: First region -----------------------------------------------------------------------------------------------------
	public void enterD5() {
		//battleThemePlayer.play();
		
		
		
		inGameScreen.getChildren().add(Images.getNewCSPic());
		playerLocation.setText("New Computer Science");
		introText.setText(text.d5Intro());
		center.getChildren().add(introText);
		leave.setTextFill(Color.BLACK);
		fight.setTextFill(Color.RED);
		
		leave.setOnAction(e -> {click.play();});
		
		fight.setOnAction(e -> {
			click.play();
			fight.setTextFill(Color.BLACK);
			boolean foughtGoose = false;
			try { Thread.sleep(500); } catch (InterruptedException e1) { e1.printStackTrace();	}
			if (!foughtGoose)
			introText.setText("You take a step forward and shout at the angry goose.\n"
					+ "It backs away, startled, before flying back to the pond.\n"
					+ "\n"
					+ "\n"
					+ "As you approach Roth Pond, you see a small note taped to one of\n"
					+ "the lampposts.\n"
					+ "Picking it up, you see a few words scrawled on its surface.\n"
					+ "'Meet me at West Side, we'll take care of Bachmair's notes.\n"
					+ "- L. V.'");
			else
				bottomText.setText("There is nothing to fight right now.");
				});
		
		search.setOnAction(e -> {
			click.play();
			try { Thread.sleep(500); } catch (InterruptedException e1) { e1.printStackTrace();	}
			introText.setText("You scout the area around Roth Pond, but aside from the\n"
					+ "note you do not find anything important.\n"
					+ "In the distance, you see a large swarm of geese gathering. You\n"
					+ "feel that it's probably best if you leave now.");
				});
		
		move.setOnMouseClicked(e -> {
			click.play();
			subtract();
			center.getChildren().remove(bottomText);
			inGameScreen.getChildren().remove(Images.getNewCSPic());
			introText.setText("Where would you like to move to? (Ex: E4)");
			center.getChildren().add(moveField);
			inGameScreen.getChildren().add(mapView);
			
			moveField.setOnKeyPressed(f -> { 
				
				if (f.getCode().equals(KeyCode.ENTER)) {
					String coord = moveField.getText();
					switch (coord) {
						case "A5": RegionalEnterMethods.enterA5(); break;
						case "A6": RegionalEnterMethods.enterA6(); break;
						
						case "B5": RegionalEnterMethods.enterB5(); break;
						case "B6": RegionalEnterMethods.enterB6(); break;
						
						case "C2": RegionalEnterMethods.enterC2(); break;
						case "C3": RegionalEnterMethods.enterC3(); break;
						case "C4": RegionalEnterMethods.enterC4(); break;
						case "C5": RegionalEnterMethods.enterC5(); break;
						
						case "D1": RegionalEnterMethods.enterD1(); break;
						case "D2": RegionalEnterMethods.enterD2(); break;
						case "D3": RegionalEnterMethods.enterD3(); break;
						case "D4": RegionalEnterMethods.enterD4(); break;
						case "D5": bottomText.setText("You are already in area D5.");
						center.getChildren().add(bottomText);
						try { Thread.sleep(1500); } catch (InterruptedException e1) { e1.printStackTrace();	}
						center.getChildren().remove(bottomText);
						break;
						
						case "D6": RegionalEnterMethods.enterD6(); break;
						
						case "E1": RegionalEnterMethods.enterE1(); break;
						case "E2": RegionalEnterMethods.enterE2(); break;
						case "E3": RegionalEnterMethods.enterE3(); break;
						case "E4": RegionalEnterMethods.enterE4(); break;
						case "E5": RegionalEnterMethods.enterE5(); break;
						
						case "F4": RegionalEnterMethods.enterF4(); break;
						
						default: bottomText.setText("Invalid area code."); center.getChildren().add(bottomText); break;
					}
				}					
			});		
		});

	}
	

	
	
	
	public static void main (String [] args) {
		launch();
	}

//Class Ends Here
}

	

