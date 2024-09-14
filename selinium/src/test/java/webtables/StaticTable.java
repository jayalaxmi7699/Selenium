package webtables;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.navigate().to("https://testautomationpractice.blogspot.com/");

        // Count the number of rows in the table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("No of rows: " + rows);

        // Count the number of columns in the table
        int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("No of columns: " + cols);

        // Iterate over each row starting from the 2nd row (because 1st row is the header)
       /* for (int r = 2; r <= rows; r++) {
            // Iterate over each column
            for (int c = 1; c <= cols; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.print(value + "\t");
            }
            System.out.println();
        } */
        // book names with Author  
        /*for (int r = 2; r <= rows; r++) {
            String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
            
            if(author.equals("Mukesh")) {
            	 String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[1]")).getText();
                 System.out.println(book+"\t"+author);
            }
        } */
        int total =0;
        for (int r = 2; r <= rows; r++) {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
//            System.out.println(price);
            total = total+ Integer.parseInt(price);           
        }
        System.out.println(total);
        
        driver.quit();
    }
}
