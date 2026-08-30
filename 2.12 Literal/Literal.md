# Literal

## 1. Integer Literals

An **integer literal** is a whole number written directly in your Java program.

For example:

```java
int a = 101;
```

Here:

* `int` → data type
* `a` → variable
* `101` → **integer literal**
* `=` → assignment operator

Java supports integer literals in **4 number systems**:

| Number System | Base | Digits Used  | Java Prefix |
| ------------- | ---: | ------------ | ----------- |
| Decimal       |   10 | `0–9`        | No prefix   |
| Octal         |    8 | `0–7`        | `0`         |
| Hexadecimal   |   16 | `0–9`, `A–F` | `0x` / `0X` |
| Binary        |    2 | `0–1`        | `0b` / `0B` |

Let's understand Decimal and Octal first.

---

# Decimal Literal — Base 10

Decimal is the **normal number system** we use every day.

It uses **10 digits**:

```text
0 1 2 3 4 5 6 7 8 9
```

Example:

```java
int decimal = 101;
```

Java treats `101` as a **decimal number** because there is no special prefix.

### How is `101` calculated?

Each position has a power of 10:

```text
101

1 × 10²
0 × 10¹
1 × 10⁰
```

Therefore:

```text
1 × 100 = 100
0 × 10  =   0
1 × 1   =   1
----------------
           101
```

So:

```text
101 (Decimal) = 101
```

---

# Octal Literal — Base 8

Octal is a **base-8 number system**.

It uses only **8 digits**:

```text
0 1 2 3 4 5 6 7
```

Notice:

❌ `8` is not allowed  
❌ `9` is not allowed

In Java, an octal integer literal starts with **`0`**.

Example:

```java
int octal = 0146;
```

The first `0` tells Java:

> "This number is written in octal."

So Java does **not** treat `0146` as decimal 146.

It treats it as:

```text
0146 → Octal
```

---

# How does `0146` become `102`?

This is the important part.

Take:

```text
0146
```

Ignore the first `0` for the calculation. The actual octal digits are:

```text
1 4 6
```

Because it is **base 8**, use powers of 8:

```text
1 × 8²
4 × 8¹
6 × 8⁰
```

Calculate:

```text
1 × 64 = 64
4 ×  8 = 32
6 ×  1 =  6
----------------
           102
```

Therefore:

```text
0146 (Octal) = 102 (Decimal)
```

That's why:

```java
int octal = 0146;
System.out.println(octal);
```

Output:

```text
102
```

---

# Why does Java use `0` for Octal?

Java needs some way to distinguish between:

```java
101
```

and

```java
0146
```

The prefix tells Java which number system is being used.

For example:

```java
101
```

means:

> Decimal 101

Whereas:

```java
0146
```

means:

> Octal 146

The leading `0` is **not really part of the number's value**. It is a notation/prefix telling Java that the literal is octal.

---

# Very Important Example

Look at these:

```java
int a = 10;
int b = 010;
```

You might think both are `10`.

But they are different.

### `10`

No prefix → Decimal

```text
10 (Decimal) = 10
```

### `010`

Starts with `0` → Octal

```text
10 (Octal)
```

Convert to decimal:

```text
1 × 8¹ + 0 × 8⁰

= 1 × 8 + 0 × 1

= 8
```

Therefore:

```java
int a = 10;
int b = 010;

System.out.println(a);
System.out.println(b);
```

Output:

```text
10
8
```

### So remember this:

```text
10   → Decimal → 10
010  → Octal   → 8
```

---

# Another Example

```java
int a = 012;
```

`012` is octal.

Convert:

```text
1 × 8¹ + 2 × 8⁰

= 1 × 8 + 2 × 1

= 8 + 2

= 10
```

Therefore:

```text
012 (Octal) = 10 (Decimal)
```

So:

```java
System.out.println(012);
```

Output:

```text
10
```

---

# How to identify an Octal Literal

Look at the beginning.

```java
int a = 101;   // Decimal
int b = 0146;  // Octal
int c = 012;   // Octal
int d = 077;   // Octal
```

### Rule

If an integer literal starts with:

```text
0
```

Java treats it as **octal**, provided it follows valid octal syntax.

For example:

```java
077
```

is valid because it contains only `0–7`.

But:

```java
078
```

is **invalid**, because `8` isn't an octal digit.

---

## Easy way to remember

Think of the prefix:

```text
101
│
└── Nothing → Decimal
```

```text
0146
│
└── 0 → Octal
```

Later you'll learn:

```text
0x146 → Hexadecimal
0b101 → Binary
```

So the four Java integer literal forms are:

```text
101     → Decimal
0146    → Octal
0x146   → Hexadecimal
0b101   → Binary
```

The **base determines how the digits are interpreted**, but Java ultimately stores the integer's value in binary internally.

# 3. Hexadecimal Literal — Base 16

**Hexadecimal** means **base 16**.

Unlike decimal, which has 10 digits, hexadecimal needs **16 symbols**.

### Digits used in hexadecimal

```text
0 1 2 3 4 5 6 7 8 9 A B C D E F
```

The letters represent values:

