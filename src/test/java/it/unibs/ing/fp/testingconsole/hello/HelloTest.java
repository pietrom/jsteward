package it.unibs.ing.fp.testingconsole.hello;

import it.unibs.ing.fp.testingconsole.hello.Hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
	@Test
	public void defaultMessageForDefaultTarget() throws Exception {
		final Hello hello = new Hello();
		assertEquals("Hello, World!", hello.sayHello());
	}
	
	@Test
	public void customMessageForDefaultTarget() throws Exception {
		final Hello hello = new Hello("HY");
		assertEquals("HY, World!", hello.sayHello());
	}
	
	@Test
	public void customMessageToCustomTarget() throws Exception {
		final Hello hello = new Hello("HY");
		assertEquals("HY, Duke!", hello.sayHello("Duke"));
	}
}
