package starter.search;

import net.thucydides.core.annotations.Step;
import starter.navigation.AmazonSearchResult;

public class SearchResult {
	AmazonSearchResult searchResultPage;
	
	 @Step("Search result page")
    public String displayed() {
        return searchResultPage.getSearchResultText().getText();
    }
	 @Step("Search result error page")
	public String searchErrorPage() {
		 return searchResultPage.getNoSearchResult().getText();
	  }
}