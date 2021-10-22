package Bizgaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pre_Requisites {
	public WebDriver driver;
	public String URL="";
	public String username="";
	public String password="";
	public String username1="";
	public String password1="";
	public String username2="";
	public String password2="";
	public String create="create-place d-flex";
	public String update="biz-icon-size text-primary";
	public String search="ListSearch";
	public String save="btnDynamicSave";
	public String close="btn_CloseForm";

@BeforeClass
	public void Startup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
}
@Test
public void newem() {
	
}
}
