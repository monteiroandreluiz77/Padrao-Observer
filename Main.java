package observer;

public class Main {

	public static void main(String[] args) {
		InformacoesSubject dados = new InformacoesSubject();
		dados.adicionar(new ValoresObserver(dados));
		dados.definirEstado(new Informacoes("Solteiro", "Brasileiro"));
		dados.definirEstado(new Informacoes("Casado", "Brasileiro"));
	}

}
