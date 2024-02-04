package handleCookies.selenium;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Cookie;



public class HandleCookie {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		
		// Get all cookie
		Set<Cookie> cookie = driver.manage().getCookies();
		
		// Size of cookie
		System.out.println("The size of cookies " +cookie.size());
		
		System.out.println();
		
		System.out.println("Number of cookie in a website");
		
		for(Cookie ck : cookie) {
			System.out.println(ck.getName() + ":" +ck.getValue());
		}
		
		System.out.println();
		
		// Get a specific cookie by name
		Cookie myCookie = driver.manage().getCookieNamed("tz");

		// Check if the cookie exists
		if (myCookie != null) {
		    System.out.println("Cookie Value: " + myCookie.getValue());
		} else {
		    System.out.println("Cookie not found");
		}

		System.out.println();
		
		System.out.println("Adding a new cookie");
		
		// Add a new cookie
		Cookie newCookie = new Cookie("AmarSonam", "SonamAmar");
		driver.manage().addCookie(newCookie);
		
		
		// Get all cookie
				Set<Cookie> cookies = driver.manage().getCookies();
				
				// Size of cookie
				System.out.println("The size of cookies after adding new cookie " +cookies.size());
				
				System.out.println();
				
				System.out.println("Number of cookie in a website");
				
				for(Cookie cks : cookies) {
					System.out.println(cks.getName() + ":" +cks.getValue());
				}

		driver.close();
	}
}
