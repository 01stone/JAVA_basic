# **date, time and formmating**
  
<br>

## 01. 날짜와 시간

- ```java.util.Date``` 
  - 날짜와 시간을 다룰 목적으로 만들어진 클래스 (JDK1.0)
  - Date의 메서드는 거의 deprecated(앞으로 사용 x) 되었지만, 여전히 쓰이고 있음
- ```java.util.Calendar```
  - Date클래스를 개선한 새로운 클래스 (JDK1.1), 여전히 단점이 존재
- ```java.time```패키지 (자바의 정석 3판, 기초판에서는 x)
  - Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공 (JDK1.8)
  - Date와 Calendar의 단점 : 날짜 + 시간
  - 날짜(LocalDate)와 시간(LocalTime)을 나눠서 다룰 수 있음   
    (날짜 + 시간 : LocalDateTime)

## 02. Calendar클래스
> 추상화 클래스이므로 ```getInstance()```를 통해 구현된 객체를 얻어야 함
> ```
> Calendar cal = new Calendar();  // error
>                                 // 추상화 클래스는 인스턴스를 생성 x
> Calendar cal = Calendar.getInstance();
> // getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환
> ```

- 특정 캘린더로 정하면 다른 캘린더를 사용할 때 수정해야 함
  
    ```
    class MyApplication {
        public static void main(String args[]) {
            Calendar = cal = new GregorianCalendar(); // 경우에 따라 변경
        }
    }
    ```
## 03. Calendar 예제 1
- ```get()```으로 날짜와 시간 필드 가져오기 : ```int get(int field)```
  
    ```
    Calendar cal = Calendar.getInstance();  // 현재 날짜와 시간으로 셋팅
    int thisYear = cal.get(Calendar.YEAR);  // 올해가 몇년인지
    int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);  // 이 달의 마지막 날 
    ```
- Calendar에 정의된 필드
  
    <center>
      <img src="./image/Chap10_2_1.PNG" height=50% width=50%>
      <img src="./image/Chap10_2_2.PNG" height=45% width=45%>
    </center>

    - (typo) WEEK_OF_YEAR : 그 해의 몇 번째 주

- 예제 10-1

<br>
<hr>
<br>


## 04. Calendar 예제 2

- 예제 10-2

## 05. Calendar 예제 3

- 예제 10-3
  

<br>
<hr>
<br>


## 06. Calendar 예제 4

- 예제 10-4

## 07. Calendar 예제 5

- 예제 10-5

## 08. Date와 Calendar간의 변환

<br>
<hr>
<br>


## 09. 형식화 클래스
## 10. DecimalFormat
## 11. DecimalFormat 예제 1
## 12. DecimalFormat 예제 2

<br>
<hr>
<br>


## 13. SimpleDateFormat
## 14. SimpleDateFormat 예제 1
## 15. SimpleDateFormat 예제 2
## 16. SimpleDateFormat 예제 3





<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판