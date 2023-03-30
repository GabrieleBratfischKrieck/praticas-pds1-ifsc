package quest3;

import java.util.Date;

public abstract class  Pessoa {

	String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	Date DataNasc;
	Long cpf; 
	
	
}
