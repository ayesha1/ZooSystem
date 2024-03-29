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


public class ForestPageEmployee extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Employee: Forest");

		Text text1 = new Text("Click on");
        Text text2 = new Text("animal to") ; 
        Text text3 = new Text("interact") ; 
		text1.setStyle("-fx-font-size: 40;");
		text2.setStyle("-fx-font-size: 40;");
		text3.setStyle("-fx-font-size: 40;");
		
		Image forestImage = new Image("/images/ForestView.png");
		ImageView forestView = new ImageView(forestImage);
		forestView.setFitWidth(200);
		forestView.setFitHeight(200);

		Image pandaImage = new Image("/images/panda.png");
		ImageView pandaView = new ImageView(pandaImage);
		pandaView.setFitWidth(200);
		pandaView.setFitHeight(200);
		
		Button button = new Button();
		button.setText("Panda");
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
		button.setMaxHeight(20);
		button.setOnAction(e -> {
			pandaE login = new pandaE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		Image slothImage = new Image("/images/sloth.png");
		ImageView slothView = new ImageView(slothImage);
		slothView.setFitWidth(200);
		slothView.setFitHeight(200);

		Button button1 = new Button();
		button1.setText("Sloth");
		button1.setMaxHeight(200);
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
		button1.setMaxHeight(20);
		button1.setOnAction(e -> {
			slothE login = new slothE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Image gorillaImage = new Image("/images/gorilla.png");
		ImageView gorillaView = new ImageView(gorillaImage);
		gorillaView.setFitWidth(200);
		gorillaView.setFitHeight(200);
		
		Button button2 = new Button();
		button2.setText("Gorilla");
		button2.setMaxHeight(200);
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
		button2.setMaxHeight(20);
		button2.setOnAction(e -> {
			slothE login = new slothE();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		Image tortoiseImage = new Image("/images/turtle.png");
		ImageView tortoiseView = new ImageView(tortoiseImage);
		tortoiseView.setFitWidth(200);
		tortoiseView.setFitHeight(200);
		
		Button button3 = new Button();
		button3.setText("Tortoise");
		button3.setMaxHeight(200);
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
		button3.setMaxHeight(20);
		button3.setOnAction(e -> {
			tortoiseE login = new tortoiseE();
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
		gridPane.add(text2, 2, 0); 
        gridPane.add(text3, 3, 0) ; 
		gridPane.add(forestView, 0, 0);
		gridPane.add(pandaView, 0, 1);
		gridPane.add(button, 0, 2);
        gridPane.add(button1, 1, 2); 
        gridPane.add(button2, 2, 2) ; 
        gridPane.add(button3, 3, 2) ;
		gridPane.add(slothView, 1, 1);
		gridPane.add(gorillaView, 2, 1);
		gridPane.add(tortoiseView, 3, 1); 

		gridPane.setHgap(85);
		gridPane.setVgap(80);
		
		gridPane.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: pink;"
				+ "-fx-background-color: white;");

		Scene scene = new Scene(gridPane, 1000, 700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
