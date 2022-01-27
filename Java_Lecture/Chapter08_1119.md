# **Exception Handling**
  
<br>
    
## 11. 메서드에 예외 선언하기
- 예외를 처리하는 방법 : try-catch문, 예외 선언하기
    1. 직접처리 : try-catch문
    2. 예외 떠넘기기(알리기) : 예외 선언하기
    3. 은폐 덮기(무시)

- 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
  - 예외를 발생시키는 키워드 throw와 예외를 메서드에 선언할 때 쓰이는 throws를 잘 구별해야 함
    ```
    void method() thorws Exception1, Exception2, ... ExceptionN {
        // 메서드의 내용
    }
    // method()에서 Exception과 그 자손 예외 발생 가능
    void method() throws Exception {
        // 메서드의 내용
    }
    ```
    - 오버라이딩 : 선언부일치, 접근제어자 좁게x, 조상보다 많은 예외선언x

- 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
  - 자바 api wait 메서드 
## 12. 메서드에 예외 선언하기 예제1
- 예제 8_9
## 13. 메서드에 예외 선언하기 예제2
- 예제 8_10
## 14. finally 블럭
> 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣음  

```
try {
    // 예외가 발생할 가능성이 있는 문장
} catch (Exception1 e1) {
    // 예외처리를 위한 문장
} finally {
    // 예외의 발생여부에 관계없이 항상 수행되어야하는 문장들을 넣음
    // finally블럭은 try-catch문의 맨 마지막에 위치
}
```
- try 블럭 안에 return문에 있어야 try블럭에서 벗어날 때도 finally 블럭이 실행됨


<br>
<hr>
<br>


## 15. 사용자 정의 예외 만들기
- 우리가 직접 예외 클래스를 정의할 수 있음
- 조상은 Exception과 RuntimeException중에서 선택
    ```
    class MyException extends Exception {
        MyException(String msg){ //문자열을 매개변수로 받는 생성자
        super(msg);  // 조상인 Exception클래스의 생성자를 호출
        }
    }
    ```
  - Exception : 사용자가 발생시키는 예외 (try-catch 필수)
  - RuntimeException : 프로그래머 실수로 발생시키는 에외   
## 16. 사용자 정의 예외 만들기 예제
- 예제 8_11
## 17. 예외 되던지기 (exception re-throwing)
> 예외를 처리한 후에 다시 예외를 발생시키는 것
- 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리 하는 것
- 예제 8_12

<br>
<hr>
<br>


## 18. 연결된 예외 (chained exception)
- 한 예외가 다른 예외를 발생시킬 수 있음
- 예외 A가 예외 B를 발생시키면 A는 B의 원인 예외(cause exception)
- Throwable initCause(Throwable cause) : 지정한 예외를 원인 예외로 등록
- Throwable getCause() : 원인 예외를 반환

1. 여러 예외를 하나로 묶어서 다루기 위해
2. checked예외를 unchecked예외로 변경하려 할 때
## 19. 연결된 예외 (chained exception) 예제
- 예제 8_13

<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판