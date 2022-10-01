package br.com.comex.modelo;



public class Cliente {
	
	private static int contador  = 1;
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private siglaEstado estado;
	public enum siglaEstado {
		
		AC, AL, AP, AM, BA, CE, DF, 	ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, 
		PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO; 		
	} 
	
	
	// Id
	public Cliente (String nome, String cpf, String telefone, String rua, String numero, String complemento,
			 String bairro, String cidade, siglaEstado estado) {
				
				if (estado == null) {
					throw new ComexException("Favor informar sigla do Estado");
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
				
				this.id = contador;
				this.nome = nome;
				this.cpf = cpf;
				this.telefone = telefone;
				this.rua = rua;
				this.numero = numero;
				this.complemento = complemento;
				this.bairro = bairro;
				this.cidade = cidade;
				this.estado = estado;
				contador ++;
			}
		
	
	//todos
	public Cliente (int id, String nome, String cpf, String telefone, String rua, String numero, String complemento,
	 String bairro, String cidade, siglaEstado estado) {
		
		if (nome == null || cpf == null || rua == null || numero == null || bairro == null || 
				cidade == null || estado == null) {
			
			throw new ComexException("Dados Incompletos");
		}
		
		if (id != contador) {
			throw new ComexException("Id inválido, o próximo Id disponível é: " + contador);
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
		//validaestado(estado);
		this.estado = estado;
		contador ++;
	
	
	
	
	}
	
	
	public void validaestado(siglaEstado estado) {
		
		if (estado == null) {
			throw new ComexException("Favor informar sigla do Estado");
		}
			
	}
	
	


	
	
	
	

		
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public siglaEstado getEstado() {
		return estado;
	}
	
	
	
	
}
