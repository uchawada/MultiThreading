package code;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OceanExplorer extends Application{

	int[][] islandMap;  
	Pane root;
	final int dimensions = 50;
	final int scalingFactor = 20;
	OceanMap oceanMap;
	Monster monster;
	Scene scene;
	Thread monstersThread;
	
	@Override
	public void start(Stage mapStage) throws Exception {
		
		
		oceanMap = new OceanMap(dimensions);
		islandMap = oceanMap.getMap(); 
		
		root = new AnchorPane();	
		drawMap();

		scene = new Scene(root,1000,1000);
		mapStage.setTitle("Shark Attack");
		mapStage.setScene(scene);
		
		monster = new Monster(scalingFactor);
		monster.addToPane(root.getChildren());
		mapStage.show();
		
		monstersThread = new Thread(monster);
	    monstersThread.start();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void stop(){
		monstersThread.stop();
	}
		  
	// Draw ocean and islands
	public void drawMap(){
		for(int x = 0; x < dimensions; x++){
			for(int y = 0; y < dimensions; y++){
				
				if(islandMap[x][y] == 0){
					Rectangle rect = new Rectangle(x*scalingFactor,y*scalingFactor,scalingFactor,scalingFactor);
					rect.setStroke(Color.BLACK);
					rect.setFill(Color.PALETURQUOISE);
					root.getChildren().add(rect);
				}
				else // Need to load an image
				{
					Rectangle rect = new Rectangle(x*scalingFactor,y*scalingFactor,scalingFactor,scalingFactor);
					rect.setStroke(Color.BLACK);
					rect.setFill(Color.RED);
					root.getChildren().add(rect);
				}
			}
		}
	}
	
	public static void main(String[] args) {
     	launch(args);
    }

}
