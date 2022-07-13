# Recursion

## String Reversal

```java
public String reverseString(String input){
    // What Is The Base Case?
    // - One Letter
    // - Empty String
    if (input.equals("")){
        return "";
    }
    // What Is The Smallest Amount of Work I Can Do in Each Iteration?
    // Pick Single Char
    return reverseString(input.substring(1)) + input.charAt(0);
}
```

| Call Stack        | Return        |
--------------------|---------------|
| ""                |""             |
| rev("") + "o"     |"o"            |
| rev("o") + "l"    |"ol"           |
| rev("lo") + "l"   |"oll"          |
| rev("llo") + "e"  |"olle"         |
| rev("ello") + "h" |"olleh"        |

---

## Palindrome

> A word that can spell the same both forward and backward

```java
public static boolean isPalindrome(String string) {
    if (string.length()==0 || string.length()==1) {
        return true;
    } else {
        if (string.charAt(0) == string.charAt(string.length()-1)) {
            return isPalindrome(string.substring(1, string.length()-1));
        } else {
            return false;
        }
    }
}
```

---

## Decimal to Binary

```java
public static String findBinary(int num, String result){
    if (num == 0) 
        return result;

    result = num%2+ result;
    return findBinary(num/2, result);
}
```

---

## Sum of Natural Numbers

> Eg.5 (1+2+3+4+5 = 15)

```java
private static int naturalNumber(int i) {
    if (i == 0)
        return i;
    return i + naturalNumber(i - 1);
}
```

---

## Divide & Conquer

> 1. Divide problem into several smaller subproblems.
Normally, the subproblems are similar to the original

> 2. Conquer the subproblems by solving them recursively.
Base case: solve small enough problems by brute force.

> 3. Combine the solutions to get a solution to the subproblems.
And finally a solution to the orginal problem.

> 4. Divide and Conquer algorithms are normally recursive.

---

### Binary Search

```java
public static int binarySearch(int[] arr, int left, int right, int target) {
    if (left > right)
        return -1;

    int mid = (right+left)/2;

    if (arr[mid]==target)
        return mid;

    if (arr[mid] > target)
        return binarySearch(arr, mid+1, right, target);
    else
        return binarySearch(arr, left, mid-1, target);
}
```

---

### Fibonacci

> Fibonacci Sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ...

> F<sub>n</sub> = F<sub>n-1</sub> + F<sub>n-2</sub>

> Eg. 55 = 34 + 21

```java
public static int fibonacci(int n) {
    if ((n == 0) || (n == 1))
        return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}
```

### Merge Sort