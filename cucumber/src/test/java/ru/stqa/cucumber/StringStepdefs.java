package ru.stqa.cucumber;

import io.cucumber.java8.En;
import org.junit.Assert;
import ru.stqa.app.Application;
import ru.stqa.tests.TestBase;

public class StringStepdefs implements En {
    private static Application app = new Application();
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            app.quit();
            app = null;
        }));
    }
    private String result;

    public StringStepdefs() {
        When("^we go to the shop$", () -> {
            app.openNewToy();
        });
        And("^add toys to the cart$", () -> {
            app.addNewToy();
        });
        Then("^we can remove toys from the cart$", () -> {
            app.goToCrate();
            app.delToyInCrate();
        });
    }
}
