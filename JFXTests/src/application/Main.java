package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
			int xRes = 640;
			int yRes = 480;
			Group root = new Group();
			Scene scene = new Scene(root,xRes,yRes, Color.BLACK); //optional color.COLOR after defining the resolution.
			Image icon = new Image(getClass().getResource("/application/png/traveller.png").toExternalForm());
			primaryStage.getIcons().add(icon);
			primaryStage.setTitle("Stage Demo");
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setResizable(false);
			Text expos = new Text(xRes / 4, yRes / 2, "Stage Demo");
			expos.setFill(Color.WHITE);
			expos.setFont(Font.font("Verdana", 50));
			
			
			root.getChildren().add(expos);
			primaryStage.setScene(scene);
			primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
