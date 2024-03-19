package projeto.cucumber.video.pages;

import projeto.cucumber.video.elemento.Elementos;
import projeto.cucumber.video.metodo.Metodos;

public class HomePage {

	Metodos metodo = new Metodos();

	public void buscarCepEndereco(String dado) {
		metodo.escrever(Elementos.buscarCepEndereco, dado);

	}

	public void validarDadoRetornados(String logradouro, String bairro, String localidade, String cep) {
		metodo.mudarAba();
		metodo.validarTexto(Elementos.Logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_UF, localidade);
		metodo.validarTexto(Elementos.Cep, cep);

	}
}
 