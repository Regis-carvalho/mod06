package projeto.cucumber.video.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.video.config.InicializarTest;
import projeto.cucumber.video.pages.HomePage;

public class ConsultaCepTeste {

	HomePage home = new HomePage();

	@Before
	public void iniciarTeste() {
		InicializarTest.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {
		InicializarTest.encerrarTeste();

	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		home.buscarCepEndereco("06462-130");
		
	}

	@Then("validar os dados retornado")
	public void iValidarOsDadosRetornado() {
		home.validarDadoRetornados("Rua Martim Afonso de Souza", "Parque Imperial", "Barueri/SP", "06462-130");

	}

}
