import org.junit.*;

public class TC_001 {



    @ After
    public void closeBrowser() {
        System.out.println("Close Browser");
    }


    @Before
    public void startBrowser() {
        System.out.println("Starting browser + put code");
    }


    @Test
    public void tc001() {
        System.out.println("TC_001");


    }


}




