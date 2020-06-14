package Ejercicio5;

import java.util.Stack;

public class program {
	

	public static void main(String[] args) {
		
		System.out.println(paridad());
		

	}
	
	
	public static boolean paridad() {
		Stack<Character> pilita = new Stack<Character>();
		char abreLlave = '{';
		char abreCorchete = '[';
		char abreParentesis = '(';
		
		char cierreLlave = '}';
		char cierreCorchete = ']';
		char cierreParentesis = ')';
		
		String cadena1 = "{[(asdfasdf)asd}]sdf";
				
		char cadena_char1[] = cadena1.toCharArray();
				
		for(int i = 0; i < cadena_char1.length; i++) {
			
			if(cadena_char1[i] == abreLlave) {
				pilita.push(abreLlave);
			
				for(int j = i+1; j < cadena_char1.length; j++) {
					
					if(cadena_char1[j] == cierreLlave) {
						pilita.pop();
					}
				}				
			}
			
			if(cadena_char1[i] == abreCorchete) {
				pilita.push(abreCorchete);
			
				for(int j = i+1; j < cadena_char1.length; j++) {
					
					if(cadena_char1[j] == cierreCorchete) {
						pilita.pop();
					}
				}				
			}
			
			if(cadena_char1[i] == abreParentesis) {
				pilita.push(abreParentesis);
			
				for(int j = i+1; j < cadena_char1.length; j++) {
					
					if(cadena_char1[j] == cierreParentesis) {
						pilita.pop();
					}
				}				
			}
			
					
		}
		
		
		
		/*if(cadena_char1[i] == '{'  ) {					
			pilita.push('{');
			if(cadena_char2[i] == '}') {
				if(!pilita.empty()) {						
					pilita.pop();						
				}
			}										
		}else if(cadena_char1[i] == '['  ) {					
			pilita.push('[');
			if(cadena_char2[i] == ']') {
				if(!pilita.empty()) {						
					pilita.pop();						
				}
			}										
		}else if(cadena_char1[i] == '('  ) {					
			pilita.push('(');
			if(cadena_char2[i] == ')') {
				if(!pilita.empty()) {						
					pilita.pop();						
				}
			}										
		}*/
		
		
		return pilita.empty();
		
	}

}
