import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.organicdesign.fp.ephemeral.View;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class EasyTest {
    // This test should pass as-is to prove that everything is installed correctly
    @Test public void helloWorld() {
        assertArrayEquals(new String[] { "Hello World" },
                View.ofArray("Hello World").toArray());
        assertEquals("Hello World", "Hello World");
    }
    // Construct an array by passing individual arguments to View
    @Test public void fromAndToArray() {
//        assertArrayEquals(new String[] { "a", "b", "c" },
//                View.ofArray(???).toArray());
    }

    // Concatenate a second view (append)
    @Test public void append() {
//        assertArrayEquals(new String[] { "a", "b", "c", "d", "e", "f" },
//                View.ofArray("a", "b").append(View.ofArray(???)).toArray());
    }

    // Concatenate a second view (prepend)
    @Test public void prepend() {
//        assertArrayEquals(new String[] { "a", "b", "c", "d", "e", "f" },
//                View.ofArray("d", "e", "f").prepend(???).toArray());
    }

    // Return only the first two items
    @Test public void take() {
//        assertArrayEquals(new String[] { "a", "b" },
//                View.ofArray("a", "b", "c", "d", "e", "f").???.toArray());
    }

    // Return only the last three items
    @Test public void drop() {
//        assertArrayEquals(new String[] { "d", "e", "f" },
//                View.ofArray("a", "b", "c", "d", "e", "f").???.toArray());
    }

    // What are the input values for this anonymous increment function (lambda)?
    @Test public void mapPlus() {
//        assertArrayEquals(new Integer[] { 2, 3, 4, 5 },
//                View.ofArray(???).map(i -> i + 1).toArray());
    }

    // Fill in this anonymous decrement function (lambda)
    @Test public void mapMinus() {
//        assertArrayEquals(new Integer[] { 2, 3, 4, 5 },
//                View.ofArray(3, 4, 5, 6).map(i -> ???).toArray());
    }

    // Write anonymous function that doubles integers
    @Test public void mapDouble() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                View.ofArray(1, 2, 3, 4).map(???).toArray());
    }

    // Write a function to accept numbers that match a certain test
    @Test public void filterEven() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                View.ofArray(1,2,3,4,5,6,7,8,9)
//                        .filter(i -> ???).toArray());
    }

    // Concatenate some strings - try using the new :: method pointer syntax
    @Test public void concat() {
//        StringBuilder sB = new StringBuilder();
//        View.ofArray("Little ", "strokes ", "fell ", "great ", "oaks.").forEach(???);
//        assertEquals("Little strokes fell great oaks.", sB.toString());
    }

    // Chain together two higher order functions
    @Test public void takeAndDropChain() {
//        assertArrayEquals(new String[] { "c" },
//                          View.ofArray("a", "b", "c", "d", "e", "f")
//                                  .drop(???).take(???).toArray());
    }

}
