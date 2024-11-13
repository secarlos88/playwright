import com.pw.ScriptBase;
import org.junit.jupiter.api.*;

public class HomeTest extends ScriptBase {


    @Test
    public void firstTest(){
            page.navigate("https://opencart.abstracta.us/");
            page.click("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
            Assertions.assertEquals(page.title(), "Cameras");
    }

    @Test
    public void secondTest(){
            page.navigate("https://opencart.abstracta.us/");
            page.click("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
            Assertions.assertEquals(page.title(), "Cameras");
    }

    @Test
    public void enterCameraLink(){
        page.navigate("https://opencart.abstracta.us/");
        //page.click();
        Assertions.assertEquals(page.title(), "Cameras");
    }
}
