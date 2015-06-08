// Copyright 2015 PlanBase Inc. & Glen Peterson
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
import org.organicdesign.fp.collections.ImList;
import org.organicdesign.fp.collections.ImMapOrdered;
import org.organicdesign.fp.collections.PersistentTreeMap;
import org.organicdesign.fp.collections.PersistentVector;
import org.organicdesign.fp.collections.UnMap.UnEntry;
import org.organicdesign.fp.tuple.Tuple2;

import java.awt.*;
import java.util.Comparator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class EasyCollectionsTest {

    // Nothing to do here.  Just keeps IDEs from forgetting the imports.
    @Test public void forceImports() {
        assertArrayEquals(new Integer[] { 1,2,3, }, new Integer[] { 1,2,3, });
        assertEquals(1, 1);
    }

    // It's easy to create a vector and add more items to the end.
    @Test public void vector1() {
//        PersistentVector<Integer> pv = PersistentVector.of(1, 2);
//        pv = pv.append(???);
//        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 },
//                          pv.toTypedArray());
    }

    // Create a vector adding items conditionally
    @SuppressWarnings("ConstantConditions")
    @Test public void vector2() {
//        boolean includeFirst = true;
//        boolean includeSecond = ???;
//        boolean includeThird = ???;
//        boolean includeFourth = ???;
//        boolean includeFifth = true;
//        assertArrayEquals(new Integer[] { 1, 3, 5 },
//                          PersistentVector.ofSkipNull(includeFirst ? 1 : null,
//                                                      includeSecond ? 2 : null,
//                                                      includeThird ? 3 : null,
//                                                      includeFourth ? 4 : null,
//                                                      includeFifth ? 5 : null)
//                                  .toTypedArray());
    }


//    public static enum ColorVal {
//        RED('R'),
//        ORANGE('O'),
//        YELLOW('Y'),
//        GREEN('G'),
//        BLUE('B'),
//        INDIGO('I'),
//        VIOLET('V'),
//        PINK('P');
//        private final Character ch;
//        ColorVal(Character c) { ch = c; }
//        public Character ch() { return ch; }
//
//        public static Comparator<ColorVal> COMPARATOR = (ColorVal a, ColorVal b) -> a.ordinal() - b.ordinal();
//
//        static ImList<ColorVal> valsAsList = PersistentVector.ofIter(Arrays.asList(values()));
//
//        private static ImMapOrdered<Character,ColorVal> charToColorMap =
//                valsAsList.toImMap(new Function1<ColorVal,Map.Entry<Character,ColorVal>>() {
//                    @Override
//                    public Map.Entry<Character,ColorVal> applyEx(ColorVal colorVal) throws Exception {
//                        Map.Entry<Character,ColorVal> e = Tuple2.of(colorVal.ch(), colorVal);
//                        return e;
//                    }
//                });
//
//        public static ColorVal fromChar(Character c) { return charToColorMap.get(c); }
//    }

    public static void println(Object s) { System.out.println(String.valueOf(s)); }

    public static Comparator<Color> COLOR_COMP =
            (a, b) -> (a.getRed() + a.getGreen() + a.getBlue()) - (b.getRed() + b.getGreen() + b.getBlue());

    @Test public void colorSquare() {
        ImList<Color> imgData = PersistentVector.empty();
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                imgData = imgData.append(new Color(i, j, 255));
            }
        }
        println("imgData: " + imgData);

        ImMapOrdered<Color,Integer> counts = imgData
                .foldLeft(PersistentTreeMap.ofComp(COLOR_COMP),
                          (accum, c) -> accum.assoc(c, accum.getOrElse(c, 0) + 1));

        println("counts: " + counts);

        UnEntry<Color,Integer> mostPopularColor = counts
                .foldLeft((UnEntry<Color,Integer>) Tuple2.of((Color) null, 0),
                          (max, entry) ->
                                  (entry.getValue() > max.getValue()) ? entry : max);

        println("mostPopularColor: " + mostPopularColor);
        println("number of unique colors: " + counts.size());
    }
}
