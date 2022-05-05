import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrimeTest {
    @Test
    public void test2() {
        Prime p = new Prime();
        assertEquals(false, p.isPrime(100));
    }
    @Test
    public void test3() {
        Prime p = new Prime();
        assertEquals(true, p.isPrime(5));
    }
    @Test
    public void test4() {
        Prime p = new Prime();
        assertEquals(true, p.isPrime(6));
    }
    @Test
    public void test5() {
        Prime p = new Prime();
        assertEquals(false, p.isPrime(99));
    }
    @Test
    public void test6() {
        Prime p = new Prime();
        assertEquals(true, p.isPrime(1));
    }
}
