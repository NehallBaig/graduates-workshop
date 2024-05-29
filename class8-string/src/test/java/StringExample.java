import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringExample {


    public static void main(String[] args) {

        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        // Example 1: Check if page source contains specific text
        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        if (pageSource.contains("Example source")) {
            System.out.println("Text is present on the page.");
        }

        // Example 2: Compare title of the page
        String actualTitle = driver.getTitle();
        String expectedTitle = "Title To Match eg google";
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title matches.");
        }

        // Example 3: Extract part of text from an element
        WebElement element = driver.findElement(By.id("SIvCob"));
        String elementText = element.getText();
        String extractedText = elementText.substring(0, 7); // "Example"
        System.out.println("Extracted Text: " + extractedText);

        // Example 4: Replace text in an element
        String modifiedText = elementText.replace("Domain", "Website");
        System.out.println("Modified Text: " + modifiedText);


        // Example startsWith and endsWith: Check if a string starts or ends with a specific prefix or suffix.
        String url = driver.getCurrentUrl();
        if(url.startsWith("https://")) {
            System.out.println("URL uses HTTPS.");
        }

        // Example substring: Extract a portion of a string.

        String fullText = "Hello To Programming World ";//driver.findElement(By.id("elementId")).getText();
        String extractedText1 = fullText.substring(5, 10);
        System.out.println("Extracted Text: " + extractedText);

        // Clean up
        driver.quit();

    }

}
