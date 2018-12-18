# Notes

## Propositions

- Britain is an island
- Every island can be circumnavigated
- If a set is non-empty, it contains an element
- All martians like pepperoni on their pizza
- The factorial of 6 is 27

## Non-Propositions

- Could you pass the salt?
- Vote for christ

## False Reasoning Principles

- **By superiority:** 298743 is prime because I said so
- **By similarity:** This proposition is true because it's close to one I've already proved
- **By obviousness:** Obvious!
- **By rumour:** I read somewhere on the internet that this proposition was true
- **By intimidation:** This is so trivial
- **By plausibility:** Sounds reasonable

## Deductive Argument

- Example:
  - **S1:** Britain is an island
  - **S2:** Every island can be circumnavigated
  - Therefore:
  - **S3:** Britain can be circumnavigated
- A sequence of propositions, each one of which is either a premise, which is taken for granted, or follows logically from the previous ones.

### Are These Valid

- If Abraham Lincoln was Ethiopian, then he was African. Abaham Lincoln was not African. Therefore he was not Ethiopian.
- If it's cloudy, then it's going to rain. If it is going to rain, then I should take my raincoat with me. Therefore if it is cloudy, I should take my raincoat with me.

## Logical Structure Of Propositions

- Elementary or atomic:
  - Britain is an island
  - Can **not** be broken down further into propositions
- Decomposition:
  - Cats and Dogs are here
  - Can be decomposed into:
  - Cats are here **and** Dogs are here
- **Conjunction, and:** Jill is twelve **and** Jack is fourteen
- **Disjunction, or:** I am going to the movies **or** I am going to the pub
- **Negation, not:** I am **not** going to the movies
- **Implication, implies:** x is fourteen **implies** y must be greater than 2

## Propositional Meta-Variables

- If Abraham Lincoln was Ethiopian, then he was African. Abraham Lincoln was not African. Therefore he was not Ethiopian.
- Atomic Propositions:
  - **A:** Abaham Lincoln was Ethiopian
  - **B:** Abaham Lincoln was African
- Formal Argument:
  - Given premises:
  - A **implies** B
  - **not** B
  - Is **not** A a logical consequence?

## Notation

- S₁, S₂, ... , Sₙ ⊢ P
- Means:
  - There is a valid logical argument with which we can derive the proposition P from the finite set of premises S₁, ... Sₙ
- Question:
  - How can we develop valid logical arguments?

## Establishing Conjunctive Propositions

- Rules for introducing **and**
- To establish P **and** Q
  1. Establish P
  2. Establish Q
  3. Establish (P **and** Q)
- Fancy name: Conjunction Introduction - **AndIntro**

### How To Use Conjunctions? - and

- How do we make use of (P **and** Q)?:
  - From (P **and** Q) we can conclude P
  - From (P **and** Q) we can conclude Q
- Fancy name: conjunction elimination: **AndElim** all very obvious

### Proof Using And

- P **and** Q, R ⊢ Q **and** R
- A proof:
  1. P **and** Q - Premise (been given this)
  2. R - Premise (been given this as well)
  3. Q - **AndElim** to 1
  4. Q **and** R - **AndIntro** to 2,3

## Implicative Propositions

- Examples:
  - _if_ the sun is up, it is daytime
  - _n_ is prime _implies n_ is odd
  - for even integer _n_, *n*² is also an even integer
  - _B_ only if _A_
- Each has a _premise_ and a _conclusion_
- Decomposition:
  - _premise_: the sun is up
  - _Conclusion_: it is daytime

### Proving Implications

- Every proof of _P_ implies _Q_ has the form:
  1. Assume the proposition _P_ to be true
  2. Using this assumption astablish _Q_
  3. Conclude: _P_ implies _Q_ is true
- All the work is in part 2
- Fancy name: Implication Introduction - **ImpIntro**

### An Example Proof

- If _n_ is even then so is *n*²
  1. Assume n is an even number
  2. So there is some k such that _n_ = 2*k* (Definition of even)
  3. Therefore using 2, *n*² = 2(2*k*²)
  4. Therefore *n*² is even (Definition of even)
  5. Therefore, by **ImpIntro** from 1 and 4, if _n_ is even, *n*² is even

### Using Implications: Modus Ponens

- Modus Ponens:
  - From _P_ implies _Q_
  - and P
  - We can conclude
  - _Q_ is true
- Should be called Implication Elimination - **ImpElim** but greeks got there first
- Same as when programming, there's an input type as well as an output type for statically typed languages

### Proof Using Implications

- C **implies** R, R **implies** S ⊢ C **implies** S
  1. C **implies** R - Premise
  2. R **implies** S - Premise
  3. Assume C
  4. R - using **Modus Ponens** with 1, 3
  5. S - using **Modus Ponens** with 2, 4
  6. Therefore C **implies** S - by **ImpIntro** applied to 3 - 5

## Handling Negation

- _**NOT PROOFS WIL NOT BE TESTED**_
- How to establish the proposition **not** P:
  1. Assume proposition P to be true
  2. Derive a contradiction, say **false**
  3. Conclude **not** P is **true**
- Fancy rule: Negation Introduction, **NotIntro**

### Elimination

### E.g Modus Tollens

- P **implies** Q, **not** Q ⊢ **not** P
- A proof:
  1. P **implies** Q - premise
  2. **not** Q - premise

## Establishing Disjunctive Propositions

- _**OR PROOFS WILL NOT BE TESTED**_
- One way to establish P **or** Q 1.
  1. Establish P
  2. Conclude (P **or** Q)
- The other way
  1. Establish Q
  2. Conclude (P **or** Q)

### Using Disjunctive Propositions - Or

- Rules for Eliminating **or**: Case Analysis
- To prove _R_ from _P_ **or** _Q_

## An Unsound Rule

- A **Silly** rule:
  - From:
    - (P **implies** Q)
    - Q
    1. Conclude P
- Using **Silly**:
  - We can derive contraditions:
  - If _the moon is in the sky_ then _black is white_
- _the moon is in the sky_ - obviously true
- _black is white_ - obviously false

## Formal Versus Informal Proofs

- In an informal proof:
  - Many steps are omitted
  - Co-operation of reader is required
  - Some (obvious) justifications are omitted
- Reader can construct a formal proof if necessary
- Informal proofs contain sufficient material to construct a formal proof.

## iff

- iff = _if and only if_
- There are no shortcuts
- To prove _P if and only if Q_

## Goal-Oriented Reasoning

- Set up a Goal and Assumptions
- Understand both
- Ransack Goal to simpler subGoals
- Arrive at trivial Goals
- Write up proof using Deductive Reasoning Rules
