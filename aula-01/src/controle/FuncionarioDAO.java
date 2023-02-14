package controle;

import java.util.ArrayList;

import modelo.Funcionario;

public class FuncionarioDAO {


		private static ArrayList<Funcionario> listaFuncionario;
		
		public static FuncionarioDAO getInstancia() {
			return null;
		}
		
		public FuncionarioDAO() {
			listaFuncionario = new ArrayList<>();
		}
		
		public boolean inserir(Funcionario func) {
			listaFuncionario.add(func);
			return false;
		}
		
		public ArrayList<Funcionario> listar(){
			return listaFuncionario;
		}
	}

