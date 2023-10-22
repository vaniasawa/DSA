# Trie: Introduction

- Used for storing and locating keys from a set
- Each key is a string, each node is a single character from the string
- Kind of like a keybunch
- Search: Depth-First Search
- Words with the same prefix/stem share the memory area that corresponds to the prefix
- Tries are more efficient for storing and searching strings - Maximum depth of the trie will be the maximum length of a word/string

Eg.
1. Longest common prefix
2. Search Suggestions

## Does my Problem Match this Pattern?

Yes, if either of these conditions is fulfilled -

1. We need to compare two strings to detect partial matches, based on the initial characters of one or both strings
2. Optimize the space used to store a dictionary of words. Storing shared prefixes once allows for significant savings.

No, if any one of these conditions is fulfilled -

1. Problem statement restricts us from breaking down the strings into individual characters.
2. Partial matches between pairs of strings are not significant to solving the problem.

## Real-world problems

- Autocomplete Systems: Search Engines (Google) - Giving suggestions to complete our query
- Orthographic Corrector: Pop-up suggestions/red lines under a word - Spelling mistakes in Word Documents.