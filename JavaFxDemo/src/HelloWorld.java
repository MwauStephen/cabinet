import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloWorld  extends Application{
	public static void main(String[] args) {
		 launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn=new Button("First Button");
		Button exit=new Button("Exit");
		exit.setOnAction(e-> {
			System.out.println("Exit this app");
			System.exit(0);
		});
		btn.setOnAction(new EventHandler<ActionEvent>() {
	
			@Override
			public void handle(ActionEvent event) {
		System.out.println("Hello world!!  ");	
		}
		});
		
		VBox root=new VBox();
		root.getChildren().addAll(btn,exit);
		Scene scene=new Scene(root,500,300);
		primaryStage.setTitle("my first stage window");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
}
