package br.com.sicredi.automation_web.pages.selenium;

import org.openqa.selenium.support.PageFactory;

import br.com.sicredi.automation_web.util.TestRule;

public class WoopHomePage extends WoopHomePageElementMap {

	public WoopHomePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessarLogin() {
		moveToElement(btnLogin);
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
		waitElement(userLogado, 10);
		moveToElement(userLogado);
		if (userLogado.isDisplayed()) {
			logPrint("Login efetuado corretamente");
		}
	}

	public void validaLoginComDadosInvalidos() {
		waitElement(dadosIncorretos, 10);
		moveToElement(dadosIncorretos);
		if (dadosIncorretos.isDisplayed()) {
			logPrint("Login não efetuado. Dados Incorretos");
		}
	}

}