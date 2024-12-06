# Groovy Map Access Bug

This repository demonstrates a common error when accessing values in Groovy maps.  The incorrect approach uses the dot notation directly on the map, which fails silently or throws exceptions depending on Groovy's settings and the map's contents.  The solution uses the correct bracket notation or the `get()` method for reliable value retrieval. 