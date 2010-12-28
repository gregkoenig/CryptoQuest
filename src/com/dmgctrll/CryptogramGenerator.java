package com.dmgctrll;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CryptogramGenerator {
	
	HashMap<Character, Character> cryptogramHashMap = new HashMap<Character, Character>();
		
	public String getCryptogramFromQuote(String quote){
		
		return createCryptogramFromQuote(quote);
	}
	
	private String createCryptogramFromQuote(String quote){
		
		// Make new one each time
		cryptogramHashMap.clear();
		
		String cryptoquote = quote;
		
		Character[] cryptogram = new Character[cryptoquote.length()];
		
		for(int i = 0; i < cryptoquote.length(); i++){
			
			Character c = cryptoquote.charAt(i);
			
			// ignore spaces
			if(c == ' '){
				
				cryptogram[i] = ' ';
			
			}else if(c == '.'){
					
				cryptogram[i] = '.';
				
			}else if(c == '-'){
				
				cryptogram[i] = '-';
				
			// if letter already in hashMap, 
			}else if(cryptogramHashMap.containsKey(c)) {
				
				// get value of key
				cryptogram[i] = (Character) cryptogramHashMap.get(c);
				
			// if letter not present in hashMap					
			}else if(!cryptogramHashMap.containsKey(c)) {
				
				// create new key/value pair and pop letter from alphabet pool
				Character scrambledLetter = getNewRandomLetterFromAlphabetPool(c);
				cryptogram[i] = scrambledLetter;			
					
			}else{
				
				// throw error

			}
					
		}
		
		// convert array to string
		String quoteAfterBeingScrambled = Arrays.toString(cryptogram);
		return quoteAfterBeingScrambled;
	}
	
	private Character getNewRandomLetterFromAlphabetPool(Character c){
		
		ArrayList<Character> letterPool = getAlphabetPool();
		
		Character scrambledLetter;
		boolean test = true;
		
		// until the newChar is not equal to 'c'
		while(test){
			
			Random random = new Random();
			int x = random.nextInt(letterPool.size()) + 1;
			Character randomCharacter = letterPool.get(x);
			
			// make sure random letter is not equal to 'c'
			if(!(randomCharacter == c)){		
				cryptogramHashMap.put(c, randomCharacter);
				letterPool.remove(x);
				test = false;		
			}	
		}
		
		scrambledLetter = (Character) cryptogramHashMap.get(c);
		return scrambledLetter;
	}
	
	private ArrayList<Character> getAlphabetPool(){
		
		ArrayList<Character> alphabetPool = new ArrayList<Character>();
		
		alphabetPool.add('A');	alphabetPool.add('B');	alphabetPool.add('C');
		alphabetPool.add('D');	alphabetPool.add('E');	alphabetPool.add('F');
		alphabetPool.add('G');	alphabetPool.add('H');	alphabetPool.add('I');
		alphabetPool.add('J');	alphabetPool.add('K');	alphabetPool.add('L');
		alphabetPool.add('M');	alphabetPool.add('N');	alphabetPool.add('O');
		alphabetPool.add('P');	alphabetPool.add('Q');	alphabetPool.add('R');
		alphabetPool.add('S');	alphabetPool.add('T');	alphabetPool.add('U');
		alphabetPool.add('V');	alphabetPool.add('W');	alphabetPool.add('X');
		alphabetPool.add('Y');	alphabetPool.add('Z');	
		
		return alphabetPool;
	}	

}
