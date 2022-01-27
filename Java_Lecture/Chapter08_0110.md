# **Exception Handling**
  
<br>
    
## 01. 프로그램 오류
- 컴파일 에러(compile-time error) : 컴파일 할 때 발생하는 에러
  - java 컴파일러 
    - 구문체크, 번역, 최적화
    - 생략된 코드 추가
- 런타임 에러(runtime error) : 실행할 때 발생하는 에러
  - error : 프로그램 코드에 의해서 수습될 수 없는 심각한 에러
        ex) OOM(Out Of Memory)
  - exception : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 에러
  - 에러는 어쩔 수 없지만 예외는 처리하자
  - 예외처리의 정의와 목적
    - 정의 : 프로그램 실행시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
    - 목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
- 논리적 에러(logical error) : 작성 의도와 다르게 동작
  - 프로그램 종료되지 않음
  
## 02. 예외 클래스의 계층구조
- 상속계층도
    <center> 
      <img src="./image/Chap8_2_1.PNG" height=50% width=50%>
    </center>
- Excetion
  - Exception의 자손
  - RuntimeExc3e
## 03. Exception과 RuntimeException
<center> 
    <img src="./image/Chap8_3_1.PNG" height=50% width=50%>
</center>
- IO : 입축력 예외(input, output)
- ClassNotFound : ```*.class```
- 산술계산 예외
- 형변환
- 널포인터
- 배열범위 벗어남
  
<br>
<hr>
<br>


## 04. 예외 처리하기 - try-catch문
## 05. try-catch문에서의 흐름
## 06. 예외의 발생과 catch블럭

<br>
<hr>
<br>


## 07. printStackTrace()와 getMessage()
## 08. 멀티 catch블럭

<br>
<hr>
<br>


## 09. 예외 발생시키기
## 10. Checked예외, unchecked예외

<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판