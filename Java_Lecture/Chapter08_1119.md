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

<br>
<hr>
<br>


## 15. 사용자 정의 예외 만들기
## 16. 사용자 정의 예외 만들기 예제
## 17. 예외 되던지기 (exception re-throwing)

<br>
<hr>
<br>


## 18. 연결된 예외 (chained exception)
## 19. 연결된 예외 (chained exception) 예제

<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판