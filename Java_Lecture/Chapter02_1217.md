# **Variable**
  
<br>

## 12. Output using printf
- printf() : formatted output, **No line breaks** after output
  - Disadvantages of println() : Cannot be specified output format
    - 실수의 자릿수 조절 불가
      ```
      System.out.println(10/3);    // 3 (int % int = int)
      System.out.println(10.0/3);  // 3.3333...
      ```
    - Output only in decimal
      ```
      System.out.println(0x1A);  // 26
      ```  
  - Output format can be specified with printf()
    ```
    System.out.printf("%.2f", 10.0/3);  // 3.33
    System.out.printf("%.d", 0x1A);     // 26
    System.out.printf("%.x", 0x1A);     // 1A
    ```
    - JavaAPI : Formatter  
      | Format Specifier | Explain Output as type |
      | ---------------- | ------- |
      | %b               | <span style='color:red'>b</span>oolean |
      | %d               | <span style='color:red'>d</span>ecimal integer |
      | %o               | <span style='color:red'>o</span>ctal integer |
      | %x, %X           | he<span style='color:red'>x</span>adecimal integer  |
      | %f               | <span style='color:red'>f</span>loating point (real) |
      | %e, %E           | <span style='color:red'>e</span>xponent (real) | 
      | %c               | <span style='color:red'>c</span>haracter | 
      | %s               | <span style='color:red'>s</span>tring |
    - Output integer to decimal, octal, and hexadecimal
      ```
      System.out.printf("%d", 15);  // 15 : decimal
      System.out.printf("%o", 15);  // 17 : octal
      System.out.printf("%x", 15);  // f  : hexadecimal
      System.out.printf("%s", Integer.toBinaryString(15));  // 1111 : binary
      ```
    - Prefix octal and hexadecimal
      ```
      System.out.printf("%#o", 15);  // 017 
      System.out.printf("%#x", 15);  // 0xf 
      System.out.printf("%#X", 15);  // 0xF
      ```
    - 실수 출력을 위한 지시자 %f - 지수형식(%e), 간략한 형식(%g)
      ```
      float f = 123.4567890f;
      System.out.printf("%f", f);  // 123.456787   : 소수점 아래 6자리
                                   // 정밀도 7자리
      System.out.printf("%e", f);  // 1.234568e+02 : 지수형식
                                   // 반올림
      System.out.printf("%g", 123.456789);  // 123.457
      System.out.printf("%g", 0.00000001);  // 1.00000e-8
      ```
    - printf()의 지시자 (3/3)
      ```
      System.out.printf("[%5d]%n", 10);   // [   10] : 5자리 수
      System.out.printf("[%-5d]%n", 10);  // [10   ] : left align
      System.out.printf("[%05d]%n", 10);  // [00010] : fill zeros

      System.out.printf("[%s]%n", url);
      System.out.printf("[%20s]%n", url);
      System.out.printf("[%-20s]%n", url);
      System.out.printf("[%.8s]%n", url);   // 부분출력
      ```

## 13. Example of Output using printf
- Ex2_9
    ```
    class Ex2_9 {
        public static viod main(String[]args){
            String url = "www.codechobo.com";
            float f1 = .10f;  // 0.10, 1.0e-1
            float f2 = 1e1f;  // 10.0, 1.0e1, 1.0e+1
            float f3 = 3.14e3f;
            double d = 1.23456789;

            System.out.printf("f1= %f, %e, %g%n", f1, f1, f1);
            System.out.printf("f2= %f, %e, %g%n", f2, f2, f2);
            System.out.printf("f3= %f, %e, %g%n", f3, f3, f3);
            System.out.printf("d=%f%n", d);
            System.out.printf("d=%14.10f%n", d);  // 전체 14자리 중 소수점 10자리
            System.out.printf("[12345678901234567890]%n");
            System.out.printf("[%s]%n", url);
            System.out.printf("[%20s]%n", url);
            System.out.printf("[%-20s]%n", url);  
            System.out.printf("[%.8s]%n", url);   
        }
    }
    ```

  - Ex2_9 Result
    ```
    f1= 0.100000, 1.000000e-01, 0.100000
    f2= 10.000000, 1.000000e+01, 10.0000
    f3= 3140.000000, 3.140000e+03, 3140.00
    d=1.2345678 ← 마지막 자리 반올림됨
    d=  1.2345678900
    [12345678901234567890]
    [www.codechobo.com]
    [   www.codechobo.com]
    [www.codechobo.com   ]
    [www.code]
    ```


<br>
<hr>
<br>

## 14. Input from the screen
- What is Scanner?
  - Java User input
  - The Scanner class is used to get user input, and it is found ton the ```java.util``` package.
