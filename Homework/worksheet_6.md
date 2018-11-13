# Answers

## Iteration

### Q1 Palindrome stuff

```lua
input: "A[1...n]"
output: "true if the array is a palindrome"

PTR ⬅ 1
while PTR <= n div 2 and A[PTR] == A[n - PTR + 1] do
  PTR ⬅ PTR + 1

return PTR > n div 2
```

### Q2 Bubble sort while loop version

```lua
input: "Array A[1...n]"
output: "Array A sorted"

PTR ⬅ 1
SORTED ⬅ false
while not SORTED and PTR < do
  SORTED ⬅ true
  for i ⬅ 1 to n - PTR do
    if A[i] > A[i + 1] then
      A[i] ↔ A[i + 1]
      SORTED ⬅ false
  PTR ⬅ PTR + 1
return A
```
