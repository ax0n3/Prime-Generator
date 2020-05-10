package prime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Prime {
	// definition: a number that is not fully divisible 
	// by any other numbers other than 1 and itself.
	
	// Global
	Queue<Integer> primesA;
	int start;
	int end;
	int UPPER_LIMIT;
	
	public Prime(int s, int e) throws IOException {
		start = s;
		end = e;
	}
	// uses linked list to store data
	public int[] alpha() {
		int beginning = start
		LinkedList<Integer> nodeLL = new LinkedList<>();
		ListIterator<Integer> iteratorIndex = null;
		
		if(beginning < 1 || end > UPPER_LIMIT)
			throw new Exception("Unexpected lower bound.");
		
		int counter = start;
		if(counter == 1)
			counter++;
		
		while(counter < end) {
			if(iteratorIndex != null) {
				iteratorIndex = nodeLL.listIterator(0);
				
				int ni;
				while(itertorIndex.hasNext()) {
					ni = iteratorIndex.next();
					if(counter % i == 0)
						break;
				}
				nodeLL.add(count);
			}
			else {
				if(isPrime(counter))
					nodeLL.add(counter);
			}
			counter++;
		}
		
		if(start == 1)
		nodeLL.addFirst(1);
	}
	public void hasFactors() {
		
	}
	public void getFactors() {
		
	}
	public void write() {
		// Create sequence from start to end without base primes
		// find list of primes leading up to start
		// remove component numbers
		File sequence = new File("sequence-temp.txt");
		if(sequence.exists()) 
			sequence.delete();
		sequence.createNewFile();					
		System.setOut(new PrintStream(sequence));
		
		int[] bp = {2,3,5,7};
		for(int i=start;i<end;i++) {
			for(int p:bp)
				if(i % p != 0)
					System.out.println(i);				
		}
		
		FileReader readSequence = new FileReader(sequence);
		BufferedReader br = new BufferedReader(readSequence);
		
		String getLine = "";
		int n;
		while(getLine != null) {
			n = Integer.parseInt(getLine);
		}
	}
	public int[] getArray() {
		
	}
	// ex: i = 7
	public boolean isPrime(int i){
		// return isPrimeRECURSIVE(i);
		// probably not possible
		
		/*
		 * 
		// base case primes
		int[] primes = {1,2,3,5,7};
		
		for(int p:primes) {
			if(i == p)
				return true;
			if(i % p == 0)
				return false;
		}
		*
		*/
		
	}
	private boolean isPrimeRECURSIVE(int n) {
		// add 1 to primes
		if(n == 1) 
			return true;
		return isPrimeRecursive(n-1));
	}
}
