import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleFeatureTest {

    @Test
    void smallCircle_containsIntPoint() {
        assertTrue(CircleFeature.Small.contains(11.96,1.7));
        assertTrue(CircleFeature.Small.contains(9.4,1));
        assertTrue(CircleFeature.Small.contains(10.6,2));
        assertTrue(CircleFeature.Small.contains(11.001,2.75));
    }
    @Test
    void largeCircle_containsIntPoint() {
        assertTrue(CircleFeature.Large.contains(13,11));
        assertTrue(CircleFeature.Large.contains(12.97,10));
        assertTrue(CircleFeature.Large.contains(14.641,8.903));
        assertTrue(CircleFeature.Large.contains(20.86,12.9));
    }
    @Test
    void smallCircle_Boundary() {
        assertTrue(CircleFeature.Small.contains(14,1));
        assertTrue(CircleFeature.Small.contains(8,1));
        assertTrue(CircleFeature.Small.contains(11,4));
        assertTrue(CircleFeature.Small.contains(11,-2));
    }
    @Test
    void largeCircle_DoesNotContain() {
        assertFalse(CircleFeature.Large.contains(10.9999,12));
        assertFalse(CircleFeature.Large.contains(17,5.8));
        assertFalse(CircleFeature.Large.contains(17.29,18.98));
        assertFalse(CircleFeature.Large.contains(23.1,12.93));
    }
    @Test
    void smallCircle_DoesNotContain() {
        assertFalse(CircleFeature.Small.contains(0, 12));
        assertFalse(CircleFeature.Small.contains(31, 903));
        assertFalse(CircleFeature.Small.contains(8, 5));
        assertFalse(CircleFeature.Small.contains(7.999, 4.01));
    }
}