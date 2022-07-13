# Practical 3

## Part 1

1a

```java
ArrayList<T> dates = new ArrayList<T>();
dates.add(new Date());
date.add(new String());
```

1b
> Correct

2a

```java
ArrayList<T> dates = new ArrayList<T>();
dates.add(new Date());
Date date = dates.get(0);
```

2b
> Correct

3
> Stronger type check at compile time
> Elimination of cast
> Enable programmer to implement generic algorithm

4
| Generic Stack\<E>|
-------------------|
| - list: java.util.ArrayList\<E>|
| + Generic Stack()|
| + getSize():int   |
| + peek():E  |
| + pop():E |
| + push(o:E):E |
| + isEmpty(): boolean |

5
> To declare a generic method, placed a generic type parameter after the static. For example,</br> public static \<E> void print(E[] list)

> To invoke a generic method, prefix the method name with the actual type in angle brackets. For example, if strings is an array of strings: </br>ClassName.\<String>print(strings);
or simply invoke it as: print(strings);

6
> Unbounded Wildcard - ?
> Upper Bounded Wildcard - ? extends T
> Lower Bounded Wildcard - ? super T

7

8
> The program cannot be compiled, because the element 

9
>

10
> No. Only ArrayList is loaded

11
> Hahaha

12

## Part 2

1. 