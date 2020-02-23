package day54;

public class Firefox implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url+" using Firefox browser");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
