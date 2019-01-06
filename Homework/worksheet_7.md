# Answers

## Q3 Bitonic Thing

```lua
input: "array A[1...n]"
output: "boolean where true is returned if the array is bitonic, false otherwise"

DECREASING ⟵ false
FLAG ⟵ n < 3
i ⟵ 1
while not FLAG and i < n do
  FLAG ⟵ A[i] = A[i + 1]
  if not DECREASING then
    DECREASING ⟵ A[i] > A[i + 1]
  else
    FLAG ⟵ FLAG or A[i] < A[i + 1]
  i ⟵ i + 1

return not FLAG and DECREASING
```
