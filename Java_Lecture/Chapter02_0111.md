# **Variable**
  
<br>
    
## 01. print() and println()

- **print()** : **No line breaks** after output.
- **printf()** : **line breaks** after output.
- Java is **case-sensitive**
- Ex2_1
    ```
    public class Ex2_1 {
        public static viod main(String[]args){
            System.out.println("Hello, World");
            System.out.print("Hello")
            System.out.println("World");
        }
    }
    ```

  - Ex2_1 Result
    ```
    Hello, World
    HelloWorld
    ```
- Ex2_2
    ```
    public class Ex2_2 {
        public static viod main(String[]args){
            System.out.print("3 + 5 = ")
            System.out.println(3+5);
        }
    }
    ```

  - Ex2_2 Result
    ```
    3 + 5 = 8
    ```

## 02. Calculating Addition, Subtraction 

- Ex2_3
    ```
    public class Ex2_3 {
        public static viod main(String[]args){
            System.out.println(5+3);
            System.out.println(5-3);
            System.out.println(5*3);
            System.out.println(5/3);
        }
    }
    ```

  - Ex2_3 Result
    ```
    8
    2
    15
    1
    ```
<br>
<hr>
<br>

## 03. Declaration and Save of Variable
- What is Variable?
  - Variable is a name if **memory location (RAM)**
  - A data container that saves the data values during Java execution
  - A variable is assigned with a data type
  - Kinds : class / instance / local
- Declaration of variable
  - Reason : Make space to save data
  - How to : ```variable_type``` ```variable_name```;
- Save data in variable
  - ```=``` is substitution
    ```
    int age;   // int type 변수 age 선언
    age = 25   // 변수 age에 25를 저장
    
    → int age = 25;
    ```
  - Initialization if variables : 변수에 처음으로 값 저장  
    local variables must be initialized before run
    ```
    int x = 0;   // 변수 x를 선언 후, 0으로 초기화
    int y = 5;   // 변수 y를 선언 후, 5으로 초기화
    ```
- Read the data of a variable
  - Write the variable's name where need the data
    ```
    int year = 0, age = 14;
        year = age + 2000;
      → year = 14 + 2000;
      → year = 14 + 2000;
      → year = 2014;
        age = age + 1;
      → age = 14 + 1;
      → age = 15;
        System.out.println(age);   // 15
    ```
- Ex2_4
    ```
    public class Ex2_4 {
        public static viod main(String[]args){
            int x = 5;
            System.out.println(x);

            x = 10;
            System.out.println(x);
        }
    }
    ```
  - Ex2_4 Result
    ```
    5
    10
    ```
- Ex2_5
    ```
    public class Ex2_5 {
        public static viod main(String[]args){
            int x = 10, y = 5;
            System.out.println(x+y);
            System.out.println(x-y);
            System.out.println(x*y);
            System.out.println(x/y);
        }
    }
    ```
  - Ex2_5 Result
    ```
    15
    5
    50
    2
    ```
<br>
<hr>
<br>

## 04. Type of Variable
- Type of Variable
  - Type of Variable is determined by data type
    ```
    int age = 25;     // variable and data has same type
        age = 3.14;   // Error : variable and data has different types
    
    → int age = 25;
    ```
  - 저장할 값의 타입과 동일한 타입으로 변수를 선언
    ```
    char ch = 'character';
    double pi = 3.14;
    ```
- Data Type (Basic)
  - Data
    - Character : char
    - Number
      - integer : byte, short, int, long
      - real : float, double
    - Logical : true, false
- Ex2_6
  ```
  public class Ex2_6 {
      public static viod main(String[]args){
          int x = 100;
          double pi = 3.14;
          char ch = 'a';
          String str = "abc";

          System.out.println(x);
          System.out.println(pi);
          System.out.println(ch);
          System.out.println(char);
      }
  }
  ```
- Ex2_6 Result
  ```
  100
  3.14
  a
  abc
  ```
  
<br>
<hr>
<br>

