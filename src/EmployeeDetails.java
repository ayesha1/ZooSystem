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


public class EmployeeDetails extends Application {
	private Employee displayEmp;
	public EmployeeDetails(Employee emp) {
		displayEmp = emp;
	}
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage ) throws Exception {
		primaryStage.setTitle("Employee Details");
		
		Text text1 = new Text("View the details for this employee");
		text1.setStyle("-fx-font-size: 40;");
		Text text2 = new Text("Name: " + displayEmp.getFirstName() + " " + displayEmp.getLastName());
		text1.setStyle("-fx-font-size: 25;");
		Text text3 = new Text("Employee Type: " + displayEmp.getWorkType() + "\nPay: " + displayEmp.getSalary());
		text1.setStyle("-fx-font-size: 25;");
		
		Button backButton = new Button();
		backButton.setText("Back");
		backButton.setMaxHeight(200);
		backButton.setStyle("-fx-background-color: \n" + "        #090a0c,\n"
				+ "        linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),\n"
				+ "        linear-gradient(#20262b, #191d22),\n"
				+ "        radial-gradient(center 50% 0%, radius 100%, rgba(114,131,148,0.9), rgba(255,255,255,0));\n"
				+ "    -fx-background-radius: 5,4,3,5;\n" + "    -fx-background-insets: 0,1,2,0;\n"
				+ "    -fx-text-fill: white;\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n"
				+ "    -fx-font-family: \"Arial\";\n" + "    -fx-text-fill: linear-gradient(white, #d0d0d0);\n"
				+ "    -fx-font-size: 12px;\n" + "    -fx-padding: 10 20 10 20;");
		backButton.setOnAction(e -> {
			SignInEmployee login = new SignInEmployee();
			try {
				login.start(primaryStage);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.TOP_CENTER);

		gridPane.setHgap(20);
		gridPane.setVgap(20);
		gridPane.add(text1, 1, 0);
		gridPane.add(text2, 1, 1);
		gridPane.add(text3, 2, 1);
		gridPane.add(backButton, 2, 2);

		
		gridPane.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: pink;"
				+ "-fx-background-color: white;");

		Scene scene = new Scene(gridPane, 1000, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
