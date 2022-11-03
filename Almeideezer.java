import java.util.ArrayList;
import java.util.Scanner;

public class Almeideezer {
	public static ArrayList<ClienteGratuito> clientesGratuitos;
	public static ArrayList<ClienteAssinante> clienteAssinantes;
	public static ArrayList<Album> albuns;
	//public ArrayList<ClienteAssinante> clientesAssinantes;
	public Admin admin;
	public static Scanner scan = new Scanner(System.in);
	public String nome;
	public String url;
	
	public Almeideezer(Admin admin, String nome, String url) {
		this.admin = admin;
		this.nome = nome;
		this.url = url;
	}
	
	public static void main(String[] args) {
		Admin admin = new Admin("admin@gmail.com", "Joao", "senha", 30);
		Almeideezer almeideezer = new Almeideezer(admin, "Almeideezer", "https://www.almeideezer.com/");
		ArrayList<ClienteGratuito> clienteGratuitos = new ArrayList<ClienteGratuito>();
		ArrayList<ClienteAssinante> clienteAssinantes = new ArrayList<ClienteAssinante>();
		ArrayList<Album> albuns = new ArrayList<Album>();
		Artista a7x = new Artista();
		ArrayList<Musica> ntmra7x = new ArrayList<Musica>();
		Album a1 = new Album("Nightmare","Heavy metal",a7x,2010, ntmra7x);
		Musica m1 = new Musica("Nightmare",a7x,a1,2010, "Heavy metal");
		Musica m2 = new Musica("Welcome to the Family", a7x, a1, 2010, "Heavy metal");
		Musica m3 = new Musica("Danger Line", a7x, a1, 2010, "Heavy metal");
		Musica m4 = new Musica("Buried Alive", a7x, a1, 2010, "Heavy metal");
		Musica m5 = new Musica("Natural Born Killer", a7x, a1, 2010, "Heavy metal");
		Musica m6 = new Musica("So Far Away", a7x, a1, 2010, "Heavy metal");
		Musica m7 = new Musica("God Hate Us", a7x, a1, 2010, "Heavy metal");
		Musica m8 = new Musica("Victim", a7x, a1, 2010, "Heavy metal");
		Musica m9 = new Musica("Tonight the Words Die", a7x, a1, 2010, "Heavy metal");
		Musica m10 = new Musica("Fiction", a7x, a1, 2010, "Heavy metal");
		Musica m11 = new Musica("Save Me", a7x, a1, 2010, "Heavy metal");
		Musica m12 = new Musica("Lost It All", a7x, a1, 2010, "Heavy metal");
		
		ntmra7x.add(m1);
		ntmra7x.add(m2);
		ntmra7x.add(m3);
		ntmra7x.add(m4);
		ntmra7x.add(m5);
		ntmra7x.add(m6);
		ntmra7x.add(m7);
		ntmra7x.add(m8);
		ntmra7x.add(m9);
		ntmra7x.add(m10);
		ntmra7x.add(m11);
		ntmra7x.add(m12);
		albuns.add(a1);
		Almeideezer.clientesGratuitos = clienteGratuitos;
		Almeideezer.clienteAssinantes = clienteAssinantes;
		Almeideezer.albuns = albuns;
		ClienteAssinante cA = new ClienteAssinante("Mario", "aquelemario@gmail.com", "ngmvaidescobrir", 21);
		ClienteGratuito cG1 = new ClienteGratuito("Maria", "maria@gmail.com", "abc123", 19);
		Almeideezer.clientesGratuitos.add(cG1);
		Almeideezer.clienteAssinantes.add(cA);
		String opcao;
		
		do {
			opcao = Menu.principal();
			switch (opcao.toLowerCase()) {
			case "1": {
				almeideezer.login();
				break;
			}
			case "2": {
				ClienteGratuito cG2 = ClienteGratuito.ler();
				clientesGratuitos.add(cG2);
				System.out.println("Cliente " + cG2.getNome() + " cadastrado com sucesso.");
				if (cG2 instanceof ClienteGratuito) {
					a1.play();
					//a1.playAssinante(); // na integra
				}else{
					a1.playAssinante();
				}
				
				//almeideezer.listaCliente(); // tá adicionando
				
				//como????				
				/*String assinatura = Menu.assinatura();
				if (assinatura.toLowerCase().equals("s")) {
					clienteAssinantes.add(cG2);
					clienteGratuitos.remove(cG2);
				}*/
				break;
			}case "3": {
				almeideezer.logaAdmin();
				do {
					opcao = Menu.Admin();
					switch (opcao.toLowerCase()) {
						case "1": {
							almeideezer.cadastraAlbum();
							//System.out.println("### Cadastro de Álbum ###");
							break;
						}
						case "2": {
							almeideezer.listaCliente();
							break;
						}
						case "s": {
							break;
						}
					}
				}while(!opcao.toLowerCase().equals("s"));
					break;
			}case "s": {
				break;
				}
			default: {
				System.out.println("Valor inválido. Digite uma opção válida.");
				break;
				}
			}
		} while (!opcao.toLowerCase().equals("s"));
		System.out.println("Isso é tudo, pessoal!");
		
	}
	
	private void listaCliente() {
		for (ClienteGratuito clienteGratruito : clientesGratuitos) {
			System.out.println("Nome: "+clienteGratruito.getNome());
			System.out.println("Email: "+clienteGratruito.getEmail());
			System.out.println();
			
		}
	}

	private void cadastraAlbum() {
		Album album = new Album();
		album = Album.ler();
		Almeideezer.albuns.add(album);
		System.out.println("Ok");
		album.imprimir();
	}

	private void login() {
		ClienteGratuito cG = Menu.login(clientesGratuitos);
		if (cG instanceof ClienteGratuito) {
			System.out.println("###Menu do cliente###");
			System.out.println("Cliente " + cG.getNome());
		} else {
			System.out.println("Usuário inválido.");
		}
	}
	
	private void logaAdmin() {
		Admin adm = Menu.logAdmin(admin);
		if (adm instanceof Admin) {
			System.out.println("Olá, "+admin.getNome()+"!");
			System.out.println("###Menu administrativo###");
		} else {
			System.out.println("Usuário inválido.");
		}
	}
	
	/*private void cadastrar(ClienteGratuito cG) {
		clientesGratuitos.add(cG);
	}
	public ArrayList<Album> getAlbuns() {
		return albuns;
	}
	public void setAlbuns(ArrayList<Album> albuns) {
		this.albuns = albuns;
	}*/
	public Admin getAdmin() {
		return admin;
	}
	public String getNome() {
		return nome;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
}