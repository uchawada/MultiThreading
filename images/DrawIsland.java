package images;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawIsland extends Application{
	
	Random rand = new Random();
	int scalingFactor = 25;

	@Override
	public void start(Stage myIsland) throws Exception {
		Pane pane = new AnchorPane();
	//	Rectangle island = new Rectangle(rand.nextInt(10)*scalingFactor,rand.nextInt(10)*scalingFactor,scalingFactor, scalingFactor);
		
	//	island.setStroke(Color.BLACK);
	//	island.setFill(Color.GREENYELLOW);
	//	pane.getChildren().add(island);
			
		Scene scene = new Scene(pane,400,400);	
		myIsland.setTitle("My Island");
		myIsland.setScene(scene);
		myIsland.show();
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
