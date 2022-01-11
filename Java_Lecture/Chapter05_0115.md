# **Array**
  
<br>

## 01. 배열이란?
> 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
- 배열을 사용하지 않고 변수를 저장하는 경우  
    ```int score1, score2, score3, score4, score5;```

    <center> 
      <img src="./image/Chap5_01.PNG" height=70% width=70%>
    </center>
- 배열을 사용하고 변수를 저장하는 경우  
    ```int[] score = new int[5];  // score[0], score[2]...```

    <center> 
      <img src="./image/Chap5_01_2.PNG" height=80% width=80%>
    </center>
    
    - 저장공간에 이름이 없음 (자동으로 0부터 인덱스가 붙음)
    - 배열을 다루기 위해 이름을 붙인 **참조변수**가 필요 
    - 각 **저장공간이 연속적**(붙어있음)

## 02. 배열의 선언과 생성
> 배열의 선언 - 배열을 다루기 위한 **참조변수의 선언**

- 원하는 타입의 변수를 선언하고 변수 또는 타입에 ```[]```를 붙임
    <center> 
      <img src="./image/Chap5_02.PNG" height=70% width=70%>
    </center>
  
- 배열의 생성
    ```
    타입[] 변수이름;            // 배열을 선언(배열을 다루기 위한 참조변수 선언)
    변수이름 = new 타입[길이];  // 배열을 생성(실제 저장공간을 생성)
    ```
    ```
    int[] score;         // int타입의 배열을 다루기 위한 참조변수 score 선언
    score = new int[5];  // int타입의 값 5개를 저장할 수 있는 배열 생성
    ```
    <center> 
      <img src="./image/Chap5_02_2.png" height=90% width=90%>
    </center>

## 03. 배열의 인덱스
> 배열의 인덱스 - 배열의 요소마다 붙여진 일련번호
- index의 범위 : **0 ~ '배열길이 - 1'**

    <center> 
      <img src="./image/Chap5_03.PNG" height=90% width=90%>
    </center>

