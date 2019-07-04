package primerospasos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Divisas{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Windows 10 LTSB ®/repo/test_automation/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Select select = new Select(driver.findElement(By.id("knowledge-currency__src-selector")));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com.mx/");
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Convertir pesos mexicanos a dolares");
		
		driver.navigate().to("https://www.google.com.mx/search?source=hp&ei=nxPNXIiqOsyIsQWGmKUI&q=Convertir+pesos+mexicanos+a+dolares&btnK=Buscar+con+Google&oq=Convertir+pesos+mexicanos+a+dolares");
		
		String text1 = driver.findElement(By.id("knowledge-currency__src-input")).getAttribute("value");
		String text2 = driver.findElement(By.id("knowledge-currency__tgt-input")).getAttribute("value");
		System.out.println(text1+" Pesos Mexocanos son iguales a "+text2+" Dolares Estadounidences");
		
		driver.quit();
	}

}
