import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class SingletonTest {

    private Singleton instanceOne;
    private Singleton instanceTwo;

    @Before
    public void initialize() {
        this.instanceOne = Singleton.getInstance();
        this.instanceTwo = Singleton.getInstance();
    }

    @Test
    public void testAreTheyTheSameInstance() {
        assertSame(instanceOne, instanceTwo);
    }

}
