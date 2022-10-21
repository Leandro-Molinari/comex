package br.com.comex.modelo;



public class Cliente {
	

	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private SiglaEstado uf;
	
	public enum SiglaEstado {
		
		AC, AL, AP, AM, BA, CE, DF, 	ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, 
		PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO; 		
	} 
	
	
	
	public Cliente() {
	}

	public Cliente (int id) {
		this.id = id; 
	}
			
	// Id
	public Cliente (String nome, String cpf, String telefone, String rua, String numero, String complemento,
			 String bairro, String cidade, SiglaEstado uf) {
					
				if (nome.length() <= 5) {
					new ComexException("Nome deve ter mais que 5 letras");
				}
				
				if (cpf.length() < 11 || cpf.length() > 14) {
					new ComexException("CPF inválido, deve ter entre 11 e 14 números");
				}
				
				if(telefone != null) {
					if(telefone.length() < 11 || telefone.length() > 16) {
						new ComexException("Telefone inválido, deve ter entre 11 e 16 caracteres");
					}
					} 
				
				if(rua.length() <= 5) {
					throw new ComexException("Nome da rua inválido, deve ter mais de 5 caracteres");
				}
				
				if(numero.length() <= 1) {
					throw new ComexException("Informar número correto (Minimo 2 números ou S/N");
				}
				
				if(bairro.length() <= 1) {
					throw new ComexException("Informar nome do bairro corretetamente");
				}
				
				if(cidade.length() <= 1) {
					throw new ComexException("Nome da Cidade bairro corretetamente");
				}
				
				if (uf == null) {
					throw new ComexException("Favor informar sigla do Estado");
				}
				
				this.nome = nome;
				this.cpf = cpf;
				this.telefone = telefone;
				this.rua = rua;
				this.numero = numero;
				this.complemento = complemento;
				this.bairro = bairro;
				this.cidade = cidade;
				this.uf = uf;
		
			}
	
		
	//todos
	public Cliente (int id, String nome, String cpf, String telefone, String rua, String numero, String complemento,
	 String bairro, String cidade, SiglaEstado uf) {
		
		if (nome == null || cpf == null || rua == null || numero == null || bairro == null || 
				cidade == null || uf == null) {
			
			throw new ComexException("Dados Incompletos");
		}
		

		if (nome.length() <= 5) {
			new ComexException("Nome deve ter mais que 5 letras");
		}
		
		if (cpf.length() < 11 || cpf.length() > 14) {
			new ComexException("CPF inválido, deve ter entre 11 e 14 números");
		}
		
		if(telefone != null) {
		if(telefone.length() < 11 || telefone.length() > 16) {
			new ComexException("Telefone inválido, deve ter entre 11 e 16 caracteres");
		}
		} 
		
		if(rua.length() <= 5) {
			throw new ComexException("Nome da rua inválido, deve ter mais de 5 caracteres");
		}
		
		if(numero.length() <= 1) {
			throw new ComexException("Informar número correto (Minimo 2 números ou S/N");
		}
		
		if(bairro.length() <= 1) {
			throw new ComexException("Informar nome do bairro corretetamente");
		}
		
		if(cidade.length() <= 1) {
			throw new ComexException("Nome da Cidade bairro corretetamente");
		}
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		
	}
	
	public void validaestado(SiglaEstado uf) {
			if (uf == null) {
			throw new ComexException("Favor informar sigla do Estado");
		}
			
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public SiglaEstado getUf() {
		return uf;
	}

	public void setUf(SiglaEstado uf) {
		this.uf = uf;
	}


	@Override
	public String toString() {
		return "Cliente [01 id= " + id + ", 01 - nome = " + nome + ", 02 - cpf = " + cpf + ", 03 - telefone=" + telefone + ", rua=" + rua
				+ ", numero=" + numero + ", complemento=" + complemento + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + "]" + System.lineSeparator();
	}
	
}