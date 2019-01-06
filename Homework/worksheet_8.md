# Answers

## Q2

- Sort method

```lua
input: "array A[1...n]"
output: "second largest item in A"

for i ⟵ 1 to 2 do
    for j ⟵ i to n - 1 do
        if A[n - j - 1] < A[n - j] then
            A[n - j - 1] ⟷ A[n - j]
return A[2]
```

- Keeping track of variables method

```lua
input: "array A[1...n]"
output: "second largest item in A"

if A[1] < A[2] then
    MAX1 ⟵ A[2]
    MAX2 ⟵ A[1]
else
    MAX1 ⟵ A[1]
    MAX2 ⟵ A[2]
for i ⟵ 3 to n do
    if A[i] > MAX1 then
        MAX2 ⟵ MAX1
        MAX1 ⟵ A[i]
return MAX2
```
