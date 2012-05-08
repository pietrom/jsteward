package it.unibs.it.fp.testingconsole.io;

import java.io.PrintWriter;
import java.util.Scanner;

public class IOUtil {
	private final Scanner in;
	private final PrintWriter out;
	
	public IOUtil(Scanner scanner, PrintWriter out) {
		this.in = scanner;
		this.out = out;
	}

	public String readString(String message) {
		printAndFlush(message);
		return in.next();
	}

	public void println(String message) {
		out.println(message);
	}

	public boolean readBoolean(String message, String yes, String no) {
		Boolean result = null;
		while(result == null) {
			printAndFlush(message);
			String input = in.next();
			if(yes.equalsIgnoreCase(input)) {
				result = Boolean.TRUE;
			} else if(no.equalsIgnoreCase(input)) {
				result = Boolean.FALSE;
			}
		}
		out.println();
		return result;
	}
	
	private void printAndFlush(String message) {
		out.print(message);
		out.flush();
	}
}
