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
  - Variable is a name if memory location (RAM)
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

<br>
<hr>
<br>

## 05. Constant and Literal

<br>
<hr>
<br>

## 06. Type of Literal and Suffix
- Suffix and Prefix of Literal  
  | Type     | Literal                      | Prefix                              | 
  | ________ | ____________________________ | ___________________________________ | 
  | logical  | false, true                  | x                                   | 
  | integer  | 123, 0b0101, 007, 0xFF, 100L | <span style="color:red">L</span>    | 
  | real     | 3.14, 3.0e8, 1.4f, 0x1.0p-1  | <span style="color:red">f</span>, d | 
  | charator | 'A', '1', '\n'               | x                                   | 
  | string   | "ABC", "123", "A", "true"    | x                                   | 
<br>
<hr>
<br>

## 07. Character literal and String literal

## 08. String Concatenation

<br>
<hr>
<br>

## 09. Swap the values of two Variables

<br>
<hr>
<br>

## 10. Primitive type and Reference type

<br>
<hr>
<br>

## 11. Type and Scope of Primitive type

<br>
<hr>
<br>

## 12. Output using printf

## 13. Example of Output using printf

<br>
<hr>
<br>

## 14. Input from the screen

<br>
<hr>
<br>

## 15. Overflow of Integer Type

## 16. Overflow of Signed Integer

<br>
<hr>
<br>

## 17. Convert between Types


<br>
<hr>
<br>
