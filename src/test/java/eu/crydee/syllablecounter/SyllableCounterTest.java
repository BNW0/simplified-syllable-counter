/*
 * Copyright 2015 m09.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.crydee.syllablecounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author m09
 */
public class SyllableCounterTest {

    private final static String EXCEPTIONS_PATH = "/eu/crydee/syllablecounter/english-exceptions.txt",
            TEST_PATH = "/eu/crydee/syllablecounter/english-test.txt";

    /**
     * Test of count method, of class SyllableCounter.
     */
    @Test
    public void testCountFromTestFile() {
        System.out.println("count from test file");
        testFromFile(TEST_PATH);
  