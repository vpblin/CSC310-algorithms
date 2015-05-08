package finite_automatas;

import java.util.Scanner;

public class FiniteAutomata_Assignment11 {
	public static void main(String args[]){
		int state = 1;
		
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 100; i ++){
			System.out.println("String automata");
			int current_char = 0;
			String input = in.next();

		while(current_char < input.length()){
			
			char input_char = input.charAt(current_char);
			current_char ++;
			switch(state){
				case 1:
					switch(input_char){
						case 'a':
							state = 2;
						break;
						case 'c':
							state = 6;
						break;
					}
				break;
				case 2:
					switch(input_char){
						case 'a':
							state = 3;
						break;
						case 'b':
							state = 4;
						break;
						case 'c':
							state = 2;
						break;
					}
				break;
				case 3:
					switch(input_char){
						case 'a':
							state = 4;
						break;
						case 'b':
							state = 2;
						break;
						case 'c':
							state = 2;
						break;

					}
				break;
				case 4:
					switch(input_char){
						case 'a':
							state = 3;
						break;
						case 'b':
							state = 1;
						break;
						case 'c':
							state = 5;
						break;

					}
				break;
				case 5:
					switch(input_char){
						case 'a':
							state = 1;
						break;
						case 'b':
							state = 4;
						break;
						case 'c':
							state = 6;
						break;

					}
				break;
				case 6:
					switch(input_char){
						case 'a':
							state = 1;
						break;
						case 'b':
							state = 5;
						break;
						case 'c':
							state = 4;
						break;

					}
				break;


			}
		}
		
		if(state ==6){
			System.out.println(input + "Accepted. End state was " + state);
			
		}else{
			System.out.println(input + "Not Accepted. End state was " + state);
		}
		}
	}
}
