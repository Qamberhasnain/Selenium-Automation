package testing;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\automation-workspace\\browserdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/railways/");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		System.out.println("Title of page: "+driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[3]/div[2]")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("DELHI");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("LKO");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\"][contains(@aria-label,'May 20 2022')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/li[@data-cy=\"3A\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/a[@data-cy=\"submit\"]")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
}
