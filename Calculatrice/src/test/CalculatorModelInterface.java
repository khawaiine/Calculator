package test;
import java.util.Stack;
public class CalculatorModelInterface{
	
private Stack<Double> pile = new Stack<>();

public void push(double value) {
	pile.push(value);
}

public double pop() {
	if (pile.isEmpty()){
		return 0;
	}
	return pile.pop();
}
}
