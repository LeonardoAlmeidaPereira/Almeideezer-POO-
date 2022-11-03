import java.util.ArrayList;

public class Playlist {
	public String nome;
	public String descricao;
	public ArrayList<Musica> musicas;
	
	public Playlist ler() {
		Playlist playlist = new Playlist();
		System.out.println("Digite o nome: ");
		playlist.nome = Almeideezer.scan.nextLine();
		System.out.println("Digite a descrição da playlist: ");
		playlist.descricao = Almeideezer.scan.nextLine();
		Musica musica = new Musica();
		playlist.musicas = new ArrayList<>();
		System.out.println("Digite o nome da musica: ");
		musica.nome = Almeideezer.scan.nextLine();
		musicas.add(musica);
		return playlist;
	}
	
	public void imprimirMusica() {
		for(Musica musica : musicas) {
			System.out.println(musica.nome);
		}
	}
	
	public void imprimir() {
		System.out.println("Dados do Usuario");
		System.out.println("Nome: "+nome);
		System.out.println("Descriçao: "+descricao);
		imprimirMusica();
	}
	public static void main(String[] args) {
		Playlist p = new Playlist();
		p.ler();
		p.imprimir();
	}
}