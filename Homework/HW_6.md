# Answers

## Q1

```lua
input: "array A[1...n] and item which is an element from A"
output: "the amount of elements <= item from A"

COUNT ⬅ 1
for i ⬅ 1 to n do
  if A[i] <= item then
    COUNT ⬅ COUNT + 1
return COUNT
```

## Q2

```lua
procedure: "getIndex(A, item)"
input: "array A[1...n] and item which is an element from A"
output: "the amount of elements <= item from A"

COUNT ⬅ 1
for i ⬅ 1 to n do
  if A[i] <= item then
    COUNT ⬅ COUNT + 1
return COUNT

---------------------------------------------------

input: "array A[1...n]"
output: "sorted array with A's elements"

B ⬅ [1...n]
for i ⬅ 1 to n do
  INDEX ⬅ getIndex(A, A[i])
  B[INDEX] ⬅ A[i]
return B
```
