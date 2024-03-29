package it.unibs.ing.fp.testingconsole.app;

import it.unibs.ing.fp.testingconsole.hello.Hello;
import it.unibs.ing.fp.testingconsole.io.IOUtil;

import java.io.PrintWriter;
import java.util.Scanner;

public class HelloApp {
	private final IOUtil io;
	// START SNIPPET: new-hello-app
	public HelloApp(Scanner scanner, PrintWriter out) {
		io = new IOUtil(scanner, out);
	}
	// END SNIPPET: new-hello-app
	public void run() {
		io.println("Welcome to HelloApp!");
		boolean go = true;
		Hello hello = new Hello();
		while(go) {
			String target = io.readString("Message destination?");
			io.println(String.format("Message is: %s", hello.sayHello(target)));
			go = io.readBoolean("Continue?", "y", "n");
		}
		io.println("GoodBye");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		HelloApp app = new HelloApp(scanner, new PrintWriter(System.out, true));
		app.run();
	}
}
