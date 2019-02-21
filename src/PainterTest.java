import org.junit.Assert;
import org.junit.Test;

public class PainterTest {


    @Test
    public void getName() {
        Painter leo = new Painter("Leonardo", 2003);
        Assert.assertEquals(leo.getName(), "Leonardo");
    }
}