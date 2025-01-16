```groovy
def calculate(a, b) {
  if (b == 0) {
    return 0 // or handle it differently, e.g., throw a custom exception
  } else {
    return a / b
  }
}

println calculate(10, 0) // Returns 0
println calculate(10, 2) // Returns 5
```