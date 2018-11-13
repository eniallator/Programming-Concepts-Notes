# Slides

- Check homework that will be up later today
- Things that will be talked about:
  - Essential features of algorithms
  - Data storage/manipulation
  - Control structures
- Suggested reading:
  - Dowek. chap. 1
  - Harel. chap. 1-3

## Purpose Of Algorithms

- Designed for person to person communication
- Programming languages are person to computer communication
- Nevertheless algorithms are meant to be implemented on computers
- Algorithms sit halfway between:

  - Excruciating detail for person to computer communication
  - Informal english used for person to person communication

- Need to eliminate vagueness for example:
  - Make a note of ...
  - Proceed through the list of records ...
  - Find the record of boss in list ...

## Essential Features Of Algorithms

- Data storage and manipulation

  - Make a note of number 0
  - Add salary to noted number
  - Add up resulting numbers
  - Increase the counter
  - Make a note of name of boss

- Control structures

  - Proceed through the employee list ...
  - If salary of boss is less than current employee and then ...
  - When the end of the list is finished ...

- SEQUENCE, SELECTION AND ITERATION

## Data Storage

### Variables

- In pseudo-code
  - Variables are used to store data
  - Variables can be updated:
    - `COUNTER ⬅ 0`
  - Variables can be interrogated:
    - `TOTAL ⬅ SALARY + INCREMENT`
    - `COUNTER ⬅ COUNTER + 1`

### Arrays

- Proceed through the list of records
- Search records for boss of current employee

- Variable: `X` has an `Item`
- Array: `A[1...n]` has an `Item` at each index
- _**1 INDEXED IN PSEUDO-CODE**_

## Control Structures

- Direct sequencing:

  - "Do A then do B then do C then do ..."

- Conditional sequencing:

  - "If something is true, then do A"
  - "If smething is true, do A otherwise do B"

- Bounded iteration:

  - "Do something exactly n times"
  - Number of repetitions is known in advance

- Conditional iteration:

  - "Do something so long as some condition is true"
  - Number of repetitions depends on evaluation of "condition"

- **All available in all programming languages**

## Direct Sequencing

- General format:

```java
  do A
  do B
  do C
```

- Examples:

```java
  // interchange A[i] with A[j]
  TEMP ⬅ A[i]
  A[i] ⬅ A[j]
  A[j] ⬅ TEMP
```

## Conditional Sequencing

- General Formats:

```Lua
if some condition is true then
    do something
```

```Lua
if some condition is true then
    do something
else
    do some other thing
```

- Layout is important

```Lua
if item is taxable then
    if price > limit then
        pay x
    else
        pay y
else
    pay z
```

```Lua
if condition then
    do A
    do B
else
    do C

do D
```

## Bounded Iteration

### General Format

- Do something an exact number of times

```java
for i ⬅ start TO finish do
    something
```

- What things are:

  - i: the iterator. Available to use within the something. Never change the iterator variable
  - start: value at which the iterator starts
  - finish: value at which the iterator ends
  - (Inclusive)

### Bounded Iteration Example

- Summing the first n positive numbers
- Use this as an example format for all algorithms

```lua
input: "positive number n"
output: "sum of first n positive numbers"

SUM ⬅ 0
for i ⬅ 1 TO n do
    SUM ⬅ SUM + i
return SUM
```

- Explanation:
  - **Input**: Description of expected input
  - **Output**: Description of desired output
  - **Return**: What's being returned

## Conditional Iteration

- Perform something repeatedly so long as some condition remains true

- Example summing numbers:

```lua
input: "positive number n"
output: "sum of first n positive numbers"

SUM ⬅ 0
ITER ⬅ 1
while ITER <= n do
    SUM ⬅ SUM + i
    ITER ⬅ ITER + 1
return SUM
```

- Note:

  - ITER needs to be explicitly managed
  - ITER is automatically furnished by for-loop construct

- repeat ... until will come

## Examples

### Calculating A Salary Bill

- Conditional iteration:

```lua
input: "an array E[1 ... n]"
output: "total salary of all employees"
assumptions: "array elements contain salary field"

TOTAL ⬅ 0
PTR ⬅ 1
while PTR <= n do
  TOTAL ⬅ TOTAL + salary(E[PTR])
  PTR ⬅ PTR + 1
return TOTAL

-- Should be bounded iteration
-- PTR is abbreviation for pointer
```

### Counting Happy Employees

```lua
input: "an array E[1 ... n] of employee details"
output: "number of employees earning more than their boss"
assumptions: "array elements contain name, salary, boss fields. Every employee has a boss"

HAPPY ⬅ 0
for i ⬅ 1 to n do
  BOSS ⬅ boss(E[i])
  SALARY ⬅ salary(E[i])

  -- find PTR satisfying BOSS = name(E[PTR])
  PTR ⬅ 1
  while BOSS != name(E[PTR]) do
    PTR ⬅ PTR + 1

  if salary(E[PTR]) < SALARY then
    HAPPY ⬅ HAPPY + 1

return HAPPY
```
