```groovy
def myMethod(Map params) {
  if (params.containsKey("key1")) {
    println params["key1"] // Correct way using bracket notation
  }
}

myMethod(key1: "value1")

def myMethod2(Map params) {
  if (params.containsKey("key1")) {
    println params.get("key1") // Another correct way using get() method
  }
}

myMethod2(key1: "value1")
```