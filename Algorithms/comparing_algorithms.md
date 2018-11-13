# Notes

```lua
input: "A[1...n]"
output: "boolean that says whether or not A is sorted"

SORTED ⬅ true
PTR ⬅ 1
while PTR + 1 < n and SORTED do
  if A[PTR] > A[PTR + 1] then
    SORTED ⬅ false
  PTR ⬅ PTR + 1

return SORTED
```

- If A <= B, B <= C then A <= C
  - Transitive relation

## Topics

1. Procedures
2. Divide and Conquer
3. Understanding efficiency
4. Analysis

## Code Reuse

### Max

```lua
input: "Arrays A[1...n], B[1...m]"
output: "Array with the largest item"

AMAX ⬅ MAX(A, 1, n)
BMAX ⬅ MAX(B, 1, m)
if AMAX > BMAX then return A else return B
```

- `MAX(A, s, f)` means to call a procedure
  - Named `MAX`
  - With input parameters A, s, f
  - Which calculates the largest item in array A between s and f

```lua
procedure: "MAX(A, s, f)"
input: "Array A, indices s <= f"
output: "Largest item in sub-array A[s...f]"

PTR ⬅ s
CURRMAX ⬅ A[PTR]
while PTR != f do
  PTR ⬅ PTR + 1
  if A[PTR] > CURRMAX then
    CURRMAX ⬅ A[PTR]

return CURRMAX
```

### Sequential Search

```lua
procedure: "seqSearch(A, s, f, M)"
input: "array A, indices s, f, item M"
output: "true if M in A[s...f], false otherwise"

PTR ⬅ s
while A[PTR] != M and PTR < f do
  PTR ⬅ PTR + 1
return PTR <= f and A[PTR] = M
```

### Binary Search

```lua
procedure: "binSearch(A, s, f, M)"
input: "array A, indices s, f, item M"
output: "true if M in A[s...f], false otherwise"

if s > f then
  return false
else
  MID ⬅ (s + f) div 2
  if A[MID] > M then
    return binSearch(A, MID + 1, f, M)
  else if A[MID] < M then
    return binSearch(A, s, MID - 1, M)
  else
    return true
```

### Merge Sort

```javascript
function mergeSort(arr) {
  if (arr.length <= 1) return arr;

  const leftHalf = arr.slice(0, Math.ceil(arr.length / 2));
  const rightHalf = arr.slice(Math.ceil(arr.length / 2), arr.length);

  const leftResult = mergeSort(leftHalf);
  const rightResult = mergeSort(rightHalf);

  const sortedArr = [];

  for (let i = 0; i < arr.length; i++) {
    if (!rightResult.length || (leftResult.length && leftResult[0] < rightResult[0])) sortedArr.push(leftResult.shift());
    else sortedArr.push(rightResult.shift());
  }

  return sortedArr;
}
```
