package br.com.sicredi.automation_web.pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.sicredi.automation_web.pages.BasePage;

public class WoopHomePageElementMap extends BasePage {

	@FindBy(id = "landingComponentLoginButton")
	protected WebElement btnLogin;

	@FindBy(id = "loginFormInputUser")
	protected WebElement user;

	@FindBy(id = "loginFormInputPassword")
	protected WebElement password;

	@FindBy(id = "loginComponentLoginEmailSenha")
	protected WebElement btnEntrar;

	@FindBy(id = "userMenu")
	protected WebElement userLogado;

	@FindBy(xpath = "//*[@class=\"show-error-component pull-left\"]")
	protected WebElement dadosIncorretos;

	@FindBy(className = "logout")
	protected WebElement sair;

	@FindBy(linkText = "Esqueci minha senha")
	protected WebElement esqueciMinhaSenha;

	@FindBy(id = "loginComponentLoginEmailSenha")
	protected WebElement enviarRecuperacaoDeSenha;

	@FindBy(xpath = "//*[@class=\"alert alert-info text-center ng-star-inserted\"]")
	protected WebElement infoRecuperacaoDeSenha;

}