package application.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class LoginView {
	private int btnWidth = 10;
	private Button signInBtn, addUserBtn, exitBtn;
	private Label nameLabel, passLabel;
	private TextField nameField;
	private PasswordField passField;
	private Text sceneTitle;
	private TilePane tPane;
	private LoginButtonListener listener;
	
	public LoginView(GridPane root) {

//		view elements
//		buttons
		addUserBtn = new Button("Add user");
		signInBtn = new Button("Sign in");
		exitBtn = new Button("Exit");

		signInBtn.setMaxWidth(Double.MAX_VALUE);
		addUserBtn.setMaxWidth(Double.MAX_VALUE);
		exitBtn.setMaxWidth(Double.MAX_VALUE);
		
//		labels and fields
		nameLabel = new Label("User Name:");
		passLabel = new Label("Password:");
		nameField = new TextField();
		nameField.setPromptText("Enter username");
		passField = new PasswordField();
		passField.setPromptText("Enter your password");
		sceneTitle = new Text("WELCOME");
		sceneTitle.setFont(Font.font("Tahome", FontWeight.NORMAL, 20));

//		bottom panel		
		tPane = new TilePane(Orientation.HORIZONTAL);
		tPane.setAlignment(Pos.BOTTOM_RIGHT);
		tPane.setHgap(10);
		
//		buttons actions
//		signInBtn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				listener.buttonEventPerformed(new LoginButtonEvent(nameField.getText(), passField.getText()));
//			}
//		});
		signInBtn.setOnAction(ActionEvent ->
		listener.buttonEventPerformed(new LoginButtonEvent(nameField.getText(), passField.getText())));
		exitBtn.setOnAction(ActionEvent -> Platform.exit());
//		exitBtn.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				Platform.exit();
//			}
//		});		

//		add elements
		root.add(sceneTitle, 0, 0, 2, 1);
		root.add(nameLabel, 0, 1, 1, 1);
		root.add(passLabel, 0, 2, 1, 1);
		root.add(nameField, 1, 1, 1, 1);
		root.add(passField, 1, 2, 1, 1);
		tPane.getChildren().addAll(signInBtn, addUserBtn, exitBtn);
		root.add(tPane, 0, 3, 2, 1);
	}
	
	public void loginEventPerformed(LoginButtonListener listener) {
		this.listener = listener;
	}
}
