# Answers

## Q1

- a) `not J`
- b) `M and J`
- c) `not J`
- d) `not M or not J` & `not(M and J)` & `not M implies not J` - individuals may be there
- e) `not M or not J`
- f) `M or J`
- g) `not M or not J`
- h) `not M and J`
- i) `not M or not J`

## Q2

- a)
  1. P **implies** (Q **implies** R) - **premise**
  2. P **and** Q - assume
  3. P - **AndElim** 2
  4. Q **implies** R - **modus ponens** 1, 3
  5. Q - **AndElim** 2
  6. R - **modus ponens** 4, 5
  7. (P **and** Q) **implies** R - **ImpIntro** 2 - 6
- b)
  1. P **implies** (P **implies** Q) - **premise**
  2. P - **premise**
  3. (P **implies** Q) - **modus ponens** 1, 2
  4. Q - **modus ponens** 2, 3
- c)
  1. P **implies** Q - **premise**
  2. R **implies** S - **premise**
  3. P - assume
  4. Q - **modus ponens** 1, 3
  5. R - assume
  6. S - **modus ponens** 2, 5
  7. (P **and** R) - **AndIntro**
  8. (Q **and** S) - **AndIntro**
  9. (P **and** R) **implies** (Q **and** S) - **ImpIntro** 3 - 8
- d)
  1. (P **and** Q) **implies** R - premise
  2. (P **and** Q) - assume
  3. Q - **AndElim** 2
  4. R - **modus ponens** 1, 2
  5. Q **implies** R - **ImpIntro** 2 - 4
  6. P - **AndElim** 2
  7. P **implies** (Q **implies** R) - **ImpIntro** 5 - 6
