import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void largerRectangle_containsInteriorPoint() {
        assertTrue(Rectangle.LARGER.contains(10, 10));
    }

    @Test
    void largerRectangle_containsBoundaryPoints() {
        assertTrue(Rectangle.LARGER.contains(2, 3));    // lower-left
        assertTrue(Rectangle.LARGER.contains(24, 19));  // upper-right
        assertTrue(Rectangle.LARGER.contains(2, 10));   // left edge
        assertTrue(Rectangle.LARGER.contains(24, 10));  // right edge
        assertTrue(Rectangle.LARGER.contains(10, 3));   // bottom edge
        assertTrue(Rectangle.LARGER.contains(10, 19));  // top edge
    }

    @Test
    void largerRectangle_doesNotContainOutsidePoints() {
        assertFalse(Rectangle.LARGER.contains(1.999, 10));   // left
        assertFalse(Rectangle.LARGER.contains(24.001, 10));  // right
        assertFalse(Rectangle.LARGER.contains(10, 2.999));   // below
        assertFalse(Rectangle.LARGER.contains(10, 19.001));  // above
    }

    @Test
    void smallerRectangle_containsInteriorAndBoundaryPoints() {
        assertTrue(Rectangle.SMALLER.contains(10, 0));   // interior
        assertTrue(Rectangle.SMALLER.contains(7, -5));   // lower-left
        assertTrue(Rectangle.SMALLER.contains(18, 3));   // upper-right
        assertTrue(Rectangle.SMALLER.contains(7, 0));    // left edge
        assertTrue(Rectangle.SMALLER.contains(18, 0));   // right edge
        assertTrue(Rectangle.SMALLER.contains(10, -5));  // bottom edge
        assertTrue(Rectangle.SMALLER.contains(10, 3));   // top edge
    }

    @Test
    void smallerRectangle_doesNotContainOutsidePoints() {
        assertFalse(Rectangle.SMALLER.contains(6.999, 0));    // left
        assertFalse(Rectangle.SMALLER.contains(18.001, 0));   // right
        assertFalse(Rectangle.SMALLER.contains(10, -5.001));  // below
        assertFalse(Rectangle.SMALLER.contains(10, 3.001));   // above
    }


}