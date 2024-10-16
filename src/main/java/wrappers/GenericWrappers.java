package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;


public class GenericWrappers extends Reporting implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	public void loadObjects() {
		 prop = new Properties();
		try {
			prop.load(new FileInputStream("./src/test/java/Object.Properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unloadObjects() {
		prop = null;
	}
	
	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
	
			try {
				if(browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if(browser.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				} else if(browser.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", "./drivers/IEdriver.exe");
					driver = new InternetExplorerDriver();
				}
				
				driver.manage().window().maximize();
				driver.get(url);
				
				//System.out.println("The browser  "+browser+" is launched with  the given url "+url+" successfully");
				reportStep("The browser  "+browser+" is launched with  the given url "+url+" successfully", "pass");
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
				
			} catch (SessionNotCreatedException e) {
				// TODO Auto-generated catch block
				//System.err.println("The browser "+browser+" is not launced with the giver url due to session not created error");
				reportStep("The browser "+browser+" is not launced with the giver url due to session not created error", "fail");
			} catch (InvalidArgumentException e) {
				// TODO: handle exception
				//System.err.println("The browser "+browser+" is not launched with the given url as url does not contain http/https");
				reportStep("The browser "+browser+" is not launched with the given url as url does not contain http/https", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The browser "+browser+" is not launched due to unknown error");
				reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
			}
	}

	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The Element with id "+idValue+" is entered with data "+data);
			reportStep("The Element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data due to unexpected alert opened");
			reportStep("The element with id "+idValue+" is not entered with data due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data due to unknown error", "fail");
		}
		
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the dom");
			reportStep("The element with name "+nameValue+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data due to unexpected alert opened");
			reportStep("The element with name "+nameValue+" is not entered with data due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data due to unknown error", "fail");
		} 
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with xpath "+xpathValue+" is entered with data"+data);
			reportStep("The element with xpath "+xpathValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the dom");
			reportStep("The element with xpath "+xpathValue+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not found in the dom", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data due to unexpected alert opened");
			reportStep("The element with xpath "+xpathValue+" is not entered with data due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data due to unknown error", "fail");
		}
		
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the browser "+actualTitle+" is matched with expected title "+title+" successfully");
				reportStep("The title of the browser "+actualTitle+" is matched with expected title "+title+" successfully", "pass");
			} else {
				//System.err.println("The title of the browser "+actualTitle+" is not matched with expected title "+title);
				reportStep("The title of the browser "+actualTitle+" is not matched with expected title "+title, "pass");
				
			}
			
			}  catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The title "+title+" is not verified due to an unknown error");
			reportStep("The title "+title+" is not verified due to an unknown error", "fail");
		} 
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actText = driver.findElementById(id).getText();
			if(actText.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actText+" is matched with expected text "+text+" successfully");
				reportStep("The element with id "+id+" is holding the text "+actText+" is matched with expected text "+text+" successfully", "pass");
			}else {
				//System.out.println("The element with id "+id+" is holding the text "+actText+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actText+" is not matched with expected text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the dom");
			reportStep("The element with id "+id+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"  is not visisble in the application");
			reportStep("The element with id "+id+"  is not visisble in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"  is not interactable in the application");
			reportStep("The element with id "+id+"  is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
	 	} catch (UnhandledAlertException e) {
			// TODO: handle exception
	 		//System.err.println("The element with id "+id+" is not verified due to unexpected alert opened");
	 		reportStep("The element with id "+id+" is not verified due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+text+" is not verified due to unknown error occured");
			reportStep("The element with id "+text+" is not verified due to unknown error occured", "fail");
				
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actXpathText = driver.findElementByXPath(xpath).getText();
			if(actXpathText.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actXpathText+" is matched with expected text "+text+" successfully");
				reportStep("The element with xpath "+xpath+" is holding the text "+actXpathText+" is matched with expected text "+text+" successfully", "pass");
			}else {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actXpathText+" is not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actXpathText+" is not matched with expected text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the dom");
			reportStep("The element with xpath "+xpath+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visisble in the application");
			reportStep("The element with xpath "+xpath+" is not visisble in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unexpected alert opened");
			reportStep("The element with xpath "+xpath+" is not verified due to unexpected alert opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error occured");
			reportStep("The element with xpath "+xpath+" is not verified due to unknown error occured", "fail");
		} 	
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		String xpathTextContent = null;
		// TODO Auto-generated method stub
		try {
			xpathTextContent = driver.findElementByXPath(xpath).getText();
			if(xpathTextContent.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+xpathTextContent+" is contains the expected text "+text);\
				reportStep("The element with xpath "+xpath+" is holding the text "+xpathTextContent+" is contains the expected text "+text, "pass");
			}else {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+xpathTextContent+" is not contains the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+xpathTextContent+" is not contains the expected text "+text, "pass");
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the dom");
			reportStep("The element with xpath "+xpath+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unexpected alert occured");
			reportStep("The element with xpath "+xpath+" is not verified due to unexpected alert occured", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error occured");
			reportStep("The element with xpath "+xpath+" is not verified due to unknown error occured", "fail");
		}	
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with "+id+" is clicked successfully");
			reportStep("The element with "+id+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the dom");
			reportStep("The element with id "+id+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicking due to button was disabled");
			reportStep("The element with id "+id+" is not clicking due to button was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicking due to unexpected alert opened");
			reportStep("The element with id "+id+" is not clicking due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicking due to unknown error has occured");
			reportStep("The element with id "+id+" is not clicking due to unknown error has occured", "fail");
		}
		
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classname "+classVal+" is clicked successfully");
			reportStep("The element with classname "+classVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with classname "+classVal+" is not found in the dom");
	        reportStep("The element with classname "+classVal+" is not found in the dom", "fail");	
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not visible in the application");
			reportStep("The element with classname "+classVal+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicking in the application because it is disabled");
			reportStep("The element with classname "+classVal+" is not clicking in the application because it is disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not interactable in the application");
			reportStep("The element with classname "+classVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not stable in the application");
			reportStep("The element with classname "+classVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicking due to unexpected alert was opened");
			reportStep("The element with classname "+classVal+" is not clicking due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classname "+classVal+" is not clicking due to unknown error has occured");
			reportStep("The element with classname "+classVal+" is not clicking due to unknown error has occured", "fail");
		} 
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked successfully");
			reportStep("The element with name "+name+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the dom");
			reportStep("The element with name "+name+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element wit name "+name+" is not visisble in the application");
			reportStep("The element wit name "+name+" is not visisble in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicking due to element was disabled");
			reportStep("The element with name "+name+" is not clicking due to element was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicking due to unexpected alert has opened");
			reportStep("The element with name "+name+" is not clicking due to unexpected alert has opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not clicking due to unknown error has occured");
			reportStep("The element with name "+name+" is not clicking due to unknown error has occured", "fail");
		}
		
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with linktext "+name+" is not found in the dom");
			reportStep("The element with linktext "+name+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicking due to element was disabled");
			reportStep("The element with linktext "+name+" is not clicking due to element was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicking due to unexpected alert was opened");
			reportStep("The element with linktext "+name+" is not clicking due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicking due to unknown error has occured");
			reportStep("The element with linktext "+name+" is not clicking due to unknown error has occured", "fail");
		} 
		
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with linktext "+name+" is not found in the dom");
			reportStep("The element with linktext "+name+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not visible in the application");
			reportStep("The element with linktext "+name+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to element was disabled");
			reportStep("The element with linktext "+name+" is not clicked due to element was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in the application");
			reportStep("The element with linktext "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in the application");
			reportStep("The element with linktext "+name+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to unexpected alert was opened");
			reportStep("The element with linktext "+name+" is not clicked due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to unknown error has occured");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error has occured", "fail");
		}
		
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with xpath "+xpathVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to element was disabled");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to element was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert has opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert has opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error has occured");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error has occured", "fail");
		} 
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked successfully");
			reportStep("The element with xpath "+xpathVal+" is clicked successfully","pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with xpath "+xpathVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath \"+xpathVal+\" is not visible in the application", "fail");
		} catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to element was disabled");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to element was disabled", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert was opened");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unknown error has occured");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unknown error has occured", "fail");
		} 
		
		
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String valueOfId=null;
		try {
			valueOfId = driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is returning the text "+valueOfId+" successfully");
			reportStep("The element with id "+idVal+" is returning the text "+valueOfId+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in the dom");
			reportStep("The element with id "+idVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//ystem.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not returning the value "+valueOfId+" due to unexpected alert was opened");
			reportStep("The element with id "+idVal+" is not returning the value "+valueOfId+" due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not returning the value "+valueOfId+" due to unknown error has occured");
			reportStep("The element with id "+idVal+" is not returning the value "+valueOfId+" due to unknown error has occured", "fail");
		} 
		return valueOfId;
		
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String valueOfXpath=null;
		try {
			valueOfXpath = driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is returning the text "+valueOfXpath+" successfully");
			reportStep("The element with xpath "+xpathVal+" is returning the text "+valueOfXpath+" successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with xpath "+xpathVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not returning the string "+valueOfXpath+" due to unexpected alert was opened");
			reportStep("The element with xpath "+xpathVal+" is not returning the string "+valueOfXpath+" due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not returning the string "+valueOfXpath+" due to unknown error has occured");
			reportStep("The element with xpath "+xpathVal+" is not returning the string "+valueOfXpath+" due to unknown error has occured", "fail");
		} 
			return valueOfXpath;
		
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectText = driver.findElementById(id);
			Select txt = new Select(selectText);
			txt.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected the text "+value);
			reportStep("The element with id "+id+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the dom");
			reportStep("The element with id "+id+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value due to id is disable");
			reportStep("The element with id "+id+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 		
		
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement selectText2 = driver.findElementById(id);
			Select txt2 = new Select(selectText2);
			txt2.selectByIndex(value);
			//System.out.println("The element with id "+id+" is selected the text "+value);
			reportStep("The element with id "+id+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the dom");
			reportStep("The element with id "+id+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value due to id is disable");
			reportStep("The element with id "+id+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 
		
			
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
		try {
			Set<String> parentWindow = driver.getWindowHandles();
			for(String eachWindow : parentWindow) {
				driver.switchTo().window(eachWindow);
				//System.out.println("The window is switchto parentwindow "+eachWindow+" successfully");
				reportStep("The window is switchto parentwindow "+eachWindow+" successfully", "pass");
				break;
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("unable to switch to parentwindow because there is no such window available");
			reportStep("unable to switch to parentwindow because there is no such window available", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to parentwindow due to unexpected alert was opened");
			reportStep("unable to switch to parentwindow due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to parentwindow due to unknown error has occured");
			reportStep("unable to switch to parentwindow due to unknown error has occured", "fail");
		} 
		
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> lastWindow = driver.getWindowHandles();
			for(String eachWindow : lastWindow) {
				driver.switchTo().window(eachWindow);
				//System.out.println("The window was switchto lastwindow "+eachWindow+" successfully");
				reportStep("The window was switchto lastwindow "+eachWindow+" successfully", "pass");
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("unable to switch to lastwindow because there is no such window available");
			reportStep("unable to switch to lastwindow because there is no such window available", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to lastwindow due to unexpected alert was opened");
			reportStep("unable to switch to lastwindow due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to lastwindow due to unknown error has occured");
			reportStep("unable to switch to lastwindow due to unknown error has occured", "fail");
		}
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Alert was accepted successfully");
			reportStep("Alert was accepted successfully", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("unable to accept the alert due to alert was not present");
			reportStep("unable to accept the alert due to alert was not present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exceptio
			//System.err.println("unable to accept the alert due to unknown error has occured");
			reportStep("unable to accept the alert due to unknown error has occured", "fail");
		} 
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Alert was dismissed successfully");
			reportStep("Alert was dismissed successfully", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("unable to dismiss the alert due to alert was not present");
			reportStep("unable to dismiss the alert due to alert was not present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to dismiss the alert due to unknown error has occured");
			reportStep("unable to dismiss the alert due to unknown error has occured", "fail");
		} 
		
	}	
	

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		 String alertText = null;
		try {
			alertText = driver.switchTo().alert().getText();
			//System.out.println(alertText);
			reportStep(alertText, "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the alert text due to alert was not present");
			reportStep("Unable to get the alert text due to alert was not present", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to get the alert text due to unknown error has occured");
			reportStep("Unable to get the alert text due to unknown error has occured", "fail");
		}
		return alertText;
		
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long snapNumber=0;
		try {
			
			snapNumber =  (long) (Math.floor(Math.random()*100000000)+100000);
			File tmp = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./reports/screenshots/"+snapNumber+".png");
			FileUtils.copyFile(tmp, dest);
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("unable to takesnap due to unknown error has occured");
			//reportStep("unable to takesnap due to unknown error has occured", "fail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("unable to takesnap due to io exception was occured");
			//reportStep("unable to takesnap due to io exception was occured", "fail");
		}
		return snapNumber;
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("The browser was closed successfully");
			reportStep("The browser was closed successfully", "pass", false);
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to close the broswer due to unexpected error opened");
			reportStep("unable to close the broswer due to unexpected error opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to close the browser due to unknown error occured");
			reportStep("unable to close the browser due to unknown error occured", "fail");
		} 
		
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			
			//System.out.println("All the browsers were closed successfully");
			reportStep("All the browsers were closed successfully", "pass", false);
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to close the broswers due to unexpected error opened");
			reportStep("unable to close the broswers due to unexpected error opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to close the browsers due to unknown error has occured");
			reportStep("unable to close the browsers due to unknown error has occured", "fail");
		}

	}

	@Override
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to wait untill browser loading due to interruption has occured");
			reportStep("Unable to wait untill browser loading due to interruption has occured", "fail");
		}
		
	}

	@Override
	public void selectIndexByXpath(String xpath, int value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement selByXpath = driver.findElementByXPath(xpath);
			
			Select xpathVal = new Select(selByXpath);
			
			xpathVal.selectByIndex(value);
			//System.out.println("The element with xpath "+xpath+" is selected the text "+value);
			reportStep("The element with xpath "+xpath+" is selected the text "+value, "pass");
	} catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with xpath "+xpath+" is not found in the dom");
		reportStep("The element with xpath "+xpath+" is not found in the dom", "fail");
	} catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not visible in the application");
		reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
	} catch (ElementNotSelectableException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not selecting the value due to id is disable");
		reportStep("The element with xpath "+xpath+" is not selecting the value due to id is disable", "fail");
	} catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
		reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
	} catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not stable in the application");
		reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
	} catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not selecting the value "+value+" due to unexpected alert opened");
		reportStep("The element with xpath "+xpath+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
	} catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath "+xpath+" is not selecting the value "+value+" due to unknown error occured");
		reportStep("The element with xpath "+xpath+" is not selecting the value "+value+" due to unknown error occured", "fail");
	}
		}

	@Override
	public void selectVisibileTextByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement selVisiByXpath = driver.findElementByXPath(xpathVal);
			
			Select xpathVal2 = new Select(selVisiByXpath);
			
			xpathVal2.selectByVisibleText(value);
			
			//System.out.println("The element with xpath "+xpathVal+" is selected the text "+value);
			reportStep("The element with xpath "+xpathVal+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with xpath "+xpathVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value due to id is disable");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 
	}

	@Override
	public void selectValueByXpath(String xpathVal, String value) {
		// TODO Auto-generated method stub
		
		try {
			WebElement selValueByXpath = driver.findElementByXPath(xpathVal);
			
			Select xpathVal3 = new Select(selValueByXpath);
			
			xpathVal3.selectByValue(value);
			
			//System.out.println("The element with xpath "+xpathVal+" is selected the text "+value);
			reportStep("The element with xpath "+xpathVal+" is selected the text "+value, "pass");
		}catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in the dom");
			reportStep("The element with xpath "+xpathVal+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value due to id is disable");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with xpath "+xpathVal+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 		
	}

	@Override
	public void pageDown() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
			
			//System.out.println("The page is scrolled down successfully");
			reportStep("The page is scrolled down successfully", "pass");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to scroll down the page due to unexpected error opened");
			reportStep("unable to scroll down the page due to unexpected error opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to scroll down the page due to unknown error occured");
			reportStep("unable to scroll down the page due to unknown error occured", "fail");
		} 
		
		
	}

	@Override
	public void selectIndexByName(String name, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement selIndexByName = driver.findElementByName(name);
			
			Select nameVal = new Select(selIndexByName);
			
			nameVal.selectByIndex(value);
			
			//System.out.println("The element with name "+name+" is selected the text "+value);
			reportStep("The element with name "+name+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the dom");
			reportStep("The element with name "+name+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value due to id is disable");
			reportStep("The element with name "+name+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with name "+name+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with name "+name+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 
		
	}


	@Override
	public void tab() {
		// TODO Auto-generated method stub
			try {
				driver.findElementByXPath("//html/body").sendKeys(Keys.TAB);
				//System.out.println("The tab key is successfully given");
				reportStep("The tab key is successfully given", "pass");
			} catch (UnhandledAlertException e) {
				// TODO: handle exception
				//System.err.println("unable to give tab due to unexpected error opened");
				reportStep("unable to give tab due to unexpected error opened", "fail");
			} catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("unable to give tab due to unknown error occured");
				reportStep("unable to give tab due to unknown error occured", "fail");
			} 
			
	}

	@Override
	public void space() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.SPACE);
			//System.out.println("The space key is clicked successfully ");
			reportStep("The space key is clicked successfully", "pass");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to give space due to unexpected error opened");
			reportStep("unable to give space due to unexpected error opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to give space due to unknown error occured");
			reportStep("unable to give space due to unknown error occured", "fail");
		}
		
		
	}

	@Override
	public void pageup() {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_UP);
			//System.out.println("The page is scrolled up successfully");
			reportStep("The page is scrolled up successfully", "pass");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to scroll up the page due to unexpected error opened");
			reportStep("unable to scroll up the page due to unexpected error opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to scroll up the page due to unknown error occured");
			reportStep("unable to scroll up the page due to unknown error occured", "fail");
		}
			
	}

	@Override
	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selValueByName = driver.findElementByName(name);
			Select valueOfName = new Select(selValueByName);
			valueOfName.selectByValue(value);
			//System.out.println("The element with name "+name+" is selected the text "+value);
			reportStep("The element with name "+name+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not found in the dom");
			reportStep("The element with name "+name+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in the application");
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value due to id is disable");
			reportStep("The element with name "+name+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with name "+name+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with name "+name+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 
	}

	@Override
	public void switchToFrame(String value) {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().frame(value);
			//System.out.println("The frame is switched successfully");
			reportStep("The frame is switched successfully", "pass",false);
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to such frame is not present");
			reportStep("unable to switch to frame due to such frame is not present", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unexpected alert was opened");
			reportStep("unable to switch to frame due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unknown error has occured");
			reportStep("unable to switch to frame due to unknown error has occured", "fail");
		} 
		
	}

	@Override
	public void switchToDefault() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().defaultContent();
			//System.out.println("The frame is switched to default frame successfully");
			reportStep("The frame is switched to default frame successfully", "pass");
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to such frame is not present");
			reportStep("unable to switch to frame due to such frame is not present", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unexpected alert was opened");
			reportStep("unable to switch to frame due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//.err.println("unable to switch to frame due to unknown error has occured");
			reportStep("unable to switch to frame due to unknown error has occured", "fail");
		} 
	}

	@Override
	public void switchToNewFrame(String value) {
		// TODO Auto-generated method stub
		try {
			WebElement newFrame = driver.findElementByXPath(value);
			driver.switchTo().frame(newFrame);
			//System.out.println("The frame is switched to frame successfully");
			reportStep("The frame is switched to frame successfully", "pass",false);	
		}catch (NoSuchFrameException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to such frame is not present");
			reportStep("unable to switch to frame due to such frame is not present", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unexpected alert was opened");
			reportStep("unable to switch to frame due to unexpected alert was opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unknown error has occured");
			reportStep("unable to switch to frame due to unknown error has occured", "fail");
		} 
		
	}

	@Override
	public void alertText(String value) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(value);
			//System.out.println("We enter the value "+value+" successfully");
			reportStep("We enter the value "+value+" successfully", "pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unable to get the alert text due to alert was not present");
			reportStep("Unable to get the alert text due to alert was not present", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unexpected alert was opened");
			reportStep("unable to switch to frame due to unexpected alert was opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to get the alert text due to unknown error has occured");
			reportStep("Unable to get the alert text due to unknown error has occured", "fail");
		}		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("unable to switch to frame due to unexpected alert was opened");
			reportStep("unable to switch to frame due to unexpected alert was opened", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Unable to get the alert text due to unknown error has occured");
			reportStep("Unable to get the alert text due to unknown error has occured", "fail");
		}		
		
	}

	@Override
	public void selectValueById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement selValById = driver.findElementById(id);
			Select txtSelValById = new Select(selValById);
			txtSelValById.selectByValue(value);
			//System.out.println("The element with id "+id+" is selected the text "+value);
			reportStep("The element with id "+id+" is selected the text "+value, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in the dom");
			reportStep("The element with id "+id+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value due to id is disable");
			reportStep("The element with id "+id+" is not selecting the value due to id is disable", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unexpected alert opened", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured");
			reportStep("The element with id "+id+" is not selecting the value "+value+" due to unknown error occured", "fail");
		} 
	}

	@Override
	public void verifyTextEqualsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String xpathTextContent2 = null;
		try {
			xpathTextContent2 = driver.findElementByXPath(xpath).getText();
			if(xpathTextContent2.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+xpathTextContent2+" same as the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+xpathTextContent2+" same as the expected text "+text, "pass");
			}else {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+xpathTextContent2+" is not same as the expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+xpathTextContent2+" is not same as the expected text "+text, "pass");
			}
		}  catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not found in the dom");
			reportStep("The element with xpath "+xpath+" is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unexpected alert occured");
			reportStep("The element with xpath "+xpath+" is not verified due to unexpected alert occured", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not verified due to unknown error occured");
			reportStep("The element with xpath "+xpath+" is not verified due to unknown error occured", "fail");
		}
	}

	@Override
	public void mouseHoverByXpath(String value) {
		// TODO Auto-generated method stub
		try {
			Actions builder = new Actions(driver);
			
			WebElement mouseHover = driver.findElementByXPath(value);
			
			builder.moveToElement(mouseHover).perform();
			//System.out.println("The element with xpath is clicked on the value" +value+ "successfully");
			reportStep("The element with xpath is clicked on the value" +value+ "successfully", "pass");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not found in the dom");
			reportStep("The element with xpath is not found in the dom", "fail");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not visible in the application");
			reportStep("The element with xpath is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not interactable in the application");
			reportStep("The element with xpath is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not stable in the application");
			reportStep("The element with xpath is not interactable in the application", "fail");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not verified due to unexpected alert occured");
			reportStep("The element with xpath is not verified due to unexpected alert occured", "fail");
		} catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath is not verified due to unknown error occured");
			reportStep("The element with xpath is not verified due to unknown error occured", "fail");
		}
}

				
}		


