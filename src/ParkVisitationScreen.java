
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Pos;


public class ParkVisitationScreen extends Application {
	Button button;
	Button button1;
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Park to visit");

		Text text1 = new Text("Please select a park to visit!");
		text1.setStyle("-fx-font-size: 40;");
		
		Button exitButton = new Button("Back to Welcome Page");
		exitButton.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");

		exitButton.setOnAction(e -> {
			Welcome login = new Welcome();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		
		Image tropicalImage = new Image("/images/Tropical.png");
		ImageView tropicalView = new ImageView(tropicalImage);
		tropicalView.setFitWidth(200);
		tropicalView.setFitHeight(200);

		Image forestImage = new Image("/images/ForestView.png");
		ImageView forestView = new ImageView(forestImage);
		forestView.setFitWidth(200);
		forestView.setFitHeight(200);
		
		Image savannahImage = new Image("/images/SavannahView.png");
		ImageView savannahView = new ImageView(savannahImage);
		savannahView.setFitWidth(200);
		savannahView.setFitHeight(200);

		Image dessertImage = new Image("/images/DesertView.png");
		ImageView dessertView = new ImageView(dessertImage);
		dessertView.setFitWidth(200);
		dessertView.setFitHeight(200);
		
		Image articImage = new Image("/images/ArticView.png");
		ImageView articView = new ImageView(articImage);
		articView.setFitWidth(200);
		articView.setFitHeight(200);
		
		Image aquaticImage = new Image("/images/AquaticView.png");
		ImageView aquaticView = new ImageView(aquaticImage);
		aquaticView.setFitWidth(200);
		aquaticView.setFitHeight(200);

		button = new Button();
		button.setText("Tropical");
		button.setMaxHeight(200);
		button.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");
		button.setOnAction(e -> {
			TropicalPage login = new TropicalPage();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		button1 = new Button();
		button1.setText("Forest");
		button1.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");

		button1.setOnAction(e -> {
			ForestPage forestPage = new ForestPage();
			try {
				forestPage.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});


		button2 = new Button();
		button2.setText("Savanna");
		button2.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");

		button2.setOnAction(e -> {
			SavannaPage savannaPage = new SavannaPage();
			try {
				savannaPage.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		button3 = new Button();
		button3.setText("Desert");
		button3.setStyle("-fx-background-color: \n" + 
				"        #090a0c,\n" + 
				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
				"        linear-gradient(#20262b, #191d22),\n" + 
				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
				"    -fx-background-radius: 5,4,3,5;\n" + 
				"    -fx-background-insets: 0,1,2,0;\n" + 
				"    -fx-text-fill: white;\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
				"    -fx-font-family: \"Arial\";\n" + 
				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
				"    -fx-font-size: 12px;\n" + 
				"    -fx-padding: 10 20 10 20;");

		button3.setOnAction(e -> {
			desertPage login = new desertPage();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	     button4 = new Button();
			button4.setText("Arctic");
			button4.setStyle("-fx-background-color: \n" + 
					"        #090a0c,\n" + 
					"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
					"        linear-gradient(#20262b, #191d22),\n" + 
					"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
					"    -fx-background-radius: 5,4,3,5;\n" + 
					"    -fx-background-insets: 0,1,2,0;\n" + 
					"    -fx-text-fill: white;\n" + 
					"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
					"    -fx-font-family: \"Arial\";\n" + 
					"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
					"    -fx-font-size: 12px;\n" + 
					"    -fx-padding: 10 20 10 20;");

			button4.setOnAction(e -> {
				arcticPage login = new arcticPage();
				try {
					login.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
			
			
			  button5 = new Button();
				button5.setText("Aquatic");
				button5.setStyle("-fx-background-color: \n" + 
						"        #090a0c,\n" + 
						"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" + 
						"        linear-gradient(#20262b, #191d22),\n" + 
						"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" + 
						"    -fx-background-radius: 5,4,3,5;\n" + 
						"    -fx-background-insets: 0,1,2,0;\n" + 
						"    -fx-text-fill: white;\n" + 
						"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" + 
						"    -fx-font-family: \"Arial\";\n" + 
						"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" + 
						"    -fx-font-size: 12px;\n" + 
						"    -fx-padding: 10 20 10 20;");

				button5.setOnAction(e -> {
					aquaticPage login = new aquaticPage();
					try {
						login.start(primaryStage);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
				
				
				
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text1, 1, 0);
		gridPane.add(exitButton, 0, 0);

		gridPane.add(tropicalView, 0, 1);
		gridPane.add(forestView, 1, 1);
		gridPane.add(savannahView, 2, 1);

		gridPane.add(button, 0, 2);
		gridPane.add(button1, 1, 2);
		gridPane.add(button2, 2, 2);
		gridPane.add(button3,0, 4); 
        gridPane.add(button4,2, 4);
        gridPane.add(button5,1, 4); 

		gridPane.add(dessertView, 0, 3);
		gridPane.add(aquaticView, 1, 3);
		gridPane.add(articView, 2, 3);


		gridPane.setHgap(20);
		gridPane.setVgap(20);

		gridPane.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: pink;"
				+ "-fx-background-color: white;");

		Scene scene = new Scene(gridPane, 1000, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
