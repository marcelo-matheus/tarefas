package test;


import static org.junit.Assert.assertEquals;
import banco.de.dados.Model.Cadastro;


import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Service.CadastroService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CadastroTest {
	Cadastro cadastro, copia;
	CadastroService cadastroService;
	static int id = 0;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se também que sobrecarregou o equals na classe
	 * Cliente. 
	 * Certifique-se que a fixture cliente1 foi criada no banco.
	 * Além disso, a ordem de execução dos testes é importante; por
	 * isso a anotação FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		cadastro = new Cadastro();
		cadastro.setId(id);
		cadastro.setNome_Completo("ricardor");
		cadastro.setTelefone_Residencial("(11) 91234-4321");
		cadastro.setEmail("(11) 91234-4321");
		copia = new Cadastro();
		copia.setId(id);
		copia.setNome_Completo("ricardo");
		copia.setTelefone_Residencial("(11) 91234-4321");
		copia.setEmail("(11) 91234-4321");
		cadastroService = new CadastroService();
		System.out.println(cadastro);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		//para funcionar o cliente 1 deve ter sido carregado no banco por fora
		Cadastro fixture = new Cadastro();
		fixture.setId(1);
		fixture.setNome_Completo("jose");
		fixture.setTelefone_Residencial("(11) 91234-4321");
		fixture.setEmail("cda@usjt.br");
		CadastroService novoService = new CadastroService();
		Cadastro novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	
	
	
	@Test
	public void test01Criar() {
		System.out.println("criar");
		id = cadastroService.criar(cadastro);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", cadastro, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		cadastro.setTelefone_Residencial("999999");
		copia.setTelefone_Residencial("999999");		
		cadastroService.atualizar(cadastro);
		cadastro = cadastroService.carregar(cadastro.getId());
		assertEquals("testa atualizacao", cadastro, copia);
	}
/*
	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setFone(null);
		copia.setEmail(null);
		clienteService.excluir(id);
		cliente = clienteService.carregar(id);
		assertEquals("testa exclusao", cliente, copia);
	}*/
}