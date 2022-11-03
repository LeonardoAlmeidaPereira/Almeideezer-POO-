public class Usuario {
	public String nome;
	public String email;
	public String senha;
	public Integer idade;
	private Almeideezer almeideezer;
	
	public Usuario (String nome, String email, String senha, Integer idade){
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senhaAtual, String senhaNova) {
		if (this.senha.equals(senhaAtual)) {
			this.senha = senhaAtual;
		}
	}

	public Almeideezer getAlmeideezer() {
		return almeideezer;
	}

	public void setAlmeideezer(Almeideezer almeideezer) {
		this.almeideezer = almeideezer;
	}
	
/*	public static Usuario ler() {
		Usuario usuario = new Usuario();
		System.out.println("Insira o nome do Usuario: ");
		usuario.nome = Almeideezer.scan.nextLine();
		System.out.println("Insira o email: ");
		usuario.email = Almeideezer.scan.nextLine();
		System.out.println("Insira o senha: ");
		usuario.senha = Almeideezer.scan.nextLine();
		System.out.println("Insira o idade: ");
		usuario.idade = Almeideezer.scan.nextInt();
		return usuario;
	}
	
	public void imprimir() {
		System.out.println("Dados do Usuario");
		System.out.println("Nome: "+nome);
		System.out.println("Email: "+email);
		System.out.println("Senha: "+senha);
		System.out.println("Idade: "+idade+" anos");
	}*/
}