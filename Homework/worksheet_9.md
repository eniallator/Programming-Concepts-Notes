# Answers

## Q1 Distinct Set Of Values

```lua
input: "Array A[1...n]"
output: "true if all items are distinct, false otherwise"

DISTINCT ⬅ true
for i ⬅ 1 to n - 1 do
    for j ⬅ i + 1 to n do
        if A[i] = A[j] then DISTINCT ⬅ false
return DISTINCT
```

- a) Line 4 executed how many times?
  - n-1 + n-2 + ... + 2 + 1
  - n \* (n-1) / 2
- b) Whats the complexity in big theta notation?
  - θ(n²)
- c) Rewrite to not perform useless comparisons

```lua
input: "Array A[1...n]"
output: "true if all items are distinct, false otherwise"

DISTINCT ⬅ true
i ⬅ 1
while DISTINCT and i < n do
    j ⬅ i + 1
    while DISTINCT and j <= n do
        if A[i] = A[j] then DISTINCT ⬅ false
        j ⬅ j + 1
    i ⬅ i + 1
return DISTINCT
```

- d) Change if condition to `A[i] > A[j]`
  - It now checks if the array is sorted in ascending order. However this algorithm can be made more efficient

## Q2 Array Spread

```lua
input: "Array A[1...n]"
output: "The spread of array A"

MIN ⬅ A[1]
MAX ⬅ A[1]
for i ⬅ 2 to n do
    if A[i] > MAX then
        MAX ⬅ A[i]
    if A[i] < MIN then
        MIN ⬅ A[i]
return MAX - MIN
```

- Finds the largest and smallest value in the array. Then subtracts the smallest value from the largest value to get the spread