- How to use?
  - Add import statements
    - The import statement allows you to import all the functions from a module into your code.
    - ```import java.util.*```
  - Create Scanner object
    - ```Scanner scanner = new Scanner(System.in);```
    - ```(System.in)``` : screen input
  - Use Scanner object
    - ```int num = scanner.nextInt();``` : Save the int input from the screen to ```num```
    - ```String input = scanner.nextLine();``` : Save the input from the screen to ```input```
    - ```int num = integer.parseInt(input);``` : Convert string(input) to num(num)
- Ex2_10
  ```
  import java.util.Scanner;

  class Ex2_10 {
      public static viod main(String[]args){
          Scanner scanner = new scanner(System.in);

          System.out.print("두자리 정수를 하나 입력해주세요.>")
          String input = scanner.nextline();
          int num = Integer.parseInt(input);

          System.out.println("입력내용 :"+input);
          System.out.printf("num=%d%n", num);   
      }
  }
  ```

  - Ex2_10 Result
    ```
    두자리 정수를 하나 입력해주세요.>22
    입력내용 :22
    num=22
    ```
 
<br>
<hr>
<br>

## 15. Overflow of Integer Type
- What is Overflow?
  - Overflow occurs when we assign such a value to a variable which is more than maximum permissible value
    |   |   |   |   | decimal      |   |   |   |   | binary       |
    |---|---|---|---|--------------|---|---|---|---|--------------|
    | 0 | 0 | 0 | 0 |              | 0 | 0 | 0 | 0 |              |
    | 0 | 0 | 0 | 1 |              | 0 | 0 | 0 | 1 |              |
    | 0 | 0 | 0 | 2 |              | 0 | 0 | 1 | 0 |              |
    |  |  |  |  |  |  |  |  |  |  |
    | 9 | 9 | 9 | 8 |              | 1 | 1 | 1 | 0 |              |
    | 9 | 9 | 9 | 9 | **overflow** | 1 | 1 | 1 | 1 | **overflow** |
    | 0 | 0 | 0 | 0 |              | 0 | 0 | 0 | 0 |              |
    | 0 | 0 | 0 | 1 |              | 0 | 0 | 0 | 1 |              |
  - Maximum + 1 → Minimum  
    Minimum - 1 → Maximum  

## 16. Overflow of Signed Integer
- Unsigned integer(4bit) : 0 ~ 15  
  Signed integer  (4bit) : -8 ~ 7

- Ex2_11
  ```
  class Ex2_11 {
      public static viod main(String[]args){
          short sMin = -32768, sMax = 32767;
          char cMin = 0, cMax = 65535;

          System.out.println("sMin  = " + sMin);
          System.out.println("sMin-1= " + (short)(sMin-1));
          System.out.println("sMax  = " + sMax);
          System.out.println("sMax+1= " + (short)(sMax+1));
          System.out.println("cMin  = " + (int)cMin);
          System.out.println("cMin-1= " + (int)--cMin);
          System.out.println("cMax  = " + (int)cMax);
          System.out.println("cMax+1= " + (int)++cMax);   
      }
  }
  ```

  - Ex2_11 Result
    ```
    sMin  = -32768
    sMin-1= 32767
    sMax  = 32767
    sMax+1= -32768
    cMin  = 0
    cMin-1= 65535
    cMax  = 65535
    cMax+1= 0
    ```
- Expression range (16bit : 2<sup>16</sup>)
  - short type : -2<sup>15</sup> ~ 2<sup>15</sup>-1
  - char  type : 0 ~ 2<sup>16</sup>-1
<br>
<hr>
<br>

## **17. Convert between Types**
1. convert number to character  
   - add '0' to number  
     ```(char)(3 + '0') → '3'```
2. convert character to number
   - Subtract '0' to character  
     ```'3' - '0' → 3```
3. convert number to string
   - add empty string("") to number  
     ```3 + "" → "3"```
4. convert string to number
   - Use ```Ingeger.parseInt()``` or ```Double.parseDouble()```  
     ```
     Ingeger.parseInt("3") → 3
     Double.parseDouble("3.14") → 3.14
     ```
5. convert string to character
   - Use ```charAt(0)```  
     ```"3".charAt(0) → '3'```
6. convert character to string
   - Add empty string("")  
     ```'3' + "" → "3"```
   
- Ex2_12
  ```
  class Ex2_12 {
      public static viod main(String[]args){
          String str = "3";

          System.out.println(str.charAt(0) - '0');
          System.out.println('3' - '0' + 1);
          System.out.println(Integer.parseInt("3") + 1);
          System.out.println("3" + 1);
          System.out.println((char)(3 + '0')); 
      }
  }
  ```

  - Ex2_12 Result
    ```
    3
    4
    4
    31
    3
    ```

<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판