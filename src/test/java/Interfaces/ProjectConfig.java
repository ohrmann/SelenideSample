package Interfaces;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface ProjectConfig extends Config {

    @Key("searchFrase")
    String searchFrase();

    @Key("link")
    String mainLink();

    @Key("resolution")
    String resolution();

    @Key("browser")
    String browser();

    @Key("pageLoadTimeout")
    String pageLoadTimeout();

    @Key("timeout")
    String timeout();

}
