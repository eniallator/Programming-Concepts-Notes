# Notes

- Debugging can only demonstrate that there are bugs rather than the absence of them
- Partial correctness:
  - Partially correct for every legal input
  - If it halts, the output satisfies the required relationship with the original output
- Total correctness:
  - Totally correct for every legal input
  - Halts every time and the output satisfies the required relationship with the original input every time
- Legal input is anything that is within the bounds specified in the `input` section of the algorithm (pseudo-code)

## Assertions

- Mathematical statements about program variables at some specific checkpoint in a program, including `and` and `or`
- E.g pseudo-code

```lua
PTR ⬅ 1
cMAX ⬅ A[PTR]
⇐ "cMAX = 1"
```

### Valid Assertions

- An assertion is valid if it is true of the program variables every time the control passes the checkpoint
- Give one example when it's not valid and then the entire algorithm isn't valid

### Important Assertions

- Initial assertion: Captures requirements on legal inputs
- Final assertion: Determines properties of data output
- Loop assertions: Difficult to assign. Must be true **every** time control goes through the loop
- You can write assertions in ascii like this: `\\assert: foo = bar`

```lua
input: "A[1...n]"
output: "largest ..."

-- Initial Assertion
⇐ "n >= 1"
...
PTR ⬅ 1
cMAX ⬅ A[PTR]
⇐ "cMAX = A[1]"

while PTR != n do
    -- Loop Assertion
    ⇐ "cMAX is largest element in A[1...PTR]"
    PTR ⬅ PTR + 1
    if A[PTR] > cMAX then
        cMAX ⬅ A[PTR]

-- Final Assertion
⇐ "PTR = n"
-- cMAX is largest element in A
⇐ "cMAX >= A[j] for j between 1 and n"
⇐ "cMAX occurs in A"
return cMAX
```

### How We Assign Valid Assertions

- We use
  - Informal mathematical reasoning
    - Can be plain english, as long as there's no ambiguity
  - Loop invariance theorems (invariance is AKA assertion)
- Variant is the thing that changes each time you loop e.g the condition in the pseudo-code in `Important Assertions`

## Termination

- Assertions say nothing about termination
- Final assertion describes properties which are true if the program terminates
- Seperate reasoning needs to be done to assure termination
- Never write a loop without knowing why it will terminate any possible input
- An algorithm:

```lua
input: "number K > 0"
output: "K²"

⇐ "K >= 0"
X ⬅ 0
Y ⬅ 0
while X != K do
    -- Loop invariant uses all variables 😍
    ⇐ "Y = X * K"
    Y ⬅ Y + K
    X ⬅ X + 1
⇐ "Y = K² and x = k"
return Y
⇐ "K² returned"
```

- Reasoning for the `Y = X * K`:
  - Y = X \* K at start of loop
  - Inside the loop body:
    - Y = (X + 1) \* K
    - or Y = XK + K
    - X += 1
    - Works for the next value of X at the start of the loop

## Reasoning About Programming: Floyd-Hoare Logic

- We write {Pre}C{Post}
- Where
  - Pre is a mathematical assertion - the **precondition**
  - Post is a mathematical assertion - the **postcondition**
  - C is some program code
- {Pre}C{Post} is valid if
  - Whenever the precondition is true, and the code is executed
  - if the code terminates, then the postcondition is true

### Examples

| Pre       | Code      | Post       |
| --------- | --------- | ---------- |
| X = Y + 2 | Y ⬅ Y + 1 | X > Y \* 2 |
|           |           |            |
| X = Y + 1 | Y ⬅ Y + X | X > Y \* 2 |
|           |           |            |
| X + Y > K | X ⬅ X + X | Y > k      |
|           | Y ⬅ Y - 1 |            |
|           |           |            |
| X > Y     | X ⬅ X + 1 | X - Y > 0  |
|           | Y ⬅ Y - 1 |            |

## Rules For Applying Valid Assertions

- Elementary logic
  - For manipulating/rearranging the assertions
