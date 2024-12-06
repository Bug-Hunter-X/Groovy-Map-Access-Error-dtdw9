```groovy
def myMethod(Map params) {
  if (params.containsKey("key1")) {
    println params.key1 // Incorrect way to access map values
  }
}

myMethod(key1: "value1")
```