## 05. Constant and Literal
- Variable, Constant, 
  - variable : Space to save a data (can change data)
    ```
    int score = 100;
        score = 200;
    → score = 200
    ```
  - Constant : Variable that can save data only once (can not change data)  
    ```
    final int max = 100; 
              max = 200;   // Error : max → constant
    → max = 200
    ```  
    ```The final local variable {max} cannot be assigned```
  - Literal : Itself means a data (= Constant)
    ```
    char ch = 'A';  // ch → variable, 'A' → literal
    String str = "abc";  // str → variable, "abc" → literal
    ```

<br>
<hr>
<br>

## 06. Type of Literal and Suffix
- Suffix and Prefix of Literal  
  | Type     | Literal                      | Suffix                              | 
  | -------- | ---------------------------- | ----------------------------------- | 
  | logical  | false, true                  | x                                   | 
  | integer  | 123, 0b0101, 007, 0xFF, 100L | <span style="color:red">L</span>    | 
  | real     | 3.14, 3.0e8, 1.4f, 0x1.0p-1  | <span style="color:red">f</span>, d | 
  | charator | 'A', '1', '\n'               | x                                   | 
  | string   | "ABC", "123", "A", "true"    | x                                   | 
  ```
  123, 0b0101, 007, 0xFF : int type
  100L : long type

  3.14, 3.0e8, 0x1.0p-1 : double type (d can be omitted)
  1.4f : float type
  ```
  - Suffix is not case-sensitive
  ```
  boolean power = true;     // boolean → can save only true or false
  
  char ch = 'A';            // char → single quotation marks
  
  String str = "ABC";       // String → double quotation marks
  
  byte b = 127;             // no suffix, byte is int type
  byte b = 128;             // error, byte type can save -128 ~ 127
   
  int i = 100;              // decimal
  int bi = 0b0101           // binary → 0b is prefix
  int oct = 0100;           // Octal → 0 is prefix
  int hex = 0x100;          // Hexadecimal → 0x is prefix
                            // integer can save almost 10   billion

  long l = 10_000_000_000L; // can not omitted L
  long l = 100;             // OK

  float f = 3.14f;          // can not omitted f
  double d = 3.14d;

  ```
- Mismatch of Variable type and Literal type
  - If the range is 'Variable > Literal', OK  
    ```
    int i = 'A';       // int > char
    long l = 123;      // long > int
    double d = 3.14f;  // double > float
    ```
  - If the range is 'Variable > Literal', <span style='color:red'>ERROR</span>
    ```
    int i 30_0000_0000;  // range of int is ± 20 billion
    long l = 3.14f;      // long < float
    float f = 3.14;      // float < double
    ```
  - Variable of byte, short can save int literal  
    The type of Variable must be within the range
    ```
    byte b = 100;  // include byte range
    byte b = 128;  // error
    ```

<br>
<hr>
<br>

## 07. Character literal and String literal
- Character and String
  ```
  String name = new String("Java"); // create string object
  String name = "Java";             // simplify the above

  String s = "";  // empty string
  char ch = '';   // error
  ```

## 08. String Concatenation
  ```
    String name = "Ja" + "va";  // "Java"
  ```
- string + <span style='color:blue'>any type</span> → string + <span style='color:blue'>string</span> → string  
  <span style='color:blue'>any type</span> + string → <span style='color:blue'>string</span> + string → string  
    ```
    "" + 7  →  "" + "7"  →  "7"  // number turn into string
    "" + 7 + 7  →  "7" + 7  →  "7" + "7"  →  "77"
    7 + 7 + ""  →  14 + ""  →  "14" + ""  →  "14"
    ```
- Ex2_7
  ```
  public class Ex2_7 {
      public static viod main(String[]args){
          String name = "Ja" + "va";
          String str = name + 8.0;

          System.out.println(name);
          System.out.println(str);
          System.out.println(7 + " ");
          System.out.println(" " + 7);
          System.out.println(7 + "");
          System.out.println("" + 7);
          System.out.println("" + "");
          System.out.println(7 + 7 + "");
          System.out.println("" + 7 + 7);
      }
  }
  ```
- Ex2_7 Result
  ```
  Java
  Java8.0
  7
   7
  7
  7

  14
  77
  ```

<br>
<hr>
<br>

