package com.mikkimesser.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.mikkimesser.configuration.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;

public class SimpleWebTests extends TestBase{
    @Test
    @Tag("webTest")
    @DisplayName("Проверка ссылки News на странице redrift.com")
    public void checkRedRiftNewsLink()
    {
        Selenide.open("/");
        $(byLinkText("news")).click();
        $(".page-inner__title").shouldHave(Condition.text("Blog & News"));
    }
}
