import DriverConfigs.DriverConfiguration;
import Factories.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TheTest extends DriverConfiguration {
    @Test
    public void test() {
        String error = "did not found what was looking for";
        open(link, MainPage.class).searchForString(searchFrase);
        Assertions.assertTrue($(byText(searchFrase)).isDisplayed(), error);
    }
}
