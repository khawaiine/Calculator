
package modèle;

public class Main {

	public static void main(String[] args) {
		
		Model model = new Model("10");
		
		model.accumulator = "45";
		model.push();
		model.accumulator = "15";
		model.push();
		
		model.substract();
		
		System.out.println(model.pile.firstElement());
		
		model.accumulator = "2";
		model.push();
		model.multiply();
		
		System.out.println(model.pile.firstElement());
		
		model.accumulator = "15";
		model.push();
		model.divide();
		System.out.println(model.pile.firstElement());
		
		

	}

}
