# **Array**
  
<br>

## 16. 커맨드 라인을 통해 입력받기
> 커맨드 라인에 입력한 값이 문자열 배열에 담겨서 전달된다

<span style='color:red'>오류: 기본 클래스 test을(를) 찾거나 로드할 수 없습니다.</span>  
- 환경변수 오류인 것 같은데 모르겠다...나중에 다시 시도해보ㅑㅇ지
- bin 파일이 안생겼다....머선일?

- Ex5_7
    ```
    class Ex5_7 {
        public static viod main(String[]args){
            System.out.println("매개변수의 개수"+args.length);
            for (int i=0; i<args.length; i++) {
                System.out.println("args[" + i + "] = \"" + args[i] + "\"");
            }
        }
    }
    ```

  - Ex5_7 Result
    ```
    C:\...\>java Ex5_7 abc 123 "Hello world"
    매개변수의 개수:3
    args[0] = "abc"
    args[1] = "123"
    args[2] = "Hello world"
    ```
    ```
    C:\...\>java Ex5_7
    매개변수의 개수:0
    ```
## 17. 이클립스에서 커맨드라인 매개변수 입력하기