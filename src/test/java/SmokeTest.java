import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.FormPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SmokeTest extends TestBase {

    private static final Logger log = LoggerFactory.getLogger("SmokeTest.class");

    @Test
    public void shouldMatchPageTitle() {

        FormPage formPage = new FormPage(driver);

        String pageTitle = formPage.getPageTitle();

        assertThat("Wrong page", pageTitle, equalTo(System.getProperty("pageTitle")));

        log.info("Smoke test passed");
    }
}
