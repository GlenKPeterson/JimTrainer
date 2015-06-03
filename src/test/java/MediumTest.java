import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MediumTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test public void forceImports() {
        assertArrayEquals(new Integer[] { 1,2,3, }, new Integer[] { 1,2,3, });
        assertEquals(1, 1);
    }

    // foldLeft takes a seed value and accumulates a result.
    @Test public void foldLeftPlus() {
//        assertEquals((Integer) 15,
//                     PersistentVector.of(1, 2, 3, 4, 5)
//                             .foldLeft(0, (accum, item) -> accum + ???));
    }

    // 0 was the identity value for "plus", what's the identity value for "times"?
    @Test public void foldLeftTimes() {
//        assertEquals((Integer) 120,
//                     PersistentVector.of(1, 2, 3, 4, 5)
//                             .foldLeft(???, (accum, item) -> accum * item));
    }

    // Given the right seed value, foldLeft can find a maximum number
    @Test public void findMax() {
//        assertEquals((Integer) 73,
//                PersistentVector.of(-201, 53, 73, 26, -59, 72)
//                        .foldLeft(???, (max, i) -> (i > max) ? i : max));
    }

    // or a minimum
    @Test public void findMin() {
//        assertEquals(Integer.valueOf(-201),
//                PersistentVector.of(-201, 53, 73, 26, -59, 72)
//                        .foldLeft(Integer.MAX_VALUE, (min, i) -> ???));
    }

        // You can use foldLeft to do the same work as map() (but use map() in practice)
    @Test public void foldLeftMapLike() {
//        assertArrayEquals(new Integer[]{2, 3, 4, 5},
//                          PersistentVector.of(1, 2, 3, 4)
//                                  .foldLeft(new ArrayList<>(), (ls, i) -> {
//                                      ???;
//                                      return ls;
//                                  }).toArray());
    }

    // foldLeft can do the work of flatMap() too (but use flatMap() in practice)
    @Test public void foldLeftFlatMapLike() {
//        assertArrayEquals(new Integer[] { 1,2,3, 10,20,30, 100,200,300 },
//                          PersistentVector.of(1, 10, 100)
//                                  .foldLeft(new ArrayList<>(), (ls, i) -> {
//                                      ls.add(???);
//                                      ls.add(???);
//                                      ls.add(???);
//                                      return ls;
//                                  }).toArray());
    }

    // Here we use map() to return a list of results for each input item.
    // This will result in a list of lists, AKA a 2-dimensional list
    @Test public void twoDimenMap() {
//        List<List<Integer>> result = new ArrayList<>();
//        result.add(Arrays.asList(1, 2, 3));
//        result.add(Arrays.asList(10, 20, 30));
//        result.add(Arrays.asList(100, 200, 300));
//
//        assertArrayEquals(result.toArray(),
//                          PersistentVector.of(1, 10, 100)
//                                  .map(i -> unList(i, ???, ???)).toTypedArray());
    }

    // flatMap returns several items for each input item (as opposed to a sub-list
    // of items like the above example).  You could also think of it as "flattening"
    // any sub-lists into a single one-dimensional list.
    @Test public void flatMap() {
//        assertArrayEquals(new Integer[] { 1,2,3, 10,20,30, 100,200,300 },
//                          PersistentVector.of(1, 10, 100)
//                                  .flatMap(i -> Sequence.of(?????)).toTypedArray());
    }
}
