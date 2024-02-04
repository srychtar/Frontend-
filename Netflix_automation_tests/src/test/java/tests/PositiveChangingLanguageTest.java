package tests;
import org.testng.annotations.Test;
import page.objects.Home_Page;

public class PositiveChangingLanguageTest extends TestBase {

    @Test
    public void ChoosingPL(){

        Home_Page homePage= new Home_Page();
        homePage.CloseCookieAlert();
        homePage.ChoosingLanguage("pl-PL","Polski" );

    }

}
