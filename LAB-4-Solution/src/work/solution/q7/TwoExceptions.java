package work.solution.q7;
import java.util.*;
import java.io.*;
class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputException() {
		super("Input Exception occured");
	}

}
public class TwoExceptions {

	public static void throwException(int number) throws IOException,InputException{
		if(number==1) {
			throw new IOException();
		}
		throw new InputException();
	}
	
	public static void main(String[] args) {
		int Min=1;
		int Max=2;
		int num=Min + (int)(Math.random() * ((Max - Min) + 1));
		System.out.println(num);
		
		try {
			throwException(num);
		} catch (InputException e) {
			System.out.println("Input Exception occurred");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Io Exception occurred");
			e.printStackTrace();
		}
	
		
		//Three things suggested :==>
		//1 .(Add throws declaration) 
		//2 .(Surrround with try and multi catch) =>not preferred
		//3 .(Surround with try-catch)
	}
}
