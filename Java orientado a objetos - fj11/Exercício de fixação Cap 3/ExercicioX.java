class ExercicioX {
	public static void main(String[] args){
	//Imprima todos os némeros de 150 a 300.

		for (int i = 150; i < 301 ;i++ ) {
			System.out.println(i);
		}

	//Imprima a soma de 1 até 1000.
				int j =0;
			for (int i = 1; i < 1000 ; i++ ) {
				
				int resultado;
				resultado = j + i;
				j = resultado;
				if ( j <= 1000) {
					System.out.println(j);
				}
				
			}
		

	//Imprima todos os múltiplos de 3 entre 1 e 100;

		for (int i = 1; i < 100 ; i++ ) {
			if (i%3 == 0) {
				System.out.println(i);
			}
		}

	//Imprima os fatoriais de 1 a 10;
		
		long fatorial = 1;
		for (long n = 1; n <= 40; n++ ) {
			long resultado;
			resultado = fatorial * n;
			fatorial = resultado;
			System.out.println(fatorial);
		}
	
	//Imprima os primeiros números da série de Fibonacci
		System.out.print("0" + " "+ "1" + " ");
			int primeiro = 0;
			int segundo = 1;
		for (int atual = 0; atual < 11; atual++) {
			int resultado;

			resultado = primeiro;
			primeiro = segundo;
			segundo = segundo + resultado;
			
			System.out.print(segundo + " " );
			
		}
		System.out.println();
	// Escreva um programa de x
		int x = 13;
		for (int i = 0; i <  8; i++) {
		
			if (x % 2 == 0) {
		
				x = x / 2;
				
			}else{
				
				x = 3 * x + 1;

				
			}
			System.out.print(x + "->");
		
		}	
		
		


	//Usando fors encadeados
		for (int i = 1; i < 2 ; i++ ) {
			System.out.println(i);
			}
		for (int i= 1; i < 5 ; i++ ) {
			if (i%2 == 0){
			System.out.print(i + " ");

			}
		}
		System.out.println();
		for (int i= 3; i < 10 ; i++ ) {
			if (i%3 == 0){
			System.out.print(i + " ");	
			}
		}
		System.out.println();
		for (int i= 4; i < 17 ; i++ ) {
			if (i%4 == 0){
			System.out.print(i + " ");	
			}
		}
		System.out.println();
		System.out.print("n" + " ");
		for (int i= 2; i < 4; i++ ) {
				
			System.out.print("n*"+i + " ");	
			
		}
		System.out.print(".... n*n");
		}
			
	}
			

		
	
