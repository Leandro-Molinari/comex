package comex;

public class Cliente {
	
	private static int id  = 1;
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
		
		id = id++;
		
		
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
