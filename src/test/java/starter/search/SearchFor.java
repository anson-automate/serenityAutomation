package starter.search;

import net.thucydides.core.annotations.Step;
import starter.navigation.AmazonHomePage;

public class SearchFor  {

	AmazonHomePage homepage;
	
    @Step("Search for term {0}")
    public void term(String term) {
    	if(homepage.getHomeSearch().isCurrentlyVisible()) {
    		homepage.getHomeSearch().clear();
    		homepage.getHomeSearch().sendKeys(term);
    		homepage.getHomeSearchSubmitButton().click();
    	}
    
    	
    }
    

}
