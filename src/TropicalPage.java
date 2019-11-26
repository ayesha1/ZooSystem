
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


public class TropicalPage extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Tropical");

		Text text1 = new Text("Click on animal to interact with");
		text1.setStyle("-fx-font-size: 40;");
		
		Image tropicalImage = new Image("/images/Tropical.png");
		ImageView tropicalView = new ImageView(tropicalImage);
		tropicalView.setFitWidth(200);
		tropicalView.setFitHeight(200);

		Image monkeyImage = new Image("/images/monkey.png");
		ImageView monkeyView = new ImageView(monkeyImage);
		monkeyView.setFitWidth(200);
		monkeyView.setFitHeight(200);
		
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

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);

		gridPane.add(text1, 1, 0);
		gridPane.add(tropicalView, 0, 1);
		gridPane.add(monkeyView, 1, 1);
		gridPane.add(savannahView, 2, 1);

		gridPane.add(dessertView, 0, 2);
		gridPane.add(articView, 1, 2);
		gridPane.add(aquaticView, 2, 2);


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
