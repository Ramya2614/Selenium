package Actions;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selium 3.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Cookie cookie=new Cookie("google", "browser");
		driver.manage().addCookie(cookie);
		
		Set<Cookie> cookie_Set=driver.manage().getCookies();
		for(Cookie temp_cookie : cookie_Set){
			System.out.println("Name of the cookie : "+temp_cookie.getName()+"  and its value : "+temp_cookie.getValue()
			+"   get domain : "+temp_cookie.getDomain()+"   get path : "+temp_cookie.getPath()+
			"expiry date : "+temp_cookie.getExpiry()+"   is secure : "+temp_cookie.isSecure());
		}
		
		driver.manage().deleteCookie(cookie);

	}

}
