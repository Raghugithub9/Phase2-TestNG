package TestNG3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	
	@DataProvider (name = "TestData")
    public Object[][] TestData(){
	 return new Object[][] {{"Mobile"}, {"Laptop"}, {"Desktop"}};
    }
	
	
	
   @Test (dataProvider = "TestData")
   public void Testwithdata (String val) {
       System.out.println("Passed Parameter Is : " + val);
       
      Reporter.log("DataProvider example worked", true);


       String expectedTitle = val;
       String originalTitle = "Laptop";
       Assert.assertEquals(originalTitle, expectedTitle);

       
       
   }
   
	
}
