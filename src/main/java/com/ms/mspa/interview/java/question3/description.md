# Description: Fun with anagrams

Two strings are anagrams if they are permutations of each other. In other words, both strings have the same size and the same characters. For example, "aaagmnrs" is an anagram of "anagrams".

Given an array of strings, remove each string that is an anagram of an earlier string, then return the remaining array in sorted order.

## Example:

str = ['code', 'doce', 'ecod', 'framer', 'frame']

>- "code" and "doce" are anagrams. Remove "doce" from the array and keep the first occurrence "code" in the array.
>- "code" and "ecod" are anagrams. remove "ecod" from the array and keep the first occurrence "code" in the array.
>- "code" and "framer" are not anagrams, keep both in the array.
>- "framer" and "frame" are not anagrams, due to extra 'r' in 'framer', keep both in the array.
>- Order the remaining strings in ascending order : ["code", "frame", "framer"]

## Function Description:

Complete the function funWithAnagrams which takes a String [n]: an array of Strings.
Expected return of a sorted String array.

## 


