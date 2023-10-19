package controler;

public class CalculatorControler implements CalculatorControlerInterface {

	public void change(ActionEvent event, String accu) {
		Button clickedButton = (Button) event.getSource(); 	
		String numero = clickedButton.getText();
		accu += numero;
	}
	
	public void change(String accu) {
		
	}
	
	public void change(Stack<Float> pile) { 
		
	}
	// import stack ? boutons +, /... declenchent methodes du modele
		

	
}
