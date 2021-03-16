package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage{
    public static final Target BUTTON_UC = Target.the("select choucair university ") .
            located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("search the course ") .
            located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("click here to search for the course") .
            located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("select choucair university course ") .
            located(By.xpath("//h4[contains(text(),'Recursos Automatización Bancolombia')]"));
    public static final Target NAME_COURSE= Target.the("extract choucair university course").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
}