| Hexadecimal | Decimal value |
| ----------- | ------------: |
| `0`         |             0 |
| `1`         |             1 |
| `2`         |             2 |
| `3`         |             3 |
| `4`         |             4 |
| `5`         |             5 |
| `6`         |             6 |
| `7`         |             7 |
| `8`         |             8 |
| `9`         |             9 |
| `A`         |            10 |
| `B`         |            11 |
| `C`         |            12 |
| `D`         |            13 |
| `E`         |            14 |
| `F`         |            15 |

So after `9`, hexadecimal doesn't have another single digit like decimal's `10`.

Instead:

```text
9
A
B
C
D
E
F
10
```

Notice that **hexadecimal `10` does NOT mean decimal 10**.

It means:

```text
1 × 16 + 0
= 16
```

So:

```text
10 (Hexadecimal) = 16 (Decimal)
```

---

# Why does Java use `0x`?

Java needs to know whether a number is decimal or hexadecimal.

For example:

```java
int a = 123;
```

Java knows `123` is decimal.

But:

```java
int b = 0x123;
```

The `0x` tells Java:

> This number is hexadecimal.

Both lowercase and uppercase are allowed:

```java
0x123
0X123
```

They mean the same thing.

---

# Example: `0x123Face`

Your example is:

```java
int hex = 0x123Face;
```

The important part is:

```text
0x
```

This tells Java:

```text
"Interpret everything after 0x as hexadecimal."
```

So:

```text
0x123Face
```

is a hexadecimal number.

The digits are:

```text
1 2 3 F A C E
```

---

# How do we convert `0x123Face` to Decimal?

Each position is a power of **16**.

```text
1 2 3 F A C E
```

Starting from the right:

```text
16⁰  16¹  16²  16³  16⁴  16⁵  16⁶
```

Remember:

```text
Fixed/default values in the hexadecimal number system

0  1  2  3  4  5  6  7  8  9  A  B  C  D  E  F
0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15

F = 15
A = 10
C = 12
E = 14
```

Therefore:

```text
1 × 16⁶
+ 2 × 16⁵
+ 3 × 16⁴
+ 15 × 16³
+ 10 × 16²
+ 12 × 16¹
+ 14 × 16⁰
```

The result is:

```text
191935710
```

So:

```text
0x123Face = 191935710 (Decimal)
```

You can verify it in Java:

```java
int hex = 0x123Face;

System.out.println(hex);
```

Output:

```text
191935710
```

---

# A Simple Hexadecimal Example

Let's use something smaller:

```java
int hex = 0x2A;
```

`2A` is hexadecimal.

Remember:

```text
A = 10
```

So:

```text
2A

= 2 × 16¹
  + 10 × 16⁰

= 2 × 16
  + 10 × 1

= 32 + 10

= 42
```

Therefore:

```text
0x2A = 42 (Decimal)
```

---

# 4. Binary Literal — Base 2

Now let's look at **Binary**.

Binary means **base 2**.

It uses only **two digits**:

```text
0 1
```

That's it.

Unlike decimal:

```text
0 1 2 3 4 5 6 7 8 9
```

Binary can only use:

```text
0 1
```

---

# Why does Java use `0b`?

Java uses `0b` or `0B` to indicate a binary literal.

Example:

```java
int binary = 0b1111;
```

The:

```text
0b
```

tells Java:

> This number is written in binary.

Both are valid:

```java
0b1111
0B1111
```

---

# How does `0b1111` become 15?

Take:

```text
1111
```

Because it is base 2, use powers of **2**.

From right to left:

```text
1  1  1  1
↑  ↑  ↑  ↑
2³ 2² 2¹ 2⁰
```

Calculate:

```text
1 × 2³ = 8
1 × 2² = 4
1 × 2¹ = 2
1 × 2⁰ = 1
```

Add them:

```text
8 + 4 + 2 + 1 = 15
```

Therefore:

```text
0b1111 = 15 (Decimal)
```

So:

```java
int binary = 0b1111;

System.out.println(binary);
```

Output:

```text
15
```

---

# Another Binary Example

```java
int binary = 0b1010;
```

Convert it:

```text
1 0 1 0
```

Powers of 2:

```text
1 × 2³ = 8
0 × 2² = 0
1 × 2¹ = 2
0 × 2⁰ = 0
```

Therefore:

```text
8 + 0 + 2 + 0 = 10
```

So:

```text
0b1010 = 10 (Decimal)
```

---

# Compare All Four

This is the most important part to remember:

| Number System | Base | Java Example | Decimal Value |
| ------------- | ---: | ------------ | ------------: |
| Decimal       |   10 | `101`        |           101 |
| Octal         |    8 | `0145`       |           101 |
| Hexadecimal   |   16 | `0x65`       |           101 |
| Binary        |    2 | `0b1100101`  |           101 |

All four represent the **same value: 101**, but they are written using different number systems.

### Java code

```java
int decimal = 101;
int octal = 0145;
int hex = 0x65;
int binary = 0b1100101;

System.out.println(decimal);
System.out.println(octal);
System.out.println(hex);
System.out.println(binary);
```

Output:

```text
101
101
101
101
```

### Easy prefixes to memorize

```text
101       → Decimal
0145      → Octal
0x65      → Hexadecimal
0b1100101 → Binary
```

**Memory trick:**

* `0` → **Octal**
* `0x` → **Hexadecimal**
* `0b` → **Binary**
* No prefix → **Decimal**
