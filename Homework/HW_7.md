# Answers

## Q2

### (a)

```lua
input: "An array A[1...n] of binary digits"
output: "Decimal number corresponding to the binary number represented by A"

RESULT ⟵ 0
for i ⟵ 1 to n do
    RESULT ⟵ RESULT * 2 + A[i]
return RESULT
```

### (b)

```lua
procedure: "baseToDecimal(A, base)"
input: "An array A[1...n] of digits in the given base"
output: "Decimal number corresponding to the number represented by A"

RESULT ⟵ 0
for i ⟵ 1 to n do
    RESULT ⟵ RESULT * base + A[i]
return RESULT
```
