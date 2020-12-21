package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class CreateController {
	
	@FXML
    private PasswordField pb1;

    @FXML
    private PasswordField pb2;

    @FXML
    private Button btn_create;
    
    @FXML
    private Button btn_close;
    
    
    

    @FXML
    void displayMsg(ActionEvent event) {
    	
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Create profile");
    	alert.setHeaderText("");
    	String s ="Profile created successfully";
    	alert.setContentText(s);
    	alert.show();

    }
    
    
    
    @FXML
    void displayVerificationMsg(ActionEvent event) {
    	
    	if (pb1.getText() == null ? pb2.getText() != null : !pb1.getText().equals(pb2.getText()) ){

    	       Alert alert = new Alert(Alert.AlertType.WARNING);
    	            alert.setTitle("Warning");
    	            alert.setHeaderText("PASSWORD MISMATCH");
    	            alert.setContentText("CHECK YOUR PASSWORDS . "
    	                    + "\nPlease try again.");
    	            alert.showAndWait(); 
    	       }
    	
        

    }

    
    
    
    
    @FXML
    public void handleCloseButton(ActionEvent event) {
    	Stage stage = (Stage) btn_close.getScene().getWindow();
        stage.close();
    }
    
    

}