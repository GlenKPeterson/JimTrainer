import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MediumTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test
    public void forceImports() {
        assertArrayEquals(new Integer[] { 1,2,3, }, new Integer[] { 1,2,3, });
        assertEquals(1, 1);
    }

    // flatMap returns several items for each input item
    @Test
    public void flatMap() {
//        assertArrayEquals(new Integer[] { 1,2,3, 10,20,30, 100,200,300 },
//                          View.ofArray(1, 10, 100)
//                                  .flatMap(i -> View.ofArray(???)).toArray());
    }

    // foldLeft takes a seed value and accumulates a result.
    @Test
    public void foldLeftPlus() {
//        assertEquals((Integer) 15,
//                     View.ofArray(1, 2, 3, 4, 5)
//                             .foldLeft(0, (accum, item) -> ???));
    }

    // 0 was the identity value for "plus", what's the identity value for "times"?
    @Test
    public void foldLeftTimes() {
//        assertEquals((Integer) 120,
//                     View.ofArray(1, 2, 3, 4, 5)
//                             .foldLeft(???, (accum, item) -> accum * item));
    }


    // You can use foldLeft to do the same work as map()
    @Test
    public void foldLeftMap() {
//        assertArrayEquals(new Integer[] { 2, 3, 4, 5 },
//                          View.ofArray(1, 2, 3, 4)
//                                  .foldLeft(new ArrayList<>(), (ls, i) -> {
//                                      ???;
//                                      return ls;
//                                  }).toArray());
    }

}
