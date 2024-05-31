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
        System.out.println("Extracted Text: " + extractedText1);

        //Example Replace and replaceAll: Replace occurrences of a character or substring with another character or substring.
        String originalText2 = "This is some oldText";//driver.findElement(By.id("elementId")).getText();
        String modifiedText2 = originalText2.replace("oldText", "newText");
        System.out.println("Modified Text: " + modifiedText2);

        //Example Split: Split a string into an array based on a delimiter.
        String csvText = "value1,value2,value3";
        String[] values = csvText.split(",");
        for(String value : values) {
            System.out.println("Value: " + value);
        }

        //Example trim: Remove leading and trailing whitespace.
        String textWithWhitespace = "  some text  ";
        String trimmedText = textWithWhitespace.trim();
        System.out.println("Trimmed Text: '" + trimmedText + "'");

        //Example toUpperCase and toLowerCase: Convert a string to uppercase or lowercase.
        String mixedCaseText = "Some Text";
        String lowerCaseText = mixedCaseText.toLowerCase();
        System.out.println("Lowercase Text: " + lowerCaseText);

        //Example length: Get the length of a string.
        String text = "size5";//driver.findElement(By.id("elementId")).getText();
        int length = text.length();
        System.out.println("Text Length: " + length);

        //Example valueOf: Convert other data types to a string.
        int number = 123;
        String numberAsString = String.valueOf(number);
        System.out.println("Number as String: " + numberAsString);

        // Clean up
        driver.quit();

    }

}
