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
	private String estado;
	
	public Cliente (int id, String nome, String cpf, String telefone, String rua, String numero, String complemento,
	 String bairro, String cidade, String estado) {
		
		if (id != contador) {
			throw new IllegalArgumentException("Id inválido, o próximo Id disponível é: " + contador);
		}
		
		if (nome.length() <= 5) {
			new IllegalArgumentException("Nome deve ter mais que 5 letras");
		}
		
		if (cpf.length() < 11 || cpf.length() > 14) {
			new IllegalArgumentException("CPF inválido, deve ter entre 11 e 14 números");
		}
		
		if(telefone.length() < 11 || telefone.length() > 16) {
			new IllegalArgumentException("Telefone inválido, deve ter entre 11 e 16 caracteres");
		}
		
		if(rua.length() <= 5) {
			throw new IllegalArgumentException("Nome da rua inválido, deve ter mais de 5 caracteres");
		}
		
		if(numero.length() <= 1) {
			throw new IllegalArgumentException("Informar número correto (Minimo 2 números ou S/N");
		}
		
		if(bairro.length() <= 1) {
			throw new IllegalArgumentException("Informar nome do bairro corretetamente");
		}
		
		if(cidade.length() <= 1) {
			throw new IllegalArgumentException("Nome da Cidade bairro corretetamente");
		}
		
		
		
	}
	
	
	public static int getId() {
		return id++;
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
	public String getEstado() {
		return estado;
	}
	
	
	
	
}
