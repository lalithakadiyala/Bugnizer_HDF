package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_img {
	
	WebDriver driver;
	
	public POM_img(WebDriver driver) {
		this.driver=driver;
	}
	
	By img=By.xpath("/img");
	
	

}
