package com.exercises.maven.git_with_branch_calculator;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();
	private static final Logger LOG = Logger.getLogger(Calculator.class.getName());

	@Test
	public void testAdd() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextInt(100);
			secondNumber = random.nextInt(100);
			result = firstNumber + secondNumber;
			LOG.info("Testing the method with " + firstNumber + " and " + secondNumber);
			assertEquals(c.add(firstNumber, secondNumber), result);
		}
	}
	@Test
	public void testSubtract() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextInt(100);
			secondNumber = random.nextInt(100);
			result = firstNumber - secondNumber;
			LOG.info("Testing the method with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtract(firstNumber, secondNumber), result);
		}
	}
	@Test
	public void testMultiply() {
		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			firstNumber = random.nextInt(100);
			secondNumber = random.nextInt(100);
			result = firstNumber * secondNumber;
			LOG.info("Testing the method with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiply(firstNumber, secondNumber), result);
		}
	}
	@Test
	public void testDivide() {
		DecimalFormat df = new DecimalFormat("#.##");
		Random random = new Random();
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;
		
		LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(c.divide(firstNumber, secondNumber)), Math.round(result));
		
		for(int i = 0;i<10;i++) {
		firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
		secondNumber = 0;
		result = -0.123456789;
		LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(c.divide(firstNumber, secondNumber)), Math.round(result));
		
		firstNumber = 0;
		secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
		result = firstNumber / secondNumber;
		LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(c.divide(firstNumber, secondNumber)), Math.round(result));
		
		firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
		secondNumber = Double.valueOf(df.format(random.nextDouble()*100));
		result = firstNumber / secondNumber;
		LOG.info("Testing the method with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(c.divide(firstNumber, secondNumber)), Math.round(result));
		
		
		}
		
	}
}
