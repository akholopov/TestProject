import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class testPtoject {
    @Test
    public void googleTest() {
        open("http://google.com");
        $(By.cssSelector("input.gsfi"))
                .setValue("williamhill")
                .pressEnter();
        Assertions.assertThat($(By.cssSelector("span._Xbe._ZWk.kno-fv"))
                .getText())
                .isEqualTo("00 800 3551 3551");
        
    }
}
