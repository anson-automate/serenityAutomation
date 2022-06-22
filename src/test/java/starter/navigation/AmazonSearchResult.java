package starter.navigation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class AmazonSearchResult extends PageObject {
	
	@FindBy(css = "span.a-color-state.a-text-bold")
	WebElementFacade searchResultText;
	
	@FindBy(xpath="//*[contains(text(),'No results')]")
	WebElementFacade noSearchResult;
	
	
	public WebElementFacade getNoSearchResult() {
		return noSearchResult;
	}

	public WebElementFacade getSearchResultText() {
		return searchResultText;
	}
	
	
}
