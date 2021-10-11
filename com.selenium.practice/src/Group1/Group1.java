package Group1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group1 {

	WebDriver driver;

	public Group1(WebDriver driver) {
		this.driver=driver;

	}

	//locaters
	By img= By.xpath("//a[@id='nav-logo-sprites']");
	By search=By.xpath("//input[@id='twotabsearchtextbox']");
	


	By click= By.xpath("//input[@id='nav-search-submit-button']");



	//Action methods
	public boolean imgDisplayed() {
		boolean displ=driver.findElement(img).isDisplayed();
		return displ;
	}


	void sear(String s){
		driver.findElement(search).sendKeys(s);

	}
	
	
	void click() {
		driver.findElement(click).click();
	}
	void quit() {
		driver.quit();
	}


	


}
