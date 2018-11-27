# Answers

## Q1 Partitioning Arrays

- a) Pseudo-code for partitioning (for quick sort)

```lua
input: "Array A[1...n]"
output: "Partitioned version of array A"

PTR ⬅ 1
for i ⬅ 2 to n do
    if A[i] <= A[PTR] then
        LASTVAL ⬅ A[PTR]
        A[PTR] ⬅ A[i]
        PTR ⬅ PTR + 1
        for j ⬅ PTR to i do
            A[j] ↔ LASTVAL
    ⇐ "A[j ∈ {1...PTR-1}] <= A[PTR] and A[j ∈ {PTR+1...i}] > A[PTR]"
return A
⇐ "A[j ∈ {1...PTR-1}] <= A[PTR] and A[j ∈ {PTR+1...n}] > A[PTR]"
```

- c) Complexity of the algorithm
  - θ(n²)
