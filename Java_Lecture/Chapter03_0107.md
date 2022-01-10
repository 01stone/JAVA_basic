# **Operator**

<br>

## 01. operator and operand

- operator : a character that represents an action  
    - In Java : Special symbols performing specific operations on one, two or three operands and then returning a result. Generally used to manipulate primitive data types
- operand : the object that is being worked on by an operation  
- **All operators return operation results**
    ```
    y = 4 * x + 3;          // if x = 5, y = 23
    System.out.println(y);  // 23 is output
    System.out.println(4 * x + 3);  // if x = 5, 23 is output
    ```

## 02. Type of operator
| Type | operator | explanation |
|------|:--------:|-------------|
| arithmetic | + - * / % | arithmetic and remainder(%) |
| comparison | > < >= <= == !=| compare big and small, compare same and different |
| logical    | && ∥ ! | connect 'AND' or 'OR' as conditions |
| assignment | = | save right side value to left side |
| etc        | (type) ?: instanceof | cast, ternary, instanceof |

<br>
<hr>
<br>

## 03. Priority of operator
- Operator precedence determines the grouping of terms in an expression and decides how an expression is evaluated
- More than one operator in an expression, automatically decides which operation to performed first. (```()``` : manually)
    ```
    5 + 3 * 4
    → 5 + 12
    → 17
    ```

## 04. Associativity of operator
| OperatorType | Associativity | Operators | Priority|
|:------------:|:-------------:|:---------:|:-------:|
|Unary         |**←**| ++ -- + - ~ ! (type) |high|
|Arithmetic    |    →| * / % ||
|              |    →| + - ||
|              |    →| << >> ||
|comparison    |    →| < > <= >= instanceof ||
|              |    →| == != ||
|logical       |    →| & ||
|              |    →| ^ ||
|              |    →| ```shift + \``` ||
|              |    →| && ||
|              |    →| ∥ ||
|ternary       |    →| ?: ||
|assignment    |**←**| = += -= *= /= %=||
|              |     | <<= <<= &= ^= ```shift + \```=|low|
- Think common sense
- ```
  1. 산술 > 비교 > 논리 > 대입. 대입은 가장 마지막에 수행
  2. 단항(1) > 이항(2) > 삼항(3). 단항 연산자의 우선순위가 이항연산자보다 높음
  3. 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행방향은 왼쪽에서 오른쪽
  ```
- Ex3_1
    ```
    public class Ex3_1 {
        public static viod main(String[]args){
            int x, y;
            x = y = 3; // y에 3이 저장된 후, x에 3 저장

            System.out.println("x=", x);  
            System.out.println("y=", y);   
        }
    }
    ```

  - Ex3_1 Result
    ```
    x=3
    y=3
    ```

<br>
<hr>
<br>

## 05. Increment operator(++) and Decrement operator(--)
- ```++``` : 피연산자의 값 1 증가  
  ```--``` : 피연산자의 값 1 감소   
    | Type  | explanation | example |
    |:-----:|:-----------:|:-------:|
    |prefix | 값이 참조되기 **전에** 증가 |```j = ++i;```|
    |postfix| 값이 참조된 **후에** 증가|```j = i++;```|
- When the 증감연산자 is used independently, there is no differece between prifix and postfix
- Ex3_2
    ```
    public class Ex3_2 {
        public static viod main(String[]args){
            int i=5, j=0;

            j = ++i;
            System.out.println("j=++i; 실행 후, i=" + i + ", j="+ j);

            
            i=5; 
            j=0;

            j = i++;
            System.out.println("j=i++; 실행 후, i=" + i + ", j="+ j);   
        }
    }
    ```

  - Ex3_2 Result
    ```
    j=++i; 실행 후, i=6, j=5
    j=i++; 실행 후, i=6, j=6
    ```
- Ex3_3
    ```
    public class Ex3_3 {
        public static viod main(String[]args){
            int i=5, j=5;
            System.out.println(i++);
            System.out.println(++j);
            System.out.println("i = " + i + ", j = " +j);
        }
    }
    ```

  - Ex3_3 Result
    ```
    5
    6
    i = 6, j = 6
    ```

## 06. Sign Operator
- ```-``` : reverse the sign of the operand  
  ```+``` : nothing
- Ex3_4
    ```
    public class Ex3_4 {
        public static viod main(String[]args){
            int i = -10;
            i = +i;
            System.out.println(i);

            i = -10;
            i = -i;
            System.out.println(i);
        }
    }
    ```

  - Ex3_4 Result
    ```
    -10
    10
    ```
<br>
<hr>
<br>

## 07. Casting operator
- casting : A way of converting data from one data type to another data type  
```(type)operand```
    ```
    double d = 85.4;
    int score = (int)d;
    → int score = (int)85.4;
    → int score = 85;
    ```
    ```
    (char)65  → 'A'     # int   → char
    (int)'A'  → 65      # char  → int
    (int)1.6f → 1       # float → int
    (float)10 → 10.0f   # int   → float
    ```
- Ex3_5
    ```
    public class Ex3_5 {
        public static viod main(String[]args){
            double d = 85.4;
            int score = (int)d;
            System.out.println("score=" + score);
            System.out.println("d=" + d);
        }
    }
    ```

  - Ex3_5 Result
    ```
    score=85
    d=85.4
    ```
