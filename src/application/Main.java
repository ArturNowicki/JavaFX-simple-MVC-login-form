package application;
	
import application.controller.LoginViewController;
import application.view.LoginView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Sample");
		GridPane root = new GridPane();
		root.setVgap(10);
		root.setHgap(10);
		root.setPadding(new Insets(25, 25, 25, 25));
		LoginView loginView = new LoginView(root); 
		LoginViewController loginController = new LoginViewController(loginView);

		Scene scene = new Scene(root,320,200);
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		loginView.loginEventPerformed(loginController);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
