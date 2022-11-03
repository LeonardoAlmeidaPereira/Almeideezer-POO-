import java.util.ArrayList;
import java.util.Collections;

public class Album {
	public String nome;
	public String genero;
	public Artista artista;
	public Integer ano;
	public ArrayList<Musica> musicas;
	
	public Album() {
		
	}
	
	public Album(String nome, String genero, Artista artista, Integer ano, ArrayList<Musica> musicas) {
		this.ano = ano;
		this.artista = artista;
		this.nome = nome;
		this.genero = genero;
		this.musicas = musicas;
	}

	public static Album ler(){
		Album album = new Album();
		System.out.println("Insira o nome do album: ");
		album.nome = Almeideezer.scan.nextLine();
		System.out.println("Insira o genero: ");
		album.genero = Almeideezer.scan.nextLine();
		System.out.println("Insira o ano: ");
		album.ano = Almeideezer.scan.nextInt();
		Almeideezer.scan.nextLine();
		Artista artista = new Artista();
		album.artista = artista;
		System.out.println("Digite o nome do artista: ");
		artista.setNome(Almeideezer.scan.nextLine());
		album.setArtista(artista);
		ArrayList<Musica> musicas = new ArrayList<Musica>();
		album.musicas = musicas;
		String opcao = "";
		do{//tá adicionando album por esse arquivo mas o loop nao funciona
			System.out.println("Deseja adicionar uma nova música? s/n");
			opcao = Almeideezer.scan.nextLine();
			switch (opcao.toLowerCase()) {
				case "s": {
					Musica musica = new Musica();
					musica = Musica.ler();
					album.musicas.add(musica);
					//album.musicas.add(musica); //tá adicionando e printando mais de uma musica
					break;
				}
				default: 
					break;
			}
		}while (!opcao.toLowerCase().equals("s"));
		return album;
	}
	
	public void imprimirMusica() {
		for(Musica musica : musicas) {
			System.out.println(musica.nome);
		}
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Artista getArtista() {
		return artista;
	}
	public String getGenero() {
		return genero;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	public String getNome() {
		return nome;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
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
	
	public void imprimir() {
		System.out.println("Dados do Album");
		System.out.println("Nome: "+nome);
		System.out.println("Genero: "+genero);
		System.out.println("Artista: "+Artista.getNome(artista));
		System.out.println("Músicas: ");
		imprimirMusica();
	}	
	
	public static void main(String[] args) {
		Album a = new Album();
		a = ler();
		a.imprimir();
	}

	public void play() {
		for (Musica musica : musicas) {
			Collections.shuffle(musicas);
			System.out.println("Musica: "+musica.getNome());
			System.out.println("Anuncio");
		}
		
	}
	
	public void playAssinante() {
		for (Musica musica : musicas) {
			System.out.println("Musica: "+musica.getNome());
		}
		
	}
}