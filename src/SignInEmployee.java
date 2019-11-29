
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class SignInEmployee extends Application {
	public static Employee employeesignedIn; // global variable to see which employee is signed in

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	  

		primaryStage.setTitle("Employee Sign In");
		// creating label email
		Text text1 = new Text("Email");

		// creating label password
		Text text2 = new Text("Password");

		// Creating Text Filed for email
		TextField textField1 = new TextField();

		// Creating Text Filed for password
		TextField textField2 = new TextField();
		
		Text alert = new Text("");
		
		Button button1 = new Button();
		button1.setText("Submit");
		button1.setMaxHeight(200);
		button1.setStyle("-fx-background-color: \n" + "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n" + "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n" + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n" + "    -fx-padding: 10 20 10 20;");

		Button button2 = new Button();
		button2.setText("Clear");
		button2.setStyle("-fx-background-color: \n" + "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n" + "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n" + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n" + "    -fx-padding: 10 20 10 20;");

		button1.setOnAction(e -> {
			// Hardcoded employee to pass into the Employee Details Page. Later will be taken from the ArrayList of Employees
			Employee aquaticCaretaker = new Employee("James", "John", "Gilligan", 1234567, "Fulltime", 45000, "johngil@zoo.com", "123abc");
			EmployeeDetails page = new EmployeeDetails(aquaticCaretaker);
			try {
				page.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
			String email = textField1.getText();
			String password = textField2.getText();
//			while (iterator.hasNext()) { 
//				Employee curr = iterator.next();
//				if ((curr.email == email) && curr.password == password) {
//					CheckoutPage login = new CheckoutPage(); // TODO: Change to employee info page.
//					try {
//						login.start(primaryStage);
//					} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//			}
			
		});

		GridPane gridPane = new GridPane();

		// Setting the padding
		gridPane.setPadding(new Insets(10, 10, 10, 10));

		// Setting the vertical and horizontal gaps between the columns
		gridPane.setVgap(5);
		gridPane.setHgap(5);

		// Setting the Grid alignment
		gridPane.setAlignment(Pos.CENTER);

		// Arranging all the nodes in the grid
		gridPane.add(text1, 0, 0);
		gridPane.add(textField1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(textField2, 1, 1);
		gridPane.add(button1, 0, 2);
		gridPane.add(button2, 1, 2);
		gridPane.add(alert, 2, 1);

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
