package view;

import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalculatorGUI implements CalculatorGUIInterface {
	
	public void affiche(String accumulator) { // NORMALEMENT PAS D'ARGUMENT 
		Scene scene = new Scene(400, 200);
		TextField encours = new TextField(); //où l'utilisateur va écrire grâce aux boutons
		
		Button bouton1 = new Button("1");
		bouton1.setOnAction(change(accumulator));
		
		Button bouton2 = new Button("2");
		Button bouton3 = new Button("3");
		Button bouton4 = new Button("4");
		Button bouton5 = new Button("5");
		Button bouton6 = new Button("6");
		Button bouton7 = new Button("7");
		Button bouton8 = new Button("8");
		Button bouton9 = new Button("9");
				
	}
	
	public void change(String accu) {
		CalculatorControler.change(accu);
	}
	public void change(Stack<Float> pile) {
		
	}
}
