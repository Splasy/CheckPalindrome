package dad.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComprobarPalindromo extends Application {
	
	private TextField text;
	private Label labelTrue;
	private Label labelFalse;
	private Button boton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		text = new TextField();
		text.setPromptText("Introduce un texto");//texto que sale en la caja de texto cuando no está enfocado
		text.setMaxWidth(150);//maximo de ancho 150 px
		
		boton = new Button("Comprobar");
		boton.setDefaultButton(true);
		boton.setOnAction (e -> onComprobarButtonAction(e));
		
		
		labelTrue = new Label("Aquí va la comprobación");
		labelTrue.setWrapText(true);
		labelFalse = new Label("Aquí va la comprobación");
		labelFalse.setWrapText(true);

	}

	private void onComprobarButtonAction(ActionEvent e) {
		String res = text.getText();
		
		labelTrue.setText("Es palíndromo");
		labelTrue.setStyle("-fx-text-fill: green; -fx-font: bold 20 sans-serif;");//css para personalizar el texto de la ventana
		
		labelFalse.setText("NO es palíndromo");
		labelFalse.setStyle("-fx-text-fill: red; -fx-font: bold 20 sans-serif;");
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
