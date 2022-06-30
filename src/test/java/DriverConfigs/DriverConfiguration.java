package DriverConfigs;

import Interfaces.ProjectConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.clearBrowserLocalStorage;

public abstract class DriverConfiguration {
    protected static String searchFrase, link;
    private static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);

    @BeforeAll
    public static void configure() {
        //получаем что-то из конфига, чтоб пользоваться дальше
        link = config.mainLink();
        searchFrase = config.searchFrase();

        //Configure driver settings
        Configuration.browser = config.browser();
        Configuration.pageLoadTimeout = Long.parseLong(config.pageLoadTimeout());
        Configuration.timeout = Long.parseLong(config.timeout());
        Configuration.headless = true;
        Configuration.browserSize = config.resolution();
    }

    @AfterEach
    public void afterEach() {
        try {
            clearBrowserLocalStorage();
        } catch (IllegalStateException ex) {}
    }
}
