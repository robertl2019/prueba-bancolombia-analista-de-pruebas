package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login ") .
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("field where the user name is entered").located(By.id("username"));
   public static final Target INPUT_PASSWORD = Target.the("field where the user password is entered").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button that confirms login ") .located(By.xpath("//Button[contains(@class,'btn btn-primary')]"));
}
