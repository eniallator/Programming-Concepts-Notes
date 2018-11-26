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

- Much more efficient than bubble/insertion/selection

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

```lua
procedure: "merge(A)"
input: "Array A[1...n]"
output: "A sorted"

if n <= 1 then
    return A
else
    MID ⬅ n div 2
    LHS ⬅ merge(A[1...MID])
    RHS ⬅ merge(A[(MID + 1)...n])

    LEFTINDEX ⬅ 1
    RIGHTINDEX ⬅ 1
    for i ⬅ 1 to n do
        if RIGHTINDEX > n - MID + 1 or LEFTINDEX <= MID and LHS[LEFTINDEX] < RHS[RIGHTINDEX] then
            A[i] ⬅ LHS[LEFTINDEX]
            LEFTINDEX ⬅ LEFTINDEX + 1
        else
            A[i] ⬅ RHS[RIGHTINDEX]
            RIGHTINDEX ⬅ RIGHTINDEX + 1
    return A
```

## Efficiency

- Given a problem
  - Is there an algorithm for solving it?
  - Is there an _efficient_ algorithm to solve it?
  - Can I improve on an existing algorithm for it?
- Given an algorithm
  - How efficient is it?
- E.g: summing numbers

```lua
input: "positive integer n"
output: "sum of first n positive numbers"

-- ONE WAY

SUM ⬅ 0
ITER ⬅ 1
while ITER <= n do
    SUM ⬅ SUM + ITER
    ITER ⬅ ITER + 1
return SUM

-- CAN BE IMPROVED TO:

return n * (n + 1) / 2
```

### Measuring Efficiency

- Usuallly depends on size on input
- Efficiency expressed as cost function on size of input
- Comparing algorithms is difficult when size of input is small
- We need measure on the size of inputs
  - Arrays/lists: number of items
  - Numbers: ? often size of binary representation
- Measure of cost of running an algorithm
  - Time taken
  - Space required - less important nowadays
  - Energy consumed - becoming less important

#### Measuring Running Time

- Difficult to use a stopwatch
- Shouldn't be influenced by computer speed
- Shouldn't be influenced by choice of programming language
- Shouldn't be influenced by ability of programmer
- We count number of significant actions
  - Sorting/searching: count number of comparisons between items
  - Summing: count arithmetic operations
- Sometimes difficult to decide

#### Counting Cost Of Summing Numbers

- First version:
  - More than n operations (since bounded loop)
- Second
  - 3 operations

#### Estimating Growth Functions

- Constants dont count:

  | Function |   F    |  G  | G larger than F after |
  | -------- | :----: | :-: | :-------------------: |
  |          |  10n²  | 2n³ |        n > 50         |
  |          | 1000n² | 3n³ |        n > 350        |
  |          | 1000n³ | n⁴  |       n > 1000        |

- Small terms get swamped
- Depends on the largest degree of the polynomial

#### Approximating Growth Functions

- Big theta notation
  - θ(f(n)): all functions which grow at the same rate as f(n)
- g(n) is in θ(f(n)) if:
  - There is a constant, K<sub>g</sub>, such that g(n) <= k<sub>g</sub> \* f(n), once n gets sufficiently large
  - There is a constant, K<sub>f</sub>, such that f(n) <= k<sub>f</sub> \* g(n), once n gets sufficiently large

#### Important Complexity Classes

| Class       |    Theta Notation     |
| ----------- | :-------------------: |
| Constant    |         θ(1)          |
| Logarithmic |       θ(log n)        |
| Linear      |         θ(n)          |
| n-log-n     |      θ(n log n)       |
| Quadratic   |         θ(n²)         |
| Cubic       |         θ(n³)         |
| Polynomial  | θ(nᵏ) for some k >= 1 |
| Exponential |         θ(kⁿ)         |

- Examples:
  - 2 \* n + 6 is in θ(n)
  - 4 + n² + 10 + n + 6 is in θ(n²)

#### Emphasis On Fast Algorithms

- Having a lower complexity class implemented by a bad programmer is much better than having a good programmer who implements a higher complexity class algorithm
- Sequential vs. binary searches
  - 1 billion billion for sequential and 60 for binary
- Merge sort is θ(n log n)
