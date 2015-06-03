import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class EasyTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test public void forceImports() {
        assertArrayEquals(new Integer[] { 1,2,3, }, new Integer[] { 1,2,3, });
        assertEquals(1, 1);
    }

    // This test should pass as-is to prove that everything is installed correctly
    @Test public void helloWorld() {
//        assertArrayEquals(new String[] { "Hello", "World" },
//                PersistentVector.of(???).toTypedArray());
    }

    // Construct an array by passing individual arguments to
    @Test public void fromAndToArray() {
//        assertArrayEquals(new String[]{"a", "b", "c"},
//                          PersistentVector.of(???).toTypedArray());
    }

    // Append to that
    @Test public void append() {
//        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"},
//                          PersistentVector.of("a", "b", "c")
//                                  .append(???).toTypedArray());
    }

    // Concatenate a second view (prepend)
    @Test public void prepend() {
//        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"},
//                          PersistentVector.of("d", "e", "f")
//                                  .prepend(???).toTypedArray());
    }

    // Return only the first items
    @Test public void take() {
//        assertArrayEquals(new String[]{"a", "b"},
//                          PersistentVector.of("a", "b", "c", "d", "e", "f")
//                                  .take(??).toTypedArray());
    }

    // Return only the last items
    @Test public void drop() {
//        assertArrayEquals(new String[]{"d", "e", "f"},
//                          PersistentVector.of("a", "b", "c", "d", "e", "f")
//                                  .drop(???).toTypedArray());
    }

    // What are the input values for this anonymous increment function (lambda)?
    @Test public void mapPlus() {
//        assertArrayEquals(new Integer[]{2, 3, 4, 5},
//                          PersistentVector.of(???)
//                                  .map(i -> i + 1).toTypedArray());
    }

    // Fill in this anonymous decrement function (lambda)
    @Test public void mapMinus() {
//        assertArrayEquals(new Integer[]{2, 3, 4, 5},
//                          PersistentVector.of(3, 4, 5, 6)
//                                  .map(i -> ???).toTypedArray());
    }

    // Write an anonymous function that doubles integers
    @Test public void mapDouble() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                          PersistentVector.of(1, 2, 3, 4)
//                                  .map(i -> i * 2).toTypedArray());
    }

    // Write a function to accept only even numbers.  Hint: Use the modulo (%) operator.
    @Test public void filterEven() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                          PersistentVector.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                                  .filter(i -> ???)
//                                  .toTypedArray());
    }

    // Concatenate some strings - try using the new :: method pointer syntax
    @Test public void concat() {
//        StringBuilder sB = new StringBuilder();
//        PersistentVector.of("Little ", "strokes ", "fell ", "great ", "oaks.")
//                .forEach(sB::???);
//        assertEquals("Little strokes fell great oaks.", sB.toString());
    }

    // Chain together two higher order functions
    @Test public void takeAndDropChain() {
//        assertArrayEquals(new String[]{"c"},
//                          PersistentVector.of("a", "b", "c", "d", "e", "f")
//                                  .drop(???)
//                                  .???(1).toTypedArray());
    }

}
