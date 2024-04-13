
# Simplified Syllable Counter

![CI Status](https://github.com/BNW0/simplified-syllable-counter/workflows/CI/badge.svg)
![Deploy Status](https://github.com/BNW0/simplified-syllable-counter/workflows/Deploy/badge.svg)
[![Maven Central version](https://img.shields.io/maven-central/v/eu.crydee/simplified-syllable-counter.svg)](https://search.maven.org/search?q=g:eu.crydee%20a:simplified-syllable-counter)
[![codecov](https://codecov.io/gh/BNW0/simplified-syllable-counter/branch/master/graph/badge.svg)](https://codecov.io/gh/BNW0/simplified-syllable-counter)

This library uses a fallback method—based on the [NLTK readability plugin][nltk] and the algorithm implemented in the [Lingua::EN::Syllable perl module][perl].

The original work on which this is based was done by Thomas Jakobsen, Thomas Skardal, and Greg Fast; their contribution to the open-source community is greatly appreciated.

[nltk]: https://github.com/nltk/nltk_contrib/blob/master/nltk_contrib/readability/syllables_en.py
[perl]: http://search.cpan.org/~neilb/Lingua-EN-Syllable-0.26/

## Requirements

Java 8 and Maven 3 are necessitated for using this library.

## Installation

Visit the [Maven Central page](https://search.maven.org/search?q=g:eu.crydee%20a:simplified-syllable-counter) to find the installation guide for your build tool or to directly download the jar.

## Usage

The library usage is straightforward. Use the `count` method to get the number of syllables in a word:

```java
import eu.crydee.syllablecounter.SyllableCounter;

...

SyllableCounter sc = new SyllableCounter();
int myCount = sc.count("facility");
// myCount holds 4
```