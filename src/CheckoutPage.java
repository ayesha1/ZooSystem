
import java.util.LinkedList;
import java.util.ListIterator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CheckoutPage extends Application {
	public static LinkedList<Visitor> listOfVisitors = new LinkedList<Visitor>();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Welcome");
		// creating label email
		Text text1 = new Text("Name");
		Text alert = new Text("");

		// creating label password
		Text text2 = new Text("Age");

		// Creating Text Filed for email
		TextField textField1 = new TextField();

		// Creating Text Filed for password
		TextField textField2 = new TextField();

		// Creating Buttons
		Button button1 = new Button("Submit");
		Button button2 = new Button("Go Back");

		button1.setOnAction(e -> {
			if (textField1.getText().trim().equals("") || textField2.getText().trim().equals("")) {
				alert.setText("SOME AREAS ARE BLANK");
				alert.setFill(javafx.scene.paint.Color.RED);
			} else if (!textField2.getText().trim().matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+")) {
				alert.setText("AGE IS NOT AN INTEGER");
				alert.setFill(javafx.scene.paint.Color.RED);
			}
			else {
				String name = textField1.getText();
				String age = textField2.getText();
				Visitor newVisitor = new Visitor(name, Integer.parseInt(age));
				CheckoutPage.listOfVisitors.add(newVisitor);
				int age1 = Integer.parseInt(age);

				if (age1 > 0 || age1 < 18) {
					Zoo.pay += 10;
				} else if (age1 < 65 || age1 >= 18) {
					Zoo.pay += 15;
				} if (age1 > 65) {
					Zoo.pay += 9;
				}

				ParkVisitationScreen login = new ParkVisitationScreen();
				try {
					login.start(primaryStage);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}


		});


		button1.setStyle("-fx-background-color: \n" + "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n" + "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n" + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n" + "    -fx-padding: 10 20 10 20;");

		button2.setOnAction(e -> {
			Welcome login = new Welcome();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});


		button2.setStyle("-fx-background-color: \n" + "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n" + "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n" + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n" + "    -fx-padding: 10 20 10 20;");

		GridPane gridPane = new GridPane();
		gridPane.setMinSize(500, 500);
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		gridPane.setVgap(5);
		gridPane.setHgap(5);

		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text1, 0, 1);
		gridPane.add(textField1, 1, 1);
		gridPane.add(text2, 0, 2);
		gridPane.add(textField2, 1, 2);
		gridPane.add(button1, 2, 3);
		gridPane.add(button2, 1, 3);
		gridPane.add(alert, 1, 4);

		Scene scene = new Scene(gridPane, 1000, 700);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
