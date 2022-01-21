# **Object-oriented Programming 2**
  
<br>
    
## 01. 상속
> interitance    
> 기존의 클래스로 새로운 클래스를 작성하는 것(코드의 재사용)  
> 두 클래스를 부모와 자식으로 관계를 맺어주는 것
    
- 자손은 조상의 모든 멤버를 상속받음(생성자, 초기화블럭 제외)
- 자손의 멤버 개수는 조상보다 적을 수 없음(같거나 많음)
  
- 자손의 변경은 조상에 영향을 미치지 않음

## 02. 상속 예제
- 예제 7-1






## 03. 포함 관계
> composite : 클래스 멤버로 참조변수를 선언하는 것
- 클래스의 관계는 상속과 포함이 있음
- 작은 단위의 클래스를 만들고, 이 들을 조합해서 클래스를 만듦 (복잡도가 줄어듦)

## 04. 클래스 간의 관계 결정하기
> 상속관계 : ~는 ~이다(is - a)  
> 포함관계 : ~은 ~을 가지고 있다(has - a) 90%




## 05. 단일 상속(Single Inheritance)
> Java는 단일상속만 허용한다 (C++은 다중상속 허용)

- 비중이 높은 클래스 하나만 상속관계, 나머지는 포함관계

## 06. Object 클래스 - 모든 클래스의 조상
> 부모가 없는 클래스는 자동적으로 Object클래스를 상속받음  
- 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받음




## 07. 오버라이딩(overriding)
> 상속받은 조상의 메서드를 자신에 맞게 변경하는 것

## 08. 오버라이딩의 조건 (외워라)
1. 선언부가 조상 클래스의 메서드와 일치

2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경 불가

3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없음

## 09. 오버로딩 vs. 오버라이딩
> overloading : 기존에 없는 새로운 메서드를 정의하는 것 (new)  
> overriding : 상속받은 메서드의 내용을 변경하는 것 (change, modify)




## 10. 참조변수 ```super```
> 객체 자신을 가리키는 참조변수, 인스턴스 메서드(생성자) 내에만 존재  
> 조상의 멤버를 자신의 멤버와 구별할 때 사용

- 예제 7-2, 3

## 11. ```super()``` - 조상의 생성자
> 조상의 생성자를 호출할 때 사용  
> 조상의 멤버는 조상의 생성자를 호출해서 초기화
- **생성자의 첫 줄에는 반드시 생성자를 호출**
  - 그렇지 않으면 컴파일러가 생성자의 첫 줄에 ```super();``` 삽입
- 예제 7-4





## 12. 패키지(package)
> 서로 관련된 클래스의 묶음
- 클래스는 클래스 파일(```*.class```), 패키지는 폴더. 하위 패키지는 하위 폴더
- 클래스의 실제 이름(full name)은 패키지를 포함 (java.lang.String)
- rt.jar는 클래스들을 압축한 파일 (JDK설치경로\jre\lib에 위치)

## 13. 패키지의 선언
- 패키지는 소스파일의 첫 번째 문장으로 단 한 번 선언  
- 같은 소스 파일의 클래스들은 모두 같은 패키지에 속함
- 패키지 선언이 없으면 이름없는(unnamed) 패키지에 속함
- 예제 7-5

## 14. 클래스 패스(classpath)
- 클래스 파일(```*.class```)의 위치를 알려주는 경로
- 환경변수 classpath로 관리, 경로간의 구분자는 ```;```
- classpath(환경변수)에 패키지의 루트를 등록해줘야 함