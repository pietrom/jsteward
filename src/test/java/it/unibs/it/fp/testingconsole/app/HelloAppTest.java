package it.unibs.it.fp.testingconsole.app;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloAppTest {
	
	@Test
	public void singleExecutionAndExit() throws Exception {
		final String newLine = System.getProperty("line.separator");
		
		final Scanner scanner = new Scanner("Duke n");
		scanner.useDelimiter(" ");
		
		StringWriter outputBuffer = new StringWriter();
		PrintWriter out = new PrintWriter(outputBuffer);
		
		final HelloApp app = new HelloApp(scanner, out);
		app.run();
		final String output = outputBuffer.toString();
		assertTrue(output.startsWith("Welcome to HelloApp!"));
		assertTrue(output.endsWith("GoodBye" + newLine));
		assertTrue(output.contains("Message is: Hello, Duke!"));
		String[] items = output.split("Message destination\\?");
		assertEquals(2, items.length);
	}
	
	@Test
	public void tripleExecutionAndExit() throws Exception {
		final String newLine = System.getProperty("line.separator");
		
		final Scanner scanner = new Scanner("Duke y Goofy y Donald n");
		scanner.useDelimiter(" ");
		
		StringWriter outputBuffer = new StringWriter();
		PrintWriter out = new PrintWriter(outputBuffer);
		
		final HelloApp app = new HelloApp(scanner, out);
		app.run();
		final String output = outputBuffer.toString();
		assertTrue(output.startsWith("Welcome to HelloApp!"));
		assertTrue(output.endsWith("GoodBye" + newLine));
		assertTrue(output.contains("Message is: Hello, Duke!"));
		assertTrue(output.contains("Message is: Hello, Goofy!"));
		assertTrue(output.contains("Message is: Hello, Donald!"));
		String[] items = output.split("Message destination\\?");
		assertEquals(4, items.length);
	}
	
	
}
