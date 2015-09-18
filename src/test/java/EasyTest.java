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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.organicdesign.fp.StaticImports.vec;

/**
 In each of the examples below, replace the ??? to make the test pass.
 */
@RunWith(JUnit4.class)
public class EasyTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test public void forceImports() {
        assertArrayEquals(new Integer[] { 1,2,3, }, new Integer[] { 1,2,3, });
        assertEquals(1, 1);
        vec(1);
    }

    // Construct a list by passing individual arguments to vec
    @Test public void fromAndToArray() {
//        assertArrayEquals(new String[]{"a", "b", "c"},
//                          vec(???).toArray());
    }

    // Append to that
    @Test public void append() {
//        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"},
//                          vec("a", "b", "c")
//                                  .concat(vec(???)).toArray());
    }

    // Concatenate a second vector to the beginning (prepend)
    @Test public void prepend() {
//        assertArrayEquals(new String[]{"a", "b", "c", "d", "e", "f"},
//                          vec("d", "e", "f")
//                                  .precat(vec(???)).toArray());
    }

    // Return only the first items
    @Test public void take() {
//        assertArrayEquals(new String[]{"a", "b"},
//                          vec("a", "b", "c", "d", "e", "f")
//                                  .take(???).toArray());
    }

    // Return only the last items
    @Test public void drop() {
//        assertArrayEquals(new String[]{"e", "f"},
//                          vec("a", "b", "c", "d", "e", "f")
//                                  .drop(???).toArray());
    }

    // What are the input values for this anonymous increment function (lambda)?
    @Test public void mapPlus() {
//        assertArrayEquals(new Integer[]{2, 3, 4, 5},
//                          vec(???)
//                                  .map(i -> i + 1).toArray());
    }

    // Fill in this anonymous decrement function (lambda)
    @Test public void mapMinus() {
//        assertArrayEquals(new Integer[]{2, 3, 4, 5},
//                          vec(3, 4, 5, 6)
//                                  .map(i -> ???).toArray());
    }

    // Write an anonymous function that doubles integers
    @Test public void mapDouble() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                          vec(1, 2, 3, 4)
//                                  .map(i -> ???).toArray());
    }

    // Write a function to accept only even numbers.  Hint: Use the modulo (%) operator.
    @Test public void filterEven() {
//        assertArrayEquals(new Integer[]{2, 4, 6, 8},
//                          vec(1, 2, 3, 4, 5, 6, 7, 8, 9)
//                                  .filter(i -> ???)
//                                  .toArray());
    }

    // Chain transformations together (fill in the name of the first function)
    @Test public void takeAndDropChain() {
//        assertEquals(Option.of("c"),
//                     vec("a", "b", "c", "d", "e", "f")
//                             .???(2)
//                             .head());
    }

}
