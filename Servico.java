import java.util.Calendar;

public class Servico {
	public String servicoPrestado;
	public String descricao;
	public Calendar data;
	
	public Servico ler() {
		Servico servico = new Servico();
		System.out.println("Digite qual serviço prestado: ");
		servico.servicoPrestado = Almeideezer.scan.nextLine();
		System.out.println("Descreva brevemente o servico: ");
		servico.descricao = Almeideezer.scan.nextLine();
		servico.data = Calendar.getInstance();
		System.out.println("Data/Hora atual: "+servico.data.getTime());
		System.out.println("Ano: "+servico.data.get(Calendar.YEAR));
		System.out.println("Mês: "+servico.data.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+servico.data.get(Calendar.DAY_OF_MONTH));
		return servico;
	}
	
	public void imprimir() {
		System.out.println("Servico: "+servicoPrestado);
		
	}
	
	public String getServicoPrestado() {
		return servicoPrestado;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public Calendar getData() {
		return data;
	}
	
	public void setServicoPrestado(String servicoPrestado) {
		this.servicoPrestado = servicoPrestado;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setData(Calendar data) {
		this.data = data;
	}
}
