package dataproviders;

import org.testng.annotations.DataProvider;

public class BrowserDataProvider {

    @DataProvider(name="browsers")
    public Object[][] browsers(){

        return new Object[][]{
                {"chrome"}

        };
    }
}