import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.event.*;
public class calc extends Application{
    // Override the start method in the Application class
   private Button button7, button8;
   private TextField tf = new TextField();
    public void start(Stage primaryStage){
        // create a border pane
        BorderPane pane = new BorderPane();
        // BorderPane pane1 = new BorderPane();
        
        GridPane pane1 = new GridPane();
       
        //  pane1.setAlignment(Pos.CENTER);
        // pane.setTop(new CustomPane("Bottom"));
        // BorderPane pnt = new BorderPane();
        // BorderPane pnc = new BorderPane();
        pane.setTop(tf);
        tf.setEditable(false);
        // container.new CustomPane("Center"));
        
        
        pane1.setPadding(new Insets(10,10,10,10));

        button7 = new Button("7");
        pane1.add(button7,0,0);

        button8 = new Button("8");
        pane1.add(button8, 1, 0);

        pane1.add(new Button("9"), 2,0);
        pane1.add(new Button("*"), 3, 0);
        pane1.add(new Button("4"), 0, 1);
        pane1.add(new Button("5"), 1, 1);
        pane1.add(new Button("6"), 2, 1);
        pane1.add(new Button("-"), 3, 1);
        pane1.add(new Button("1"), 0, 2);
        pane1.add(new Button("2"), 1, 2);
        pane1.add(new Button("3"), 2, 2);
        pane1.add(new Button("+"), 3, 2);
        pane1.add(new Button("%"), 0, 3);
        pane1.add(new Button("0"), 1, 3);
        pane1.add(new Button("."), 2, 3);
        pane1.add(new Button("="), 3, 3);
        
        HandleButton7 handleBtn7 = new HandleButton7();
        button7.setOnAction(handleBtn7);
        HandleButton8 handleBtn8 = new HandleButton8();
        button8.setOnAction(handleBtn8);
        pane.setCenter(new CustomPane1(pane1));

        Scene scene = new Scene(pane,300,300);
        // place nodes in the pane

        primaryStage.setTitle("Calculator :)"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
         primaryStage.show();

    }  
    class HandleButton7 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            tf.setText("7");
        }
    } 
    class HandleButton8 implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            tf.setText("8");
        }
    } 
}
