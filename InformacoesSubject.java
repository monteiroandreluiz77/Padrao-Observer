package observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InformacoesSubject {

	protected ArrayList<InformacoesObserver> obs;
	protected Informacoes dados;
	
	public InformacoesSubject() {
		obs = new ArrayList<InformacoesObserver>();
	}
	public void adicionar(InformacoesObserver observer) {
		obs.add(observer);
	}

	public void retirar(int indice) {
		obs.remove(indice);
	}
	
	private void notificar() {
		for (InformacoesObserver observer : obs) {
			observer.atualizar();		}
	}

	public void definirEstado(Informacoes dados) {
		this.dados = dados;
		notificar();
	}

	public Informacoes pegarEstado() {
		return dados;
	}
}
