package modèle;
import java.util.Stack;

public class Model implements CalculatorModelInterface {
	
	public String accumulator;
	public Stack<Float> pile;
	
	public Model(String acc) {
		this.accumulator = acc;
		this.pile = new Stack<>();
	}
	
	public void add() {
		float a = pile.pop();
		float b = pile.pop();
		pile.add(a + b);
	}
	public void substract() {
		float a = pile.pop();
		float b = pile.pop();
		pile.add(b - a);
	}
	public void multiply() {
		float a = pile.pop();
		float b = pile.pop();
		pile.add(a * b);
	}
	public void divide() {
		float a = pile.pop();
		float b = pile.pop();
		pile.add(b / a);
	}
	public void opposite() {
		float a = pile.pop();
		pile.add(-1*a);
	}
	public void push() {
		pile.add(Float.parseFloat(accumulator));
		accumulator = "";
	}
	public float pop() {
		return pile.pop();
	}
	public void drop() {
		pile.pop();
	}
	public void swap() {
		float a = pile.pop();
		pile.add(a);
	}
	public void clear() {
		pile.clear();
	}
}
