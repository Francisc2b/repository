package com.curso.juego;

/**
 * Requisito 1
 * 
Una pieza se puede colocar en cualquier espacio vacío de una tablero de 3 × 3. 
Podemos dividir este requisito en tres pruebas: 
• Cuando una pieza se coloca en cualquier lugar fuera del eje X, se lanza RuntimeException. 
• Cuando una pieza se coloca en cualquier lugar fuera del eje Y, se lanza RuntimeException. 
• Cuando una pieza se coloca en un espacio ocupado, se arroja RuntimeException.


Requisito 2
• Debería haber una forma de averiguar qué
jugador debería jugar a continuación. 
• Podemos dividir este requisito en tres pruebas: 
El primer turno debe ser jugado por X 
Si el último turno fue jugado por X, entonces 
el siguiente turno debería ser jugado por O 
Si el último turno fue jugado por O, 
entonces X debe jugar el siguiente turno

Requisito 3
• Un jugador gana al ser el primero en conectar 
una línea de piezas sucesivas de un lado o 
esquina del tablero al otro. 
• Podemos dividir este requisito en tres pruebas: 
Conectó tres ficha horizontalmente 
Conectó tres fichas verticalmente 
Conectó tres ficha en diagonal


 * @author alumno
 *
 */
public class TresEnRaya {
	
	//atributos
	
	private Character[][] tablero;
	private Character jugadorAcutal;
			
	//constructor
	
	public TresEnRaya() {
		this.tablero = new Character[3][3];
		this.jugadorAcutal = 'X';
	}
	
	//métodos
	
	public int suma(int n, int n2) {

		return n + n2;
	}
	
	public void jugar(int x, int y) {
		
		//valida X
		validarCoordenadaX(x);		
		//valida Y
		validarCoordinadaY(y);		
		//valida qe no hay ya una pieza en x,y
		ponerFicha(x, y);	
	} //fin poner ficha

	private void ponerFicha(int x, int y) {
		if(tablero [x][y] != null) {
			throw new RuntimeException("Ya hay una ficha en esa posción");
		}

		tablero[x][y] = this.jugadorAcutal;
		
		if (this.jugadorAcutal == 'X') {
			this.jugadorAcutal = 'O';
		} else {
			this.jugadorAcutal = 'X';
		}
	}
	
	

	public Character getJugadorAcutal() {
		return jugadorAcutal;
	}	

	private void validarCoordinadaY(int y) {
		if(y < 0 || y >2) {
			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero "
					+ "Coordenada Y mal");
		}
	}

	private void validarCoordenadaX(int x) {
		if(x < 0 || x >2) {
			throw new RuntimeException("la ficha no se puede posicionar fuera del tablero "
					+ "Coordenada X mal");
		}
	}
	
	public Character verFicha(int x, int y) {

		//valida X
		validarCoordenadaX(x);
		
		//valida Y
		validarCoordinadaY(y);
		
		return this.tablero[x][y];
		
	}
	
	

}
