package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddConta {
    private WebDriver navegar;

    public AddConta(WebDriver navegar) {
        this.navegar = navegar;
    }
    public AddConta escreverConta(String contaTeste){
        navegar.findElement(By.id("nome")).sendKeys(contaTeste);

        return this;
    }

    public ContaSalva clicarBotaoSalvar(){
        navegar.findElement(By.className("btn-primary")).click();

        return new ContaSalva(navegar);
    }
}