- [예제](#07-배열의-출력-예제)

<br>
<hr>
<br>

## 04. 배열의 길이(```배열이름.length```)
> ```배열이름.length``` - 배열의 길이(int형 상수)
- 자바에서는 JVM이 모든 배열의 길이를 별도로 관리하며 ```배열이름.length```를 통해 배열의 길이에 대한 정보를 얻을 수 있음
 
    ```
    int[] arr = new int[5];  // 길이가 5인 int배열
    int   tmp = arr.length;  // arr.length의 값은 5이고 tmp에 5가 저장
    ```
- **배열**은 <span style='color:blue'>한 번 생성하면 그 길이를 바꿀 수 없음</span>
  - 메모리 공간이 있는데, ```int[5]```의 경우 ```int```*5 = <span style='color:green'>20byte</span>가 필요  
    배열은 연속적이기 때문에 <span style='color:green'>20byte</span> 공간을 찾아야 함  
    공간이 더 필요해서 ```int[10]```으로 증가시킨 경우 <span style='color:brown'>20byte</span>가 더 필요  
    이 경우, 기존 <span style='color:green'>20byte</span> 공간 뒤에 <span style='color:brown'>20byte</span>가 더 있을 것이란 보장이 없음  
    따라서 공간이 부족한 경우 다른 곳으로 옮겨야 함
  - 공간이 부족한 경우 크기를 늘릴 수 없기 때문에 새로운 것을 만들고 기존 배열의 내용을 복사  
  
    ```
    int[] score = new int[6];
    
    // 배열의 모든 요소 출력
    for (int i=0; i < 6; i++>)
        System.out.println(score[i])

    
    int[] score = new int[5]; // 배열의 길이를 6에서 5로 변경

    for (int i=0; i < score.length; i++>) // 조건식을 변경하지 않아도 됨
        System.out.println(score[i]) 

    ```
- [예제](#07-배열의-출력-예제)

## 05. 배열의 초기화
> 배열의 각 요소에 처음으로 값을 저장하는 것
- 생성과 동시에 **자동**적으로 **기본값(0)**으로 초기화 
- 원하는 값을 저장하려면 각 요소마다 값을 지정해줘야 함
    ```
    int[] score = new int[5];  // 길이가 5인 int형 배열을 생성
    score[0] = 50;             // 각 요소에 직접 값을 저장
    score[1] = 60;
    score[2] = 70;
    score[3] = 80;
    score[4] = 90;
    ```
    ```
    int[] score = new int[5];
    for (int i = 0; i < score.length; i++>)  // for문을 이용해 저장
        score[i] = i + 10 + 50
    ```
- 배열을 간단히 초기화 하는 방법

  - 
    ```
    int[] score = new int[]{ 50, 60, 70, 80, 90}
    ```
  - 
    ```
    int[] score = { 50, 60, 70, 80, 90}  // new int[] 생략
    ```
    ```
    int[] score;
    score = { 50, 60, 70, 80, 90}  // error, new int[] 생략 불가
    score = new int[]{ 50, 60, 70, 80, 90}
    ```

<br>
<hr>
<br>

## 06. 배열의 출력
- 배열에 저장된 값을 확인할 때도 초기화와 마찬가지로 for문 이용
  
    ```
    int[] iArr = {100, 95, 80, 70, 60};

    System.out.println(iArr);  // [I@14318bb와 같은 형식의 문자열 출력
                               // [ : 배열
                               // I : int
                               // @ : 위치
                               // char의 경우 예외
    
    char[] chArr = {'a','b','c','d'}
    System.out.println(chArr)  //abcd, println


    for (int i = 0; i < iArr.length; i++) {
        System.out.println(iArr[i]);
    }
    ```
- ```Arrays.toString(배열이름)``` 메서드 사용(배열의 모든 요소 출력)
    ```
    int[] iArr = {100, 95, 80, 70, 60};
    System.out.println(Arrays.toString(iArr));  // [100, 95, 80, 70, 60]
    ```

## 07. 배열의 출력 예제

- Ex5_1
    ```
    import java.util.Arrays;
    class Ex5_1 {
        public static viod main(String[]args){
            int[] iArr1 = new int[10];
            int[] iArr2 = new int[10];
    //		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
            int[] iArr3 = {100, 95, 80, 70, 60};
            char[] chArr = {'a', 'b', 'c', 'd'};

            for (int i=0; i < iArr1.length ; i++ ) {
                iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
            }

            for (int i=0; i < iArr2.length ; i++ ) {
                iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
            }

            // 배열에 저장된 값들을 출력한다.
            for(int i=0; i < iArr1.length;i++) {
                System.out.print(iArr1[i]+",");	
            }
            System.out.println();

            System.out.println(Arrays.toString(iArr2));
            System.out.println(Arrays.toString(iArr3));
            System.out.println(Arrays.toString(chArr));
            System.out.println(iArr3);
            System.out.println(chArr);
        }
    }
    ```

  - Ex5_1 Result
    ```
    1,2,3,4,5,6,7,8,9,10
    [3, 4, 8, 10, 1, 10, 6, 2, 7, 1]
    [100, 95, 80, 70, 60]
    [a, b, c, d]
    [I@14318bb
    abcd
    ```
<br>
<hr>
<br>

## 08. 배열의 활용(1) - 총합과 평균
- Ex5_2
    ```
    class Ex5_2 {
        public static viod main(String[]args){
            int   sum = 0;      // 총점을 저장하기 위한 변수
            float average = 0f; // 평균을 저장하기 위한 변수

            int[] score = {100, 88, 100, 100, 90};

            for (int i=0; i < score.length ; i++ ) {
                sum += score[i];
            }
            average = sum / (float)score.length ; // 계산결과를 float로 얻기 위해서 형변환

            System.out.println("총점 : " + sum);
            System.out.println("평균 : " + average);
        }
    }
    ```

  - Ex5_2 Result
    ```
    총합 : 478
    평균 : 95.6
    ```
## 09. 배열의 활용(2) - 최대값과 최소값
- Ex5_3
    ```
    class Ex5_3 {
        public static viod main(String[]args){
            int[] score = { 79, 88, 91, 33, 100, 55, 95 }; 

            int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다. 
            int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다. 

            for(int i=1; i < score.length;i++) {
                if(score[i] > max) { 
                    max = score[i]; 
                } else if(score[i] < min) { 
                    min = score[i]; 
                } 
            } // end of for 

            System.out.println("최대값 :" + max);       
            System.out.println("최소값 :" + min);      
        }
    }
    ```

  - Ex5_3 Result
    ```
    최대값 :100
    최소값 :33
    ```
<br>
<hr>
<br>


## 10. 배열의 활용(3) - 섞기(shuffle)
- Ex5_4
    ```
    import java.util.Arrays;

    class Ex5_4 {
        public static viod main(String[]args){
            int[] numArr = {0,1,2,3,4,4,5,6,7,8,9};
            System.out.println(Arrays.toString(numArr));

            for (int i=0; i < 100; i++ ) {
                int n = (int)(Math.random() * 10);  // 0~9 중의 한 값을 임의로 얻는다.
                int tmp = numArr[0];
                numArr[0] = numArr[n];
                numArr[n] = tmp;
            }
            System.out.println(Arrays.toString(numArr));

        }
    }
    ```

  - Ex5_4 Result
    ```
    [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    [5, 8, 2, 7, 1, 6, 4, 9, 3, 0]
    ```

## 11. 배열의 활용(4) - 로또번호 만들기
- Ex5_5
    ```
    class Ex5_5 {
        public static viod main(String[]args){

            int[] ball = new int[45];  // 45개의 정수값을 저장하기 위한 배열 생성.      

            // 배열의 각 요소에 1~45의 값을 저장한다. 
            for(int i=0; i < ball.length; i++)       
                ball[i] = i+1;    // ball[0]에 1이 저장된다.

            int tmp = 0;   // 두 값을 바꾸는데 사용할 임시변수 
            int j = 0;     // 임의의 값을 얻어서 저장할 변수 

            // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다. 
            // 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
            for(int i=0; i < 6; i++) {       
                j = (int)(Math.random() * 45); // 0~44범위의 임의의 값을 얻는다. 
                tmp     = ball[i]; 
                ball[i] = ball[j]; 
                ball[j] = tmp; 
            } 

            // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
            for(int i=0; i < 6; i++) 
                System.out.printf("ball[%d]=%d%n", i, ball[i]); 
        }
    }
    ```

  - Ex5_5 Result
    ```
    ball[0]=40
    ball[1]=12
    ball[2]=19
    ball[3]=39
    ball[4]=29
    ball[5]=3
    ```

<br>
<hr>
<br>

## 12. String배열의 선언과 생성
## 13. String배열의 초기화

<br>
<hr>
<br>

## 14. String클래스
## 15. String클래스의 주요 메서드







<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판