## 09. Swap the datas of two Variables
  ```
  int x = 10, y = 20;
  x = y;  // y의 값을 x에 저장
  y = x;  // x의 값을 y에 저장

  int x = 10, y = 20;
  int tmp;  // empty
  tmp = x;  // x의 값을 tmp에 저장
  x = y;    // x의 값을 y에 저장
  y = tmp;  // tmp의 값을 y에 저장
  ```
- Ex2_8
  ```
  public class Ex2_8 {
      public static viod main(String[]args){
          int x = 10, y = 5;
          System.out.println("x="+x);
          System.out.println("y="+y);

          int tmp = x;
          x = y;
          y = tmp;
          System.out.println("x="+x);
          System.out.println("y="+y);
      }
  }
  ```
- Ex2_8 Result
  ```
  x=10
  y=5
  x=5
  y=10
  ```

<br>
<hr>
<br>

## 10. Primitive type and Reference type
- [Basic Data type](#04-type-of-variable)
- Primitive type and Reference type
  - Primitive type : **Only 8** (boolean, char, byte, short, int, long, float, double)  
    - save the real data
  - Reference type : Infinite, Except for Primitive type (String, System, ect.)
    - save the memory address (4 byte or 8 byte)
      ```
      Date today;          // Reference type Variable 선언
      today = new Date();  // save the 객체의 주소 in today
      ```
<br>
<hr>
<br>

## 11. Type and Scope of Primitive type
- Primitive type : type and scope (1 byte = 8 bit = 2<sup>8</sup>)
  | Type \ byte | 1       | 2     | 4       | 8          | 
  | :---------: | :-----: | :---: | :-----: | :--------: | 
  | logical     | boolean |       |         |            | 
  | charator    |         | char  |         |            | 
  | integer     | byte    | short | **int** | long       |  
  | real        |         |       | float   | **double** | 
  - logical type : Used in conditional statements and logical calculations
  - charater type : Used in save charater, Save **only one character** per variable
  - integer type : Used in save integer data 
    - Usually int and long are used
    - byte is used to handle binary data
    - short was added for compatibility with the C (rarely)
  - real number type : Used in save real data
- Expression Range
  - n bit로 표현할 수 있는 값의 개수 : 2<sup>n</sup>  
    n bit로 표현할 수 있는 부호없는 정수의 범위 : 0 ~ 2<sup>n</sup>-1   
    n bit로 표현할 수 있는 부호있는 정수의 범위 : -2<sup>n-1</sup> ~ 2<sup>n-1</sup>-1  
  - The range of to save data  
    | Type    | Sign bit | Storable range                               | bit / bite | 
    | :-----: | :------: | :------------------------------------------: | :--------: | 
    | boolean |          | false, true                                  | 8 / 1      | 
    | char    |          | 0 ~ 2<sup>16</sup>-1                         | 16 / 2     | 
    | byte    |S         | -2<sup>7</sup> ~ 2<sup>7</sup>-1             | 8 / 1      | 
    | short   |S         | -2<sup>15</sup> ~ 2<sup>15</sup>-1           | 16 / 2     | 
    | int     |S         | -2<sup>31</sup> ~ 2<sup>31</sup>-1           | 32 / 4     | 
    | long    |S         | -2<sup>63</sup> ~ 2<sup>63</sup>-1           | 64 / 8     | 
    | float   |          | 1.4x10<sup>-45</sup> ~ 3.4x10<sup>38</sup>   | 32 / 4     | 
    | double  |          | 4.9x10<sup>-324</sup> ~ 1.8x10<sup>308</sup> | 64 / 8     |  
    - Sign bit (S) : 0 → +, 1 → -  
    - long : ± 800경, if more than 800경, then used BigInteger
    - float : -1.4x10<sup>-45</sup> ~ 1.4x10<sup>-45</sup> (표현할 수 없는 범위)  
      1 + 8 + 23 = 32 bit = 4 byte  
      S(부호), E(지수), M(가수) 으로 나뉘어서 저장됨  
      원래 저장된 값과 실제로 저장된 값의 오차가 발생할 수 있음 (오차없는 자리수 = 정밀도 : 7자리)
    - double : 정밀도 15자리
