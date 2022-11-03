import java.util.ArrayList;

public class Admin extends Usuario{
	
	public Admin (String email, String nome, String senha, Integer idade) {
		super(email, nome, senha, idade);
	}
	
	/*public void cadastrarCliente() {
		Usuario cliente = Usuario.ler();
		getAlmeideezer().cadastrar(cliente);
	}*/
	
	
	public Double getSalario() {
		return salario;
	}
	
	public ArrayList<Servico> getServicos() {
		return servicos;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setServicos(ArrayList<Servico> servicos) {
		this.servicos = servicos;
	}
	
	public Double salario;
	public ArrayList <Servico> servicos;
}