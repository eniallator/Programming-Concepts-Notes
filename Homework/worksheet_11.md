# Answers

## Q1

### 1.a) Code Invariant: {P} Code {P}

| Property P    | Code                   | Answer                                                      |
| ------------- | ---------------------- | ----------------------------------------------------------- |
| X + Y is even | X ⬅ X + 1<br>Y ⬅ Y + 1 | Not necessarily, for instance if<br>X is even and Y is odd. |
| X + Y is odd  | X ⬅ X + 1<br>Y ⬅ Y + 2 | No since it will be even and<br>then odd                    |
| X + Y = _k_   | X ⬅ X + 1<br>Y ⬅ Y - 1 | Yes                                                         |
| X + Y < _k_   | X ⬅ X + 1<br>Y ⬅ Y - 2 | Yes                                                         |
| Y is even     | X ⬅ X + 1<br>Y ⬅ Y + X | No, same answer for X + Y is odd                            |
| X + Y is even | X ⬅ X + 1<br>Y ⬅ Y + 2 | No, same answer for X + Y is odd                            |

## Q2

### 2.a)

```lua
input: "array A[1...n]"
output: "Running minimum array, M[1...n]"

M ⬅ [1...n]
MIN ⬅ A[1]
for i ⬅ 1 to n do
    if A[i] < MIN then
        MIN ⬅ A[i]
    M[i] ⬅ MIN
return M
```

- Linear, θ(n) since it always iterates for n iterations

### 2.b)

- Strengthening an invariant is to make the invariant more precise
- E.g doing it on a factorial algorithm

```lua
input: "k"
output: "k!"

X ⬅ 1
Y ⬅ 1
⇐ Y = X!
while X < k do
    ⇐ Y = X!
    X ⬅ X + 1
    Y ⬅ Y * X
return Y
⇐ Y = X! and X = k so Y = k!
```

## Q3

### 3.a)

- Bubble sort

### 3.b) Propositional Judgements

#### 3.b.i)

- If astrology is a true science, then the economy is improving. Therefore astrology is a true science
  - **A:** Astrology is a science
  - **B:** Economy is improving
  - (A **implies** B) **implies** A
