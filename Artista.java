import java.util.ArrayList;

public class Artista {
	public String nome;
	public String descricao;
	public String genero;
	public  ArrayList<Album> albuns;
	public ArrayList<Musica> musicas;
		
	public Artista ler(){
		Artista artista = new Artista();
		System.out.println("Insira o nome: ");
		artista.nome = Almeideezer.scan.nextLine();
		System.out.println("Insira a descrição: ");
		artista.descricao = Almeideezer.scan.nextLine();
		System.out.println("Insira o genero: ");
		artista.genero = Almeideezer.scan.nextLine();
		Album album = new Album();
		System.out.println("Digite o nome do album: ");
		album.nome = Almeideezer.scan.nextLine();
		artista.albuns = new ArrayList<Album>();
		artista.albuns.add(album);
		Musica musica = new Musica();
		artista.musicas = new ArrayList<Musica>();
		System.out.println("Digite o nome da musica: ");
		musica.nome = Almeideezer.scan.nextLine();
		musicas.add(musica);
		return artista;
	}
	
	public void imprimirMusica() {
		for(Musica musica : musicas) {
			System.out.println(musica.nome);
		}
	}
	
	public ArrayList<Album> getAlbuns() {
		return albuns;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	
	public void setAlbuns(ArrayList<Album> albuns) {
		this.albuns = albuns;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimirAlbum() {
		for(Album album : albuns) {
			System.out.println(album.nome);
		}
	}
	
	public static String getNome(Artista a){
		return a.nome;
	}
	
	public void imprimir() {
		System.out.println("Dados do Artista");
		System.out.println("Nome: "+nome);
		System.out.println("Descricao: "+descricao);
		System.out.println("Genero: "+genero);
		System.out.println("Álbuns: ");
		imprimirAlbum();
		System.out.println("Músicas");
		imprimirMusica();
	}
	
	public static void main(String[] args) {
		Artista a = new Artista();
		a.ler();
		a.imprimir();
	}
}