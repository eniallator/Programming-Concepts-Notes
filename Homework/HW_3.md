# Homework

## Parts

### a) Design an algorithm, using the Repeat construct, for summing the contents of a non-empty array A[1...n] of numbers

```lua
input: "array: A[1...n]"
output: "the sum of all the elements in array A"
assumptions: "Array A has atleast 1 element"

SUM ⟵ 0
PTR ⟵ 1
repeat
    SUM ⟵ SUM + A[PTR]
    PTR ⟵ PTR + 1
until PTR > n
return SUM
```

### b) Use the Repeat construct to describe an algorithm for finding the largest item in a non-empty array A[1...n] of numbers

```lua
input: "array: A[1...n]"
output: "The largest element in array A"
assumptions: "INFINITY is the mathematical concept of infinity"

LARGEST ⟵ -INFINITY
PTR ⟵ 1
repeat
    if A[PTR] > LARGEST then
        LARGEST ⟵ A[PTR]
    PTR ⟵ PTR + 1
until PTR > n
return LARGEST
```

### c) Show that the repeat until construct is actually unnecessary. That is, regardless of what Cond and Body are, there is an equivalent program which uses the other constructs of pseudo-code

```lua
-- Equivalent to the repeat until construct using a while loop.

FIRST ⟵ true
while FIRST or Cond do
    Body()
    FIRST ⟵ false
```

### d) Same thing as c but a for loop

```lua
-- Equivalent to for loop but using a while loop

ITER ⟵ START
while ITER < FINISH do
    body()
    ITER ⟵ + 1
```