- Sequential rule
  - For propagating valid assertions through simple actions
- Loop invariant theorems
  - For propagating valid assertions through while and for loops

## While Loop Invariance Theorem

- **while** \*Bool **do** Body
- Suppose Inv
  - Is an invariant
  - Is true before the while statement starts
- Then
  - Whenever the while statement terminates, if ever
    - Inv remains true
    - Bool is false

```lua
⇐ "Inv"
while Bool do
  ⇐ "Inv"
  Body

-- Can be replaced by:

⇐ "Inv"
while Bool do
  ⇐ "Inv"
  Body
⇐ "Inv and not Bool"
```

## Assigning Assertions

```lua
input: "number n >= 1"
output: "sum of first n positive numbers"

⇐ "n >= 1"
PTR ⬅ 1
SUM ⬅ 1
-- SHOULD BE FOR LOOP
⇐ "SUM = PTR"
while PTR != n do
  ⇐ "SUM = 1 + ... + PTR"
  PTR ⬅ PTR + 1
  SUM ⬅ SUM + PTR

⇐ "SUM = 1 + ... + PTR and PTR = n"
return SUM
⇐ "sum of first n positive numbers returned"
Inv SUM = 1 + ... + PTR
```

## Maths Stuff

- Instead of using `1 + ... + PTR`, can use the sigma notation
  - Can use instead for the loop invariant

## Summing Integers: A Variation

```lua
input: "number n >= 1"
output: "sum of first n positive numbers"

⇐ "n >= 1"
PTR ⬅ 1
SUM ⬅ 1
⇐ "SUM = PTR"
while PTR < n do
  ⇐ "SUM = 1 + ... + PTR"
  PTR ⬅ PTR + 1
  SUM ⬅ SUM + PTR

⇐ "SUM = 1 + ... + PTR and PTR >= n"
return SUM
```

- Problem: the assertion is too ambiguous
- To strengthen the invariance:

```lua
input: "number n >= 1"
output: "sum of first n positive numbers"

⇐ "n >= 1"
PTR ⬅ 1
SUM ⬅ 1
⇐ "SUM = PTR and PTR <= n"
while PTR < n do
  ⇐ "SUM = 1 + ... + PTR and PTR <= n"
  PTR ⬅ PTR + 1
  SUM ⬅ SUM + PTR

⇐ "SUM = 1 + ... + PTR and PTR <= n and PTR >= n"
return SUM
⇐ "sum of first n numbers returned"
```

- Know need to have `PTR = n`
- Reverse engineered the loop 😮
- Can either change the algorithm (e.g `while PTR != n`) or strengthen the invariance

## Using For Loops

```lua
input: "Array A[1...n]"
output: "sum of elements in A"

SUM ⬅ 0
⇐ "SUM = 0"
for i ⬅ 1 to n do
  SUM ⬅ SUM + A[i]
  ⇐ "SUM = A[1] + ... + A[i]"

⇐ "SUM = A[1] + ... + A[n]"
return SUM
```

## For Loop Invariance Theorem

- **for** _i_ ⬅ 1 **to** _n_ **do** Body
- Suppose Inv(i) is a mathematical statement about i
  - If Inv(0) is true before the For-statement starts
  - If {Inv(i)} Body {Inv(i + 1)}
  - In english: Inv(i) is preserved by the Body
- Then
  - When the for loop terminates the property Inv(n) is true

```lua
⇐ "Inv(0)"
for i ⬅ 1 to n do
  Body
  ⇐ "Inv(i)"

-- Can be extended to:

⇐ "Inv(0)"
for i ⬅ 1 to n do
  Body
  ⇐ "Inv(i)"
⇐ "Inv(n)"
```

## Summing Up

- Never write down a looping construct unless
  - You have a convincing argument to show it terminates
  - You have established a relevant invariant
  - You document your program with this information
- The arguments don't have to be very formal
- They have to be convincing
- Design algorithms and invariants simultaneously
- A justification before is better than after
