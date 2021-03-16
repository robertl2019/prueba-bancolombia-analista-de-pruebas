package co.com.choucair.certificacion.proyectobase.stepdefinitions;


import co.com.choucair.certificacion.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import co.com.choucair.certificacion.proyectobase.tasks.Openup;
 import co.com.choucair.certificacion.proyectobase.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import javafx.beans.value.ObservableDoubleValue;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class choucairAcademyStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than  wants to learn automation at the academy choucair$")
    public void thanWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData>academyChoucairData)  {
        OnStage.theActorCalled("Roberto").wasAbleTo(Openup.thepage(),Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }


    @When("^he search for the course  on the choucair academy plataform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlataform(List<AcademyChoucairData>academyChoucairData) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds th course called $")
    public void heFindsThCourseCalledResoursesRecursosAutomatizacionBancolombia(List<AcademyChoucairData>academyChoucairData)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}



