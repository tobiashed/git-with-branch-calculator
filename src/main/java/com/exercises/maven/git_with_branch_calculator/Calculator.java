package com.exercises.maven.git_with_branch_calculator;

public class Calculator {
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	public int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	public double divide(double firstNumber, double secondNumber){
		double result = firstNumber/secondNumber;
		if (secondNumber == 0) {
			System.out.println("Division by zero?");
			return -0.123456789;
		}
		return result;
	}
	
}
