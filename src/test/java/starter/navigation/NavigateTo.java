package starter.navigation;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

public class NavigateTo {

    AmazonHomePage homePage;

    @Step("Open the Wikipedia home page")
    public void theHomePage() {
        homePage.open();
        Serenity.recordReportData().withTitle("Tile bar present?").andContents(String.valueOf(homePage.getHomeNavBar().isCurrentlyVisible()));
    }
}