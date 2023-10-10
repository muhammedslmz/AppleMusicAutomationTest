package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    By loginBtn = new By.ByXPath("//div[@class='right-content svelte-7rh63f']//button[@class='signin svelte-xupt29']");
    By emailTxtArea = new By.ByXPath("/html/body/div[1]/div/div/div/div/div[2]/div/div/div[2]/div[1]/form/div/input");
    By forgotPassword = new By.ByXPath("//a[contains(text(), 'Forgot Apple ID or Password')]");
    By loginPopUp = new By.ByXPath("//div[@class='page-container page-container--modal page-container--full-height page-container--padded authenticate-view']");
    By mainSearch = new By.ByXPath("//*[@id=\"search-input-form\"]/input");
    By modal = new By.ByXPath("//div[@id='modal-body']");
    By continueBtn = new By.ByXPath("/html/body/div[1]/div/div/div/div/div[1]/button/span/span");
    By searchResult = new By.ByXPath("/html/body/div[1]/div[2]/nav/div[1]/div[2]/div/ul/li/span/span[2]");
    By artistPageBtn =new By.ByXPath("//*[@id=\"scrollable-page\"]/main/div/div[2]/div[1]/div/ul/li[1]/div/div/div[1]/a");
    By songPlayBtn =new By.ByXPath("/html/body/div/div[4]/main/div/div[3]/div[2]/div[2]/section/div[1]/ul/li[1]/div/div/div[1]/div[2]");
    By popupCloseBtn =new By.ByXPath("/html/body/div[1]/div/div/div/div/div[1]/button/span/span");
    By amazonCountry = new By.ByXPath("//span[@id='glow-ingress-line2']");
    By amazonPopup = new By.ByXPath("/html/body/div[3]/div/div/div[1]/div/div[2]/div[1]/span/span/input");
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login (){
        /*
    click(amazonCountry);
    click(amazonPopup);
         */



        send(mainSearch,"Rewşan Çeliker");
        waitForSecond(3);
        click(searchResult);
        click(artistPageBtn);
        click(songPlayBtn);
        waitForSecond(3);
        click(songPlayBtn);
        waitForSecond(10);
        drivers().switchTo().alert();
        //click(popupCloseBtn);



        /*
        String originalWindow =drivers().getWindowHandle();
        for (String windowHandle : drivers().getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                drivers().switchTo().window(windowHandle);
                click(emailTxtArea);
                send(emailTxtArea,"muhammedslmz@icloud.com");
                break;
            }
        }
        drivers().switchTo().window(originalWindow);

 */


    }



}





