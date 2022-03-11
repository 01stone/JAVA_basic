# **collections framework**
  
<br>

## 01. 지네릭스 (Generics)
> 컴파일시 타입을 체크해주는 기능(complie-time type check) - JDK1.5
> ```
> // Tv 객체만 저장할 수 있는 ArrayList 생성
> ArrayList<Tv> tvList = new ArrayList<Tv>();
> tvList.add(new Tv());     // ok
> tvList.add(new Audio());  // 컴파일 에러
>                           // Tv 외에 다른 타입은 저장 불가
> ```

- 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌
    
    <center>
      <img src="./image/Chap12_1_1.PNG" height=90% width=90%>
    </center>

- 지네릭스의 장점  
    1. 타입 안정성 제공
    2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해짐

- 예외의 상속계층도
  
    <center>
      <img src="./image/Chap12_1_2.PNG" height=70% width=70%>
    </center>

    - ```ClassCastException```(런타임에러) → ```CompileTime```(컴파일에러)

<br>
<hr>
<br>

## 02. 타입 변수
> 클래스를 작성할 때, Object타입 대신 타입변수(E)를 선언해서 사용

<center>
  <img src="./image/Chap12_2_1.PNG" height=80% width=80%>
  <img src="./image/Chap12_2_2.PNG" height=80% width=80%>
</center>

## 03. 타입 변수에 대입하기
> 객체를 생성시, 타입변수(E) 대신 실제 타입(Tv)을 지정(대입)

```
// 타입변수 E 대신에 실제 타입 Tv 대입
ArrayList<Tv> tvList = new ArrayList<Tv>();
```

<center>
  <img src="./image/Chap12_3_1.PNG" height=80% width=80%>
  <img src="./image/Chap12_3_2.PNG" height=80% width=80%>
</center>

- 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능

  <center>
    <img src="./image/Chap12_3_3.PNG" height=80% width=80%>
  </center>
<br>
<hr>
<br>

## 04. 지네릭스의 용어

- ```Box<T>``` : 지네릭 클래스. 'T의 Box'또는 'T Box'라고 읽음

- ```T``` : 타입 변수 또는 타입 매개변수 (T는 타입 문자)

- ```Box``` : 원시 타입 (raw type)


  <center>
    <img src="./image/Chap12_4_1.PNG" height=30% width=30%>
    <img src="./image/Chap12_4_2.PNG" height=60% width=60%>
  </center>

## 05. 지네릭 타입과 다형성
- 참조변수와 생성자의 대입된 타입은 일치해야 함

  ```
  ArrayList<Tv>      list = new ArrayList<Tv>();  
  ArrayList<Product> list = new ArrayList<Tv>();  // Error
  ```

- 지네릭 클래스간의 다형성은 성립 (여전히 대입된 타입은 일치해야 함)

  ```
  List<Tv> list = new ArrayList<Tv>();  
  List<Tv> list = new LinkedList<Tv>();
  ```

- 매개변수의 다형성도 성립
  
  ```
  ArrayList<Product>list = newArrayList<Product>();
  list.add(new Product());
  list.add(new Tv());   // 자손도 ok
  list.add(new Audio);  // 자손도 ok
  ```

  ```
  boolean add(E e) {...} → boolean add(Product e) {...}
  ```

  ```
  E get(int index) {...} → Product get(int index) {...}
  ```

  ```
  Product p = list.get(0);  // get의 반환타입 : Product
  Tv t = (Tv)list.get(1);   // 반환타입이 다르므로 형변환
  ```

## 06. 지네릭 타입과 다형성 예제
- 예제 12-1

<br>
<hr>
<br>

## 07. Iterator<E>
> 클래스를 작성할 때, Object 타입 대신 T와 같은 타입 변수 사용

```
public interface Iterator {
  boolean hasNext();
  object next();
  void remove();
}

→

public interface Iterator<E> {
  boolean hasNext();
  E next();
  void remove();
}
```

- 예제 12-2

## 08. HashMap<K,V>

<br>
<hr>
<br>

## 09. 제한된 지네릭 클래스
## 10. 제한된 지네릭 클래스 예제
## 11. 지네릭스의 제약

<br>
<hr>
<br>


## 12. 와일드 카드
## 13. 와일드 카드 예제
## 14. 지네릭 메서드

<br>
<hr>
<br>

## 15. 지네릭 타입의 형변환
## 16. 지네릭 타입의 제거

<br>
<hr>
<br>


## 17. 열거형(enum)
## 18. 열거형의 정의와 사용
## 19. 열겨형의 조상 - ```java.lang.Enum```
## 20. 열거형 예제

<br>
<hr>
<br>

## 21. 열거형에 멤버 추가하기
## 22. 열거형에 멤버 추가하기 예제


<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판