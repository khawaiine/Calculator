package Calculator;

public class Main {

	public static void main(String[] args) {
		
		Model model = new Model("10");
		
		model.accumulator = "45";
		model.push();
		model.accumulator = "15";
		model.push();
		
		model.add();
		System.out.println(model.pile.pop());

	}

}
