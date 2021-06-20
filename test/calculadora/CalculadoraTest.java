package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
//*********Testes feitos  pelo Aluno Victor Matheus Pereira de Azevedo*********//
	@DisplayName("Teste  de multiplicação de dois numeros positivos")
	@Test
	public void tesMultiPos() {
		 int mul= calc.multiplicacao(5, 6);
		 Assertions.assertEquals(30, mul);		 
				 
	}
	
	@DisplayName("Teste  de multiplicação de dois numeros negativos")
	@Test
	public void tesMultiNeg() {
		 int mul= calc.multiplicacao(-5, -6);
		 Assertions.assertEquals(30, mul);		 
				 
	}
	
	@DisplayName("Teste  de multiplicação de um numero negativo eum positivo")
	@Test
	public void tesMultiPosNeg() {
		 int mul= calc.multiplicacao(5, -6);
		 Assertions.assertEquals(-30, mul);		 
				 
	}
	
	@DisplayName("Teste para saber se um numero é negativo")
	@Test
	public void testNumNeg() {
		 boolean bol= calc.ehPositivo(-9);
		 Assertions.assertEquals(false, bol);		 
				 
	}
	
	@DisplayName("Teste para saber se um numero é positivo")
	@Test
	public void testNumPos() {
		 boolean bol= calc.ehPositivo(9);
		 Assertions.assertEquals(true, bol);		 
				 
	}
	
	@DisplayName("Teste da função de somatorio")
	@Test
	public void testSoma() {
		 int somat = calc.somatoria(9);
		 Assertions.assertEquals(45, somat );		 
				 
	}
	
	@DisplayName("Teste compara se a=b ")
	@Test
	public void testEqual() {
		 int comp = calc.compara(8, 8);
		 Assertions.assertEquals(0, comp );		 
				 
	}
	
	@DisplayName("Teste compara se a>b ")
	@Test
	public void testGreater() {
		 int comp = calc.compara(8,5);
		 Assertions.assertEquals(1, comp );		 
				 
	}
	
	@DisplayName("Teste compara se a<b ")
	@Test
	public void testMinor() {
		 int comp = calc.compara(4,5);
		 Assertions.assertEquals(-1, comp );		 
				 
	}
	
	
}
