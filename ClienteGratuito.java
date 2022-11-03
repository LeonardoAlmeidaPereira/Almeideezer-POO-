public class ClienteGratuito extends Usuario{
	public ClienteGratuito(String nome, String email, String senha, Integer idade) {
		super(nome, email, senha, idade);
	}

	public static ClienteGratuito ler() {
		System.out.println("Insira o nome do Usuario: ");
		String nome = Almeideezer.scan.nextLine();
		System.out.println("Insira o email: ");
		String email = Almeideezer.scan.nextLine();
		System.out.println("Insira o senha: ");
		String senha = Almeideezer.scan.nextLine();
		System.out.println("Insira o idade: ");
		Integer idade = Almeideezer.scan.nextInt();
		ClienteGratuito cG = new ClienteGratuito(nome, email, senha, idade);
		return cG;
	}
	
	public void imprimir() {
		System.out.println("Dados do Usuario");
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Senha: "+getSenha());
		System.out.println("Idade: "+getIdade()+" anos");
	}
}