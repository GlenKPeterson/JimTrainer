// Copyright 2014 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.organicdesign.fp.StaticImports.vec;

@RunWith(JUnit4.class)
public class MediumTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test public void forceImports() {
        assertEquals(1, 1);
        vec(0);
    }

    // foldLeft takes a seed value and accumulates a result.
    @Test public void foldLeftPlus() {
//        assertEquals((Integer) 15,
//                     vec(1, 2, 3, 4, 5)
//                             .foldLeft(0, (accum, item) -> accum + ???));
    }

    // 0 was the identity value for "plus", what's the identity value for "times"?
    @Test public void foldLeftTimes() {
//        assertEquals((Integer) 120,
//                     vec(1, 2, 3, 4, 5)
//                             .foldLeft(???, (accum, item) -> accum * item));
    }

    // Given a reasonable seed value, foldLeft can find a maximum number
    @Test public void findMax() {
//        assertEquals(Integer.valueOf(-26),
//                vec(-201, -53, -73, Integer.MIN_VALUE + 1, -26, -59, -72)
//                        .foldLeft(??, (max, i) -> (i > max) ? i : max));
    }

    // or a minimum
    @Test public void findMin() {
//        assertEquals(Integer.valueOf(-201),
//                vec(-201, 53, 73, 26, -59, 72)
//                        .foldLeft(Integer.MAX_VALUE, (min, i) -> ???));
    }

    // You can use foldLeft to do the same work as map() (but use map() in practice)
    // Instead of putting the math in a map function, put it somewhere else.
    @Test public void foldLeftMapLike() {
//        assertEquals(vec(2, 3, 4, 5),
//                     vec(1, 2, 3, 4)
//                             .foldLeft(vec(), (list, i) -> list.append(???))
//                             .toImList());
    }

    // foldLeft can do the work of flatMap() too (but use flatMap() in practice)
    @Test public void foldLeftFlatMapLike() {
//        assertEquals(vec(1,2,3, 10,20,30, 100,200,300),
//                     vec(1, 10, 100)
//                             .foldLeft(vec(),
//                                       (ls, i) -> ls.append(???)
//                                                    .append(???)
//                                                    .append(???))
//                             .toImList());
    }

    // Here we use map() to return a list of results for each input item.
    // This will result in a list of lists, AKA a 2-dimensional list
    @Test public void twoDimenMap() {
//        assertEquals(vec(vec(1, 2, 3),
//                         vec(10, 20, 30),
//                         vec(100, 200, 300)),
//                     vec(1, 10, 100)
//                             .map(i -> vec(???, ???, ???))
//                             .toImList());
    }

    // flatMap returns several items for each input item (as opposed to a sub-list
    // of items like the above example).  You could also think of it as "flattening"
    // any sub-lists into a single one-dimensional list.
    @Test public void flatMap() {
//        assertEquals(vec(1,2,3, 10,20,30, 100,200,300),
//                     vec(1, 10, 100)
//                             .flatMap(i -> vec(???))
//                             .toImList());
    }
}
