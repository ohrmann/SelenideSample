package Factories;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    SelenideElement searchBtn = $(byAttribute("name", "btnK"));
    SelenideElement searchInput = $(byAttribute("name", "q"));
    SelenideElement searchResults = $(byId("search"));
    public void searchForString(String value) {
        searchInput.shouldBe(Condition.visible).sendKeys(value);
        searchBtn.shouldBe(Condition.visible).click();
        searchResults.shouldBe(Condition.visible);
    }
}
