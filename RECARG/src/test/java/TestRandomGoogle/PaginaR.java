package TestRandomGoogle;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PaginaR {
	
	private WebDriver driver;
	
	By locator_ClickImagenesGoogle = By.cssSelector(".MUFPAc > div:nth-of-type(2) > a");
	By locator_ClickSegundaOpcion = By.cssSelector(".KZ4CUc [role='listitem']:nth-of-type(2) .hIOe2");
	By locator_ClickBuscarConCamara = By.cssSelector("div:nth-of-type(1) > .F7UV7d");
	By locator_RellenarURLImagen = By.cssSelector("input[name='image_url']");
	By locator_EnviarURLImagen = By.cssSelector("input[name='btnG']");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?hl=es");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void BuscarCelularCaminoRaro() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.clear();
		searchBox.sendKeys("Buscar imagenes");
		searchBox.submit();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(locator_ClickImagenesGoogle).click();
		driver.findElement(locator_ClickSegundaOpcion).click();
		driver.findElement(locator_ClickBuscarConCamara).click();
		driver.findElement(locator_RellenarURLImagen).click();
		driver.findElement(locator_RellenarURLImagen).clear();
		driver.findElement(locator_RellenarURLImagen).sendKeys("data:image/jpeg;base64,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");
		driver.findElement(locator_EnviarURLImagen).click();
	}

}
