# Slides

## How To Solve A Problem

1. Understand the problem
2. Devise a plan for solving the problem
3. Carry out the plan
4. Evaluate the solution for accuracy

- Steps aren't sequential
  - 1 always comes first
  - during 3, may realise 1 isn't achieved
  - during 3, may realise 2 is incorrect

## Developing An Algorithm

1. Understand the problem
2. Get an idea (of how an algorithm might solve problem)
3. Check out idea
4. Formulate idea as an algorithm
5. Evaluate algorithm for correctness, efficiency
6. Implement algorithm in favourite programminPTRg language

- **Caveat**:
  - There are no algorithms for developing algorithms

### Understand The Problem

- Check problem specification
- Does it make sense?
- Boundary cases?
- Tackle simple instances

### Get An Idea

- Where from?
- There are no good algorithms for getting ideas

### Two General Approaches

- Top down problem solving (divide and conquer)

  - Reduce problem into sub problems
  - Tackle sub problems
  - Eventually end up with trivial problems
  - **Caveat**:
    - Not necessarily sequential
    - Reduction to sub problems may not work

- Bottom up problem solving

  1. Think directly about the problem itself
  2. Examine simple instances
  3. Solve simple/trivial instances of problem
  4. Research algorithmic solutions to similar problems in literature
  5. **Go on to slides to get the rest**

## Searching An Array

- Straightforward:
  - Scan through the array A
  - Compare each element in turn with M

```lua
input: "array A[1...n] and item M"
output: "true if M occurs in A, false if M doesn't occur in A"

-- Can't ever break/continue a while or for loop in pseudo-code
FOUND ⟵ false
for i ⟵ 1 to n do
    if A[i] = M then
        FOUND ⟵ true
return FOUND

-- Alternative while loop implementation
FOUND ⟵ false
PTR ⟵ 1
while not FOUND and PTR <= n do
    if A[PTR] = M then
        FOUND ⟵ true
    PTR ⟵ PTR + 1
return FOUND
```

- For loop properties

  - Does many unecessary comparisons
  - On average, doesn't need to compare entire array

- While loop condition could be:

  - not (FOUND or PTR > n)
  - FOUND = false and PTR <= n

- If array sorted, you can exit the while when the current value > than M

## Sorting Algorithms

- A <= B, B <= C then A <= C
  - [Transitive Relation](https://en.wikipedia.org/wiki/Transitive_relation)

### Sorting: We Need An Idea

#### Problem Specification

- Input: array A[1...n]
- Required output: A sorted
- Constraint: Sorting to be in situ

#### Understanding It

- Only interchanges within A allowed

#### Do Simple Instances

- C D A B ⟶ A B C D
- M A G D ⟶ A D G M

#### Isolate Effective Interchanges

- First most effective interchange
  - Interchange A[1] with smallest element
- Second most effective interchange
  - Interchange A[2] with second smallest element
- ETC.

### Pseudo-Code

- Swap operation notation: ⟷

```lua
input: "An array A[1...n]"
output: "Array A[1...n] sorted in ascending order"

for i ⟵ 1 to (n - 1) do
    -- Maintains A[1...i] sorted
    MINPTR ⟵ i
    for j ⟵ (i + 1) to n do
        -- Finds smallest item in A[i...n]
        if A[j] < A[MINPTR] then
            MINPTR ⟵ j
    A[i] ⟷ A[MINPTR] -- Swap items
return A
```

- Evaluate algorithm for correctness, efficiency
  - Last iteration is unecessary since swapping last element with itself

## Sorting Arrays: Another Idea

- If two elements are out of order, then swap them to make the array sorted
- Scan through the array switching all offending contiguous pairs

### Pseudo Code

```lua
input: "An array A[1...n]"
output: "Array A[1...n] sorted in ascending order"

for i ⟵ 1 to n - 1 do
    for j ⟵ 1 to n - i do
        if A[j] > A[j + 1] then
            A[j] ⟷ A[j + 1]
```
