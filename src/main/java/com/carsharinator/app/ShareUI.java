package test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShareUI extends Application {

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		showStartScreen();
		showSearchScreen();
	}
	
	private void showSearchScreen() {
		Stage searchStage = new Stage();
		Pane pane = new Pane();
		Button btnSearch = new Button();
		
		try {
			InputStream stream = getClass().getClassLoader().getResourceAsStream("default.png");
			InputStream stream2 = getClass().getClassLoader().getResourceAsStream("search_btn.png");
			InputStream stream3 = getClass().getClassLoader().getResourceAsStream("cs_icon.png");
		
			Image loginBackground = new Image(stream);
			Image searchButton = new Image(stream2);
			Image csIcon = new Image(stream3);
			
			btnSearch.setGraphic(new ImageView(searchButton));
			btnSearch.setStyle("-fx-background-color: #FEFEFE");
					
			searchStage.getIcons().add(csIcon);
	        
	        pane.getChildren().add(new ImageView(loginBackground));
		} catch (NullPointerException e) {
			System.out.println("Image files could not be read in and will be missing");
		}
		
		TextField txtSearchBar = new TextField();
		TableView<String> tvResults = new TableView<String>();
		
		txtSearchBar.setPrefSize(220, 30);
		txtSearchBar.setLayoutX(10);
		txtSearchBar.setLayoutY(90);
		
		tvResults.setPrefSize(300, 403);
		tvResults.setLayoutX(0);
		tvResults.setLayoutY(130);
		
		btnSearch.setPrefSize(50, 30);
		btnSearch.setLayoutX(230);
		btnSearch.setLayoutY(90);
		
		pane.getChildren().add(txtSearchBar);
		pane.getChildren().add(tvResults);
		pane.getChildren().add(btnSearch);
		
		btnSearch.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               search(txtSearchBar.getText());
            }
        });
		
		searchStage.setScene(new Scene(pane, 300, 533));
		searchStage.show();
	}

	public void showStartScreen() {
		Stage loginStage = new Stage();
		
		Pane pane = new Pane();
		
		Button btnLogin = new Button();
		
		try {
			InputStream stream = getClass().getClassLoader().getResourceAsStream("login.png");
			InputStream stream2 = getClass().getClassLoader().getResourceAsStream("login_btn.png");
			InputStream stream3 = getClass().getClassLoader().getResourceAsStream("cs_icon.png");
		
			Image loginBackground = new Image(stream);
			Image loginButton = new Image(stream2);
			Image csIcon = new Image(stream3);
			
			btnLogin.setGraphic(new ImageView(loginButton));
			btnLogin.setStyle("-fx-background-color: #FEFEFE");
					
			loginStage.getIcons().add(csIcon);
	        
	        pane.getChildren().add(new ImageView(loginBackground));
		} catch (NullPointerException e) {
			System.out.println("Image files could not be read in and will be missing");
		}
		
		TextField txtUsername = new TextField();
		TextField txtPassword = new TextField();

		loginStage.setTitle("CarSharinator Login");
	    
	    txtUsername.setPrefSize(280, 30);
	    txtUsername.setLayoutX(10);
	    txtUsername.setLayoutY(175);
	    
	    txtPassword.setPrefSize(280, 30);
	    txtPassword.setLayoutX(10);
	    txtPassword.setLayoutY(315);
	    
	    btnLogin.setPrefSize(100, 40);
	    btnLogin.setLayoutX(0);
	    btnLogin.setLayoutY(400);
	    
	    pane.getChildren().add(txtUsername);
	    pane.getChildren().add(txtPassword);
	    pane.getChildren().add(btnLogin);
	    
	    btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               login(txtUsername.getText(), txtPassword.getText());
            }
        });

	    loginStage.setScene(new Scene(pane, 300, 533));
	    loginStage.show();
	}

	private boolean login(String username, String password) {
		// TODO
		System.out.println("Logged in!");
		
		return true;
	}
	
	private List<String> search(String string) {
		// TODO
		List<String> results = new ArrayList<String>();
		results.add("Bielefeld nach Löhne");
		results.add("Löhne nach Bielefeld");
		
		return results;
	}
}
