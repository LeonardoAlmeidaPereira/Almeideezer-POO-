import java.util.ArrayList;

public class Menu {

	public static String principal() {
		System.out.println("Escolha uma opção do menu inicial");
		System.out.println("1) Login");
		System.out.println("2) Se cadastrar como cliente");
		System.out.println("3) Acesso administrativo");
		System.out.println("S) Sair");
		String opcao = Almeideezer.scan.nextLine(); 
		return opcao;
	}
	
	public static ClienteGratuito login(ArrayList<ClienteGratuito> usuarios) {
		System.out.println("Informe seus dados de usuário já cadastrado");
		System.out.print("Email:");
		String email = Almeideezer.scan.nextLine();
		System.out.print("Senha:");		
		String senha = Almeideezer.scan.nextLine();
		for (ClienteGratuito clienteGratuito : usuarios) {
			if (clienteGratuito.getEmail().equals(email) &&
					clienteGratuito.getSenha().equals(senha)) {
				return clienteGratuito;
			}
		}
		return null;
	}
	
	public static Admin logAdmin(Admin admin) {
		System.out.println("Informe seus dados de usuário já cadastrado");
		System.out.print("Email:");
		String email = Almeideezer.scan.nextLine();
		System.out.print("Senha:");		
		String senha = Almeideezer.scan.nextLine();		
		if (admin.getEmail().equals(email) &&
				admin.getSenha().equals(senha)) {
			return admin;
		}
		return null;
	}
	
	public static String Admin() {
		System.out.println("Bem vindo administrador");
		System.out.println("Escolha uma opção do menu");
		System.out.println("1) Cadastrar um novo album");
		System.out.println("2) Listar clientes");
		System.out.println("s) Sair");
		String opcao = Almeideezer.scan.nextLine();
		return opcao;
	}

	public static String assinatura() {
			String r;
			System.out.println("Deseja assinar o plano mensal e virar premium? s/n");
			r = Almeideezer.scan.next();
			if (r.toLowerCase().equals("s")){
				return r;
			}
		return null;
	}
}
