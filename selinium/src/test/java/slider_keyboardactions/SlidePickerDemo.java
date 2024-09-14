package slider_keyboardactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidePickerDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/#range");
		driver.manage().window().maximize();		
		Actions act = new Actions(driver); 
		// switch to frame if it is one then "0"
		driver.switchTo().frame(0);
		// mini slider
		 WebElement min_Slider=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("Location of slider before "+min_Slider.getLocation()); //(83-x, 46-y)		
		act.dragAndDropBy(min_Slider, 100, 46).perform(); // here xincrease by 100
		System.out.println("Location of slider after "+min_Slider.getLocation()); //(183, 46)
		
		// max slider		
		 WebElement max_Slider=driver.findElement(By.xpath("//span[2]"));
			System.out.println("Location of slider before "+max_Slider.getLocation()); //(336, 46)		
			act.dragAndDropBy(max_Slider, -36, 46).perform(); // here xincrease by 100
			System.out.println("Location of slider after "+max_Slider.getLocation()); //(300, 46)
			
	}

}
