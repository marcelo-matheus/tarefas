package Service;
import banco.de.dados.Model.Cadastro;

import banco.de.dados.DAO.CadastroDAO;
import banco.de.dados.DAO.RegistroDAO;

public class CadastroService {
	
	
	CadastroDAO dao = new CadastroDAO();
	RegistroDAO daoR = new RegistroDAO();
	/*
	public int criar(Cadastro ca) {
		return dao.InserirCadastro(ca);
	}
	*/
	
	public int criar(Cadastro cadastro) {
		return dao.criar(cadastro);
	}
	 public boolean CheckUsuario(String Usuario){
			return dao.CheckUsuario(Usuario);
		}
		
		
		
		public boolean CheckEmail(String Email)  {
			return dao.CheckEmail(Email);
		}
		
		
		
		public void atualizar(Cadastro cadastro){
			dao.atualizar(cadastro);
		}
		
		
		
		public Cadastro carregar(int id){
			return dao.carregar(id);
		}

}
