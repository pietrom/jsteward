package it.unibs.ing.fp.testingconsole.hello;

public class Hello {
	private final String baseMessage;
	public Hello() {
		this("Hello");
	}

	public Hello(String baseMessage) {
		this.baseMessage = baseMessage;
	}

	public String sayHello() {
		return sayHello("World");
	}

	public String sayHello(String target) {
		return String.format("%s, %s!", baseMessage, target);
	}

}
