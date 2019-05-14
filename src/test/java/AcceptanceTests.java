import com.coding.CarImpl;
import com.coding.CarPark;
import org.junit.Test;

public class AcceptanceTests {


    /**
     * Given the Car is in position X = 1 and Y = 1 and facing North, when the Car turns clockwise,
     * then the Car is still in the same position but is now facing East
     */
    @Test
    public void test1() {
        CarPark carPark = new CarPark(4, 4);
        CarImpl car1 = new CarImpl(1, 1, "N", carPark);
        car1.move("clockwise");
        System.out.println(car1.toString());
    }

    /**
     * Given the Car is in position X = 1 and Y = 1 and facing North, when the Car moves forward,
     * then the Car is still facing North but is now in position X = 1 and Y = 2
     */
    @Test
    public void test2() {
        CarPark carPark = new CarPark(4, 4);
        CarImpl car2 = new CarImpl(1, 1, "N", carPark);
        car2.move("forward");
        System.out.println(car2.toString());
    }

    /**
     * Given the Car is in position X = 1 and Y = 1 and facing East, when the Car moves forward,
     * then the Car is still facing East but is now in position X = 2 and Y = 1
     */
    @Test
    public void test3() {
        CarPark carPark = new CarPark(4, 4);
        CarImpl car3 = new CarImpl(1, 1, "E", carPark);
        car3.move("forward");
        System.out.println(car3.toString());
    }

    /**
     * Given the Car is in position X = 1 and Y = 1 and facing East, when the Car moves forward twice,
     * then the Car is still facing East but is now in position X = 3 and Y = 1
     */
    @Test
    public void test4() {
        CarPark carPark = new CarPark(4, 4);
        CarImpl car4 = new CarImpl(1, 1, "E", carPark);
        car4.move("forward");
        car4.move("forward");
        System.out.println(car4.toString());
    }

    /**
     * Given the Car is in position X = 1 and Y = 1 and facing West, when the Car moves forward,
     * then an exception is thrown
     */
    @Test
    public void test5() {
        CarPark carPark = new CarPark(4, 4);
        CarImpl car5 = new CarImpl(1, 1, "W", carPark);
        car5.move("forward");
        System.out.println(car5.toString());
    }
}
