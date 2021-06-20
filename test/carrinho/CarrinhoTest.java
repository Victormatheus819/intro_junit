package carrinho;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import produto.Produto;
import produto.ProdutoNaoEncontradoException;

@DisplayName("Classe para teste do carrinho")
public class CarrinhoTest {

	Carrinho cart;
	
	
	@BeforeEach
	public void inicializa () {
		
		cart= new Carrinho();
		
	}
	
	@Test
	public void addItemCarrinho () {
		Produto mouse= new Produto("logitechg203",150);
		cart.addItem(mouse);
		Assertions.assertEquals(1,cart.getQtdeItems());
	}
	
	@Test
	public void ValorTotalCarrinho () {
		Produto teclado= new Produto(" logitech 520",350);
		Produto mouse= new Produto("logitechg203",150);
		cart.addItem(mouse);
		cart.addItem(teclado);
		Assertions.assertEquals(500,cart.getValorTotal());
	}
	
	@Test
	public void removeItemCarrinho () throws ProdutoNaoEncontradoException {
		Produto mouse= new Produto("logitechg203",150);
		cart.addItem(mouse);
		cart.removeItem(mouse);
		Assertions.assertEquals(0,cart.getQtdeItems());
	}
	
	@Test
	public void esvaziarCarrinho ()  {
		Produto mouse= new Produto("logitechg203",150);
		Produto teclado= new Produto(" logitech 520",350);
		cart.addItem(mouse);
		cart.esvazia();
		Assertions.assertEquals(0,cart.getQtdeItems());
	}
}
