
import javafx.scene.Node;

public class RegionalEnterMethods extends GameMain {
	
	
	static boolean visitedA5, visitedA6, visitedB5, visitedB6, visitedC2, visitedC3, visitedC4, visitedC5, visitedD1, visitedD2,
	visitedD3, visitedD4, visitedD6, visitedE1, visitedE2, visitedE3, visitedE4, visitedE5, visitedF4 = false;
	
	public static void edit (Node textBox, int x, int y, double scaleX, double scaleY) {
		textBox.setTranslateX(x);
		textBox.setTranslateY(y);
		textBox.setScaleX(scaleX);
		textBox.setScaleY(scaleY);
	}
	
	
	public static void enterA5 () {
		if (!visitedA5) {
			visitedA5 = true;
			playerLocation.setText("West Side Dining");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getWestSidePic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText("There is nothing to fight right now." );} );
			leave.setOnAction(e -> {introText.setText("You cannot leave right now.");});
			
			introText.setText("You walk into West Side Dining, and see a strange hooded figure sitting\n"
					+ "at one of the tables.");
			
			search.setOnAction(e -> {Locations.west();});
		}
	}
		
		
	
	
	
	public static void enterA6 () {
		if (!visitedA6) {
			visitedA6 = true;
			introText.setText(TextArchive.aSixIntro());
			playerLocation.setText("Roosevelt Quad");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getWagnerPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.a6Search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	
	public static void enterB5 () {
		if (!visitedB5) {
			visitedB5 = true;
			introText.setText(TextArchive.b5Intro());
			playerLocation.setText("Nobel Halls");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getLauterburPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight() );} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.b5Search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterB6 () {
		if (!visitedB6) {
			visitedB6 = true;
			introText.setText(TextArchive.bSixIntro());
			playerLocation.setText("Roosevelt Quad");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getStimsonPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave()); });
			search.setOnAction(e -> {introText.setText(TextArchive.b6Search());   });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterC2 () {
		if (!visitedC2) {
			visitedC2 = true;
			introText.setText(TextArchive.c2Intro());
			playerLocation.setText("Kenneth P. Lavalle Stadium");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getConcessionStandPic());

			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText("You are not in a building.");});
			search.setOnAction(e -> {introText.setText(TextArchive.c2search()); });
			move.setOnAction(e -> {move();} );
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
		
	}
	
	public static void enterC3 () {
		if (!visitedC3) {
			visitedC3 = true;
			introText.setText(TextArchive.c3Intro());
			playerLocation.setText("Toll Drive West");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getPhysicsPic());

			fight.setOnAction ( e -> { introText.setText("There is nothing to fight right now." );} );
			leave.setOnAction(e -> {introText.setText("You are not in a building.");});
			search.setOnAction(e -> {introText.setText(TextArchive.c3Search()); });
			move.setOnAction(e -> {move();} );
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterC4 () {
		if (!visitedC4) {
			visitedC4 = true;
			introText.setText(TextArchive.c4Intro());
			playerLocation.setText("Earth and Space Sciences");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getESSPic());

			fight.setOnAction ( e -> { introText.setText("There is nothing to fight right now." );} );
			leave.setOnAction(e -> {introText.setText("You are not in a building.");});
			search.setOnAction(e -> {Locations.ess(); }); //gotta do the text here in Locations class
			move.setOnAction(e -> {move();} );
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterC5 () {
			if (!visitedC5) {
				visitedC5 = true;
				introText.setText(TextArchive.c5Intro());
				playerLocation.setText("Engineering Quad");
				center.getChildren().remove(moveField);
				inGameScreen.getChildren().remove(mapView);
				inGameScreen.getChildren().add(Images.getLightEngPic());
				
				move.setOnAction(e -> {move();} );
				fight.setOnAction ( e -> { introText.setText("There is nothing to fight right now." );} );
				leave.setOnAction(e -> {introText.setText("You are not in a building.");});
				search.setOnAction(e -> {introText.setText(TextArchive.c5search()); });
			}
			else
				bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();});
	}
	
	public static void enterD1 () {
		if (!visitedD1) {
			visitedD1 = true;
			introText.setText(TextArchive.d1Intro());
			playerLocation.setText("Tennis Courts");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getTennisCourtsPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.d1fight() );} );
			leave.setOnAction(e -> {introText.setText("You are not in a building.");});
			search.setOnAction(e -> {introText.setText(TextArchive.d1search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterD2 () {
		if (!visitedD2) {
			visitedD2 = true;
			introText.setText(TextArchive.d2Intro());
			playerLocation.setText("Stadium Parking Lot");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getStadiumParkingLotPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.d2Search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterD3 () {
		if (!visitedD3) {
			visitedD3 = true;
			introText.setText(TextArchive.d3Intro());
			playerLocation.setText("Near the Union");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getUnionPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.d3Search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterD4 () {
		if (!visitedD4) {
			visitedD4 = true;
			introText.setText(TextArchive.d4Intro());
			playerLocation.setText("Academic Mall");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getSACPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.d4search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterD6 () {
		if (!visitedD6) {
			visitedD6 = true;
			introText.setText(TextArchive.d6Intro());
			playerLocation.setText("Roth Quad");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getPondPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {Locations.rothCafe(); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterE1 () {
		if (!visitedE1) {
			visitedE1 = true;
			introText.setText(TextArchive.e1intro());
			playerLocation.setText("H Quad");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getBenedictPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {Locations.benedict(); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterE2 () {
		if (!visitedE2) {
			visitedE2 = true;
			introText.setText(TextArchive.e2intro());
			playerLocation.setText("Mendelsohn Quad");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getAmmannPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.e2search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterE3 () {
		if (!visitedE3) {
			visitedE3 = true;
			introText.setText(TextArchive.e3intro());
			playerLocation.setText("Toll Drive East");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getWangPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.e3search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterE4 () {
		if (!visitedE4) {
			visitedE4 = true;
			introText.setText(TextArchive.e4intro());
			playerLocation.setText("Administration/Humanities");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getAdminPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {Locations.humanities(); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterE5 () {
		if (!visitedE5) {
			visitedE5 = true;
			introText.setText(TextArchive.e5Intro());
			playerLocation.setText("Javits/Life Siences");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getJavitsPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.e5search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	
	public static void enterF4 () {
		if (!visitedF4) {
			visitedF4 = true;
			introText.setText(TextArchive.f4Intro());
			playerLocation.setText("Hilton Garden Inn");
			center.getChildren().remove(moveField);
			inGameScreen.getChildren().remove(mapView);
			inGameScreen.getChildren().add(Images.getHiltonPic());
			
			move.setOnAction(e -> {move();} );
			fight.setOnAction ( e -> { introText.setText(TextArchive.defaultFight());} );
			leave.setOnAction(e -> {introText.setText(TextArchive.defaultLeave());});
			search.setOnAction(e -> {introText.setText(TextArchive.f4search()); });
		}
		else {
			bottomText.setText("You have already been to this region.");
			move.setOnAction(e -> {move();} );
		}
	}
	

}
