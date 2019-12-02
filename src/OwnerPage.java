
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


public class OwnerPage extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Owner Options");

		Text text1 = new Text("Click on what the owner can do");
		text1.setStyle("-fx-font-size: 40;");

		// Give Pay
		Button givePay = new Button();
		givePay.setText("Give Pay");
		givePay.setStyle("-fx-background-color: \n" +
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
		givePay.setMaxHeight(20);


		// Collect Pay from Visitors

		Button collectPay = new Button();
		collectPay.setText("Collect $ from Visitors");
		collectPay.setStyle("-fx-background-color: \n" +
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
		collectPay.setMaxHeight(20);

		//TODO: Have pay from visitors shown here
		String pay = "$" + Zoo.pay;
		Text payFromVisitors = new Text(pay);
		payFromVisitors.setStyle("-fx-font-size: 40;");

		// Makes pay = $0
		collectPay.setOnAction(e -> {
			Zoo.pay = 0;
			payFromVisitors.setText("$0");
		});


		// Hire employees
//		Button hireEmployees = new Button();
//		hireEmployees.setText("Collect $ from Visitors");
//		hireEmployees.setStyle("-fx-background-color: \n" +
//				"        #090a0c,\n" +
//				"        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n" +
//				"        linear-gradient(#20262b, #191d22),\n" +
//				"        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n" +
//				"    -fx-background-radius: 5,4,3,5;\n" +
//				"    -fx-background-insets: 0,1,2,0;\n" +
//				"    -fx-text-fill: white;\n" +
//				"    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
//				"    -fx-font-family: \"Arial\";\n" +
//				"    -fx-text-fill: linear-gradient(white, #d0d0d0);\n" +
//				"    -fx-font-size: 12px;\n" +
//				"    -fx-padding: 10 20 10 20;");
//		hireEmployees.setMaxHeight(20);

		// Fire Employees
		Button fireEmployees = new Button();
		fireEmployees.setText("Collect $ from Visitors");
		fireEmployees.setMaxHeight(20);
		fireEmployees.setStyle("-fx-background-color: \n" +
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

		Button button = new Button();
		button.setText("Go Back");
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
			Welcome login = new Welcome();
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
		gridPane.add(collectPay, 0, 1);
		gridPane.add(payFromVisitors, 0, 2);
		gridPane.add(givePay, 1, 1);
//		gridPane.add(hireEmployees, 1, 2);

		gridPane.add(button, 2, 1);


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
