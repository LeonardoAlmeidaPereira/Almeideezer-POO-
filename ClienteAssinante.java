import java.util.ArrayList;

public class ClienteAssinante extends Usuario{
	public ClienteAssinante(String nome, String email, String senha, Integer idade) {
		super(nome, email, senha, idade);
	}

	public ArrayList<Playlist> playlists;
	public ArrayList<Artista> artistasFavoritos;
	
	public static ClienteAssinante ler() {
		System.out.println("Insira os dados do cliente: ");
		System.out.println("Insira o nome do Usuario: ");
		String nome = Almeideezer.scan.nextLine();
		System.out.println("Insira o email: ");
		String email = Almeideezer.scan.nextLine();
		System.out.println("Insira o senha: ");
		String senha = Almeideezer.scan.nextLine();
		System.out.println("Insira o idade: ");
		Integer idade = Almeideezer.scan.nextInt();
		ClienteAssinante cA = new ClienteAssinante(nome, email, senha, idade);
		return cA;
	}
	
	public void imprimir() {
		System.out.println("Dados do Usuario");
		System.out.println("Nome: "+getNome());
		System.out.println("Email: "+getEmail());
		System.out.println("Senha: "+getSenha());
		System.out.println("Idade: "+getIdade()+" anos");
		System.out.println("Playlists:"+playlists.size());
		for (Playlist playlist : playlists) {
			playlist.imprimir();
		}
		System.out.println("Artistas Favoritos:"+artistasFavoritos.size());
		for (Artista artista : artistasFavoritos) {
			artista.imprimir();
		}
	}
}