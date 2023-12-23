import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Phonebook {
    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
    }

    @Test
    public void about (){
        WebElement aboutButton = wd.findElement(By.cssSelector("a[href='/about']"));
        Assert.assertEquals(aboutButton.getText(), "ABOUT");
    }
    @Test
    public void home (){
        WebElement homeButton = wd.findElement(By.xpath("//a[@href='/home']"));
        Assert.assertEquals(homeButton.getText(), "HOME");
    }

    @Test
    public void phonebookWord () {
        WebElement word = wd.findElement(By.tagName("h1"));
        Assert.assertEquals(word.getText(), "PHONEBOOK");
    }

    @Test
    public void loginButton(){
        WebElement login = wd.findElement(By.xpath("//div/a[last()]"));
        Assert.assertEquals(login.getText(), "LOGIN");
    }

    @AfterClass
    public void stop() {
        wd.close();
    }


}
