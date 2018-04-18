package br.com.sicredi.automation_web.pages.selenium;

import org.openqa.selenium.support.PageFactory;

import br.com.sicredi.automation_web.util.TestRule;

public class WoopHomePage extends WoopHomePageElementMap {

	public WoopHomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarLogin() {
		btnLogin.click();
		logPrint("Acessou a tela de Login");
	}

	public void efetuaLoginComDadosValidos() {
		user.sendKeys("himeneutst1@mailinator.com");
		password.sendKeys("Minhasenha123");
		logPrint("E-mail e Senha preenchidos com dados válidos");
		btnEntrar.click();
	}

	public void efetuaLoginComDadosInvalidos() {
		user.sendKeys("abcde@email.com");
		password.sendKeys("Minhasenha123");
		logPrint("E-mail e Senha preenchidos com dados inválidos");
		btnEntrar.click();
	}

	public void validaLoginComDadosValidos() {
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		waitElement(userLogado, 5);
		userLogado.isDisplayed();
		logPrint("Login efetuado corretamente");
	}

	public void validaLoginComDadosInvalidos() {
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		waitElement(dadosIncorretos, 5);
		dadosIncorretos.isDisplayed();
		logPrint("Login não efetuado. Dados Incorretos");

	}

	public void realizaLogout() {
		waitElement(userLogado, 5);
		// moveToElement(dadosIncorretos);
		userLogado.click();
		logPrint("Clicou no Menu do Usuário");
		sair.click();
		logPrint("Clicou no botão 'Sair'. Logout efetuado corretamente");
	}

	public void esqueciMinhaSenha() {
		esqueciMinhaSenha.click();
		logPrint("Clicou no link 'Esqueci minha senha'");
	}
	
	public void preencherEmailDeRecuperacao() {
		user.sendKeys("ohpaiii@mailinator.com");
		logPrint("E-mail preenchido corretamente");
	}
	
	public void enviarRecuperacaoDeSenha() {
		enviarRecuperacaoDeSenha.click();
		logPrint("Clicou em 'Enviar'");
	}
	
	public void infoRecuperacaoDeSenha() {
		waitElement(infoRecuperacaoDeSenha, 3);
		logPrint("Email de recuperação de senha enviado com sucesso");
	}
}