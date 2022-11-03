public class Musica {
	public String nome;
	public Artista artista;
	public Album album;
	public Integer ano;
	public String genero;
	
	public Musica() {
		
	}
	
	public Musica(String nome, Artista artista, Album album, Integer ano, String genero) {
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		this.ano = ano;
		this.genero = genero;
	}

	public static Musica ler(){
		Musica musica = new Musica();
		System.out.println("Insira o nome da música: ");
		musica.nome = Almeideezer.scan.nextLine();
		//musica.artista = Album.ler().getArtista();
		//musica.ano = Album.ler().getAno();
		//musica.genero = Album.ler().getGenero();
		return musica;
	}
	
	public void imprimir() {
		System.out.println("Dados da musica");
		System.out.println("Nome: "+nome);
		System.out.println("Artista: "+Artista.getNome(artista));
		System.out.println("Album: "+album);
		System.out.println("Ano: "+ano);
		System.out.println("Genero: "+genero);
	}	
	
	public Album getAlbum() {
		return album;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public Artista getArtista() {
		return artista;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void main(String[] args) {
		Musica m = new Musica();
		m = ler();
		m.imprimir();
	}
}