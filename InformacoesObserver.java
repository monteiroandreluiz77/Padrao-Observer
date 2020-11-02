package observer;

public abstract class InformacoesObserver {
	protected InformacoesSubject dados;
	
	public InformacoesObserver(InformacoesSubject dados) {
		this.dados = dados;
	}
	
	public abstract void atualizar();
}
