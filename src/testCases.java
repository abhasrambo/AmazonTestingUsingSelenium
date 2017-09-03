import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



	public class testCases extends reusable{
		public String repoPath = "/Users/abhaskumar/Desktop/amazonelements.xls";
		public void search() throws InterruptedException
		{
			try{
				startReport("Search", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				//firefox();
				setValue(1);
				By search = getBy(locatorType, value);
				WebElement searching = driver.findElement(search);
				enterText(searching, "iphone6", obj_Name);
				
				setValue(2);
				By clickSearching = getBy(locatorType, value);
				WebElement clicking = driver.findElement(clickSearching);
				clickElement(clicking, obj_Name);
				
				setValue(3);
				By searchResults = getBy(locatorType, value);
				WebElement clickSearchResult = driver.findElement(searchResults);
				clickElement(clickSearchResult, obj_Name);
				
				setValue(4);
				By addtoCart = getBy(locatorType, value);
				WebElement addingtoCart = driver.findElement(addtoCart);
				clickElement(addingtoCart, obj_Name);
				driver.close();
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void departments() throws InterruptedException
		{
			try{
				startReport("departments", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				setValue(5);
				By depart = getBy(locatorType, value);
				WebElement departmentHover = driver.findElement(depart);
				Actions action = new Actions(driver);
				action.moveToElement(departmentHover).build().perform();
				Update_Report("pass", objName, "Test Case was passed succesfully");
				Thread.sleep(1500);
				
				setValue(6);
				By bookandAudio = getBy(locatorType, value);
				WebElement booksAndAudioHover = driver.findElement(bookandAudio);
				action.moveToElement(booksAndAudioHover).build().perform();
				Update_Report("pass", objName, "Test Case was passed succesfully");
				Thread.sleep(1500);
				
				setValue(7);
				By headPhones = getBy(locatorType, value);
				WebElement headPhonesHover = driver.findElement(headPhones);
				clickElement(headPhonesHover, obj_Name);
				Update_Report("pass", objName, "Test Case was passed succesfully");
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void departmentsValidate() throws InterruptedException
		{
			try{
				startReport("departmentsValidate", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				setValue(5);
				By depart = getBy(locatorType, value);
				WebElement departmentHover = driver.findElement(depart);
				Actions action = new Actions(driver);
				action.moveToElement(departmentHover).build().perform();
				Thread.sleep(1500);
				Update_Report("pass", objName, "Test Case was passed succesfully");
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void account() throws InterruptedException
		{
			try{
				startReport("account", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				setValue(8);
				By depart = getBy(locatorType, value);
				WebElement departmentHover = driver.findElement(depart);
				Actions action = new Actions(driver);
				action.moveToElement(departmentHover).build().perform();
				Thread.sleep(1500);
				Update_Report("pass", objName, "Test Case was passed succesfully");
				setValue(9);
				By signin = getBy(locatorType, value);
				WebElement signinClick  =driver.findElement(signin);
				clickElement(signinClick, obj_Name);
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void allMenu()
		{
			try{
				startReport("allMenu", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				setValue(10);
				By depart = getBy(locatorType, value);
				WebElement allMenu = driver.findElement(depart);
				new Select(allMenu).selectByVisibleText("All Departments");
				
//				setValue(11);
//				By allMenuCl = getBy(locatorType, value);
//				WebElement allMenuSelect = driver.findElement(allMenuCl);
//				clickElement(allMenuSelect, obj_Name);
				WebElement allMenuNew = driver.findElement(By.cssSelector("option[value=\"search-alias=aps\"]"));
				clickElement(allMenuNew, obj_Name);
				new Select(driver.findElement(By.id("searchDropdownBox"))).selectByVisibleText("Clothing, Shoes & Jewelry");
				
				WebElement Clothing= driver.findElement(By.cssSelector("option[value=\"search-alias=fashion\"]"));
				clickElement(Clothing, obj_Name);
				
			    driver.close();

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void searchAddandDelete() throws InterruptedException
		{
			try{
				startReport("searchAddandDelete", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				setValue(15);
				By search = getBy(locatorType, value);
				WebElement searching = driver.findElement(search);
				enterText(searching, "iphone6s", obj_Name);
				
				setValue(16);
				By clickSearching = getBy(locatorType, value);
				WebElement clicking = driver.findElement(clickSearching);
				clickElement(clicking, obj_Name);
				
				setValue(17);
				By searchResults = getBy(locatorType, value);
				WebElement clickSearchResult = driver.findElement(searchResults);
				clickElement(clickSearchResult, obj_Name);
				
				setValue(18);
				By addToCart = getBy(locatorType, value);
				WebElement add = driver.findElement(addToCart);
				clickElement(add, obj_Name);
				
				setValue(19);
				By cart = getBy(locatorType, value);
				WebElement cartCheck = driver.findElement(cart);
				clickElement(cartCheck, obj_Name);
				   
				setValue(20);
				By delete = getBy(locatorType, value);
				WebElement deleteItemInCart = driver.findElement(delete);
				clickElement(deleteItemInCart, obj_Name);
				
				setValue(21);
				By cartAgain = getBy(locatorType, value);
				WebElement checkCartAgain = driver.findElement(cartAgain);
				clickElement(checkCartAgain, obj_Name);
							
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void help() throws InterruptedException
		{
			try{
				startReport("help", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				
				setValue(22);
				By help = getBy(locatorType, value);
				WebElement helpLink = driver.findElement(help);
				clickElement(helpLink, obj_Name);
				
				setValue(23);
				By helpSearch = getBy(locatorType, value);
				WebElement helpSearchBar = driver.findElement(helpSearch);
				enterText(helpSearchBar, "Thanks", obj_Name);
				
				setValue(24);
				By clickHelp = getBy(locatorType, value);
				WebElement clickButtonHelp = driver.findElement(clickHelp);
				clickElement(clickButtonHelp, obj_Name);
				    
				
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void javaBook() throws InterruptedException
		{
			try{
				startReport("javaBook", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				
				setValue(25);
				By search = getBy(locatorType, value);
				WebElement searchBar = driver.findElement(search);
				enterText(searchBar, "head first java", obj_Name);
				
				setValue(26);
				By click = getBy(locatorType, value);
				WebElement clickSearch = driver.findElement(click);
				clickElement(clickSearch, obj_Name);
				
				setValue(27);
				By result = getBy(locatorType, value);
				WebElement selectResult = driver.findElement(result);
				clickElement(selectResult, obj_Name);
				
				setValue(28);
				By quan = getBy(locatorType, value);
				WebElement selectQuantity = driver.findElement(quan);
				clickElement(selectQuantity, obj_Name);

				 Actions action = new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				
				setValue(30);
				By cart = getBy(locatorType, value);
				WebElement clickCart = driver.findElement(cart);
				clickElement(clickCart, obj_Name);
				
				Thread.sleep(1500);
				 	    
				
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void updatecart() throws InterruptedException
		{
			try{
				startReport("updatecart", "/Users/abhaskumar/Desktop/Report/");
				readLocators(repoPath);
				firefox();
				
				setValue(25);
				By search = getBy(locatorType, value);
				WebElement searchBar = driver.findElement(search);
				enterText(searchBar, "head first java", obj_Name);
				
				setValue(26);
				By click = getBy(locatorType, value);
				WebElement clickSearch = driver.findElement(click);
				clickElement(clickSearch, obj_Name);
				
				setValue(27);
				By result = getBy(locatorType, value);
				WebElement selectResult = driver.findElement(result);
				clickElement(selectResult, obj_Name);
				
				setValue(28);
				By quan = getBy(locatorType, value);
				WebElement selectQuantity = driver.findElement(quan);
				clickElement(selectQuantity, obj_Name);

				 Actions action = new Actions(driver);
				action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
				
				setValue(30);
				By cart = getBy(locatorType, value);
				WebElement clickCart = driver.findElement(cart);
				clickElement(clickCart, obj_Name);
				
				
				setValue(31);
				By cartRecheck = getBy(locatorType, value);
				WebElement cartrecheckClick = driver.findElement(cartRecheck);
				clickElement(cartrecheckClick, obj_Name);
				
			   setValue(32);
			   By Save = getBy(locatorType, value);
			   WebElement saveForLater = driver.findElement(Save);
			   clickElement(saveForLater, obj_Name);
				
				driver.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
