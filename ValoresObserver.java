package observer;

public class ValoresObserver extends InformacoesObserver {
	
	public ValoresObserver(InformacoesSubject dados) {
		super(dados);
	}
	@Override
	public void atualizar() {
		System.out.println("Dados: \n --> "+ dados.pegarEstado().campo1 + "\n --> " + dados.pegarEstado().campo2);
		
	}

	
}
