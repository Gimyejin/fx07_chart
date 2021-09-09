package fx07_chart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("eventTest.fxml"));
		Parent root = loader.load();
		
		Scene sc = new Scene(root);
		Controller ctl = loader.getController();
		ctl.setroot(root);
		
		arg0.setScene(sc);
		arg0.show();

	}
}
