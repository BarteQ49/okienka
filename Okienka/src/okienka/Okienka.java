
package okienka;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Okienka extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        VBox root = new VBox();
        root.setPadding(new Insets(10,10,10,10));
        root.setSpacing(5);
        root.setStyle("-fx-background-color: #336699;");
        root.getChildren().add(new Text("Nauczyciel"));
        root.getChildren().add(new Hyperlink("Moje przedmioty"));
        root.getChildren().add(new Hyperlink("Moje klasy"));
        root.getChildren().add(new Hyperlink("Sprawdziany"));
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
