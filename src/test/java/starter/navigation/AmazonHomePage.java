package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AmazonHomePage extends PageObject {
	
	@FindBy(xpath="//*[@id=\"nav-xshop-container\"]")
	WebElementFacade homeNavBar;
	
	@FindBy(css = "#twotabsearchtextbox")
	WebElementFacade homeSearch;
	
	@FindBy(css = "#nav-search-submit-button")
	WebElementFacade homeSearchSubmitButton;
	
	public WebElementFacade getHomeNavBar() {
		return homeNavBar;
	}

	public WebElementFacade getHomeSearch() {
		return homeSearch;
	}

	public WebElementFacade getHomeSearchSubmitButton() {
		return homeSearchSubmitButton;
	}
	
	
}
