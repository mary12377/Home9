import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiPageTest {

    @Test
    void successTest() {
        // открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // перейти в  Wiki
        $("#wiki-tab").click();
        //  в списке страниц Pages есть страница SoftAssertions
        $("button.f6").click();
        // открыть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));

    }
}

