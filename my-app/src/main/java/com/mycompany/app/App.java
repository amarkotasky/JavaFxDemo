package com.mycompany.app;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 *
 * @author amar.khan
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	Button btn= new Button("click me");
       	Button exit= new Button("exit");
       	exit.setOnAction(e -> {
       		System.out.println("exit");
       		System.exit(0);
       	});
       
        btn.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent event) {
                System.out.println("amar");
            }
        }
        		);
//    	StackPane parent=new StackPane();
        VBox parent = new VBox();
    	parent.getChildren().add(btn);
    	parent.getChildren().add(exit);
    	Scene scene = new Scene(parent,500,300);
    	primaryStage.setScene(scene);
       	primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
