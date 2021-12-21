# **Getting Started with Java**
  
<br>
    
## What is Java?  
- Programing language
- Used to make 컴퓨터 프로그램(Application)
- 실행환경(JRE) + 개발도구(JDK) + 라이브러리(API)
- Application 개발 easily and fast possible
  
  
## Where the Java used? 
- PC / Web / Mobile Application
- Big data
- 게임, 과학, 소형기기 등
  
  
## Why Java?
- Actively used in various fields
- Rank 1 or 2 Programing language for 20
- Easy-to-learn and abundant 학습자료
- Modern Programing language (객체지향 + 함수형)
- 실무에서 제일 많이 사용해서 취업에 유리 ^_^


## History of Java
- since 1996

<br>
<hr>
<br>

## Features of Java
- Easy-to-learn **Object-Oriented Language** (= 프로그래밍 언어 + **객체지향** 개념)
- Automatic Memory Management : **Garbage Collector**(GC)가 알아서 메모리를 정리  
  - 프로그래머가 직접 메모리를 관리하면 메모리를 사용 후 반환하지 않아 메모리 부족으로 프로그램이 죽는 일이 생김
- Supports Multi-Thread
  - Multi-Thread : More than two threads working simultaneously within one process. 
- Easy 개발 is possible~ with 풍부한 library
- **OS**(operating system) **independent**
  - It can run on Linux, even if created in the window

## JVM
- Virtual Machine running Java Programs. 
    - Virtual Machine : 가상 컴퓨터 (computer made of SW)
- Write once, run anywhere

<br>
<hr>
<br>

## Install the Java Program : IntelliJ
- windows

<br>
<hr>
<br>

## Install the Java API 
- What is **Java API**?
  - A collection of prewritten packages, classes, and interfaces with their respective methods, fields and constructors.
  - Java로 프로그램을 만드는데 필요한 주요 기능을 미리 만들어서 제공 
  - API : acronym for Application Programming Interface, which is a SW intermediary that allows 2 applications to talk to each other
- What is Java API Documentation?
  - It provides detailed info about functions provided by the Java API (html file)
  - Like Java dictionary
 
<br>
<hr>
<br>

## First Java Program
- Create ```Hello.java```
    
    ```
    class Hello{
        public static void main(String[] args){
            System.out.println("Hello, World."); 
        }
    } // print text on screen
    ```
    →  **javac.exe** : Java Compiler, Translate human text into machine language ( ```*.java``` into ```*.class``` )  
    →  Create ```Hello.class```  
    →  **java.exe** : Java Interpreter, Run the Java program(class file)
- **Class** : Units of Java Program. Java Program is made up of classes.
    ```
    class class_name { ← Start
        /* all 문장 must be within {} of class */
    } ← End
    ```
    - Classes and Objects are basic concepts of OOP
    - A class is a user define blueprint of prototype from which objects are created.
    - It represents the set of properties or methods that are common to all objects of one type.
- **main method** : Entry point of Java Program. Cannot run without this method.
    ```
    class class_name {
        public static void main(String[]args){ ← Start
            /* 문장 to run (Executed in order from the first) */
        } ← End
    }
    ```
  - A method is a block of code which only runs when it is called.
  -  Methods are used to perform certain actions, and they are also known as functions.
  
<br>
<hr>
<br>

## Install the eclipse
- Description of Build related menus
  - What is Bulid?  
    Whole process of making program from source file (```*.java```).
  - Project > Build : Build all projects in the workspace
  - Project > Build Project : Build the current project (Recompile only changed source file)
  - Project > Clean : Delete all info from previous Builds (Recompile all source files)
  
<br>
<hr>
<br>

## Shortcut keys in eclipse
- ```ctrl``` + ```shift``` + ```L``` : 단축키 전체 목록보기
- ```ctrl``` + ```+``` / ```-``` : font size 증가/감소
- ```ctrl``` + ```D``` : 한 줄 삭제
- ```ctrl``` + ```alt``` + ```shift``` + ```↓``` : 행 단위 복사
- ```ctrl``` + ```space``` : 자동완성
- ```ctrl``` + ```i``` : 자동 들여쓰기
- ```ctrl``` + ```/``` : 한 줄 주석(toggle)
- ```/* */``` : 여러줄 주석
- ```alt``` + ```shift``` + ```A``` : 멀티 컬럼 편집 
- ```alt``` + ```↑``` / ```↓``` : 행 단위 이동
  
<br>
<hr>
<br>

## Github : javajungsuk_basic
- flash

<br>
<hr>
<br>

Java의 정석 기초편 | 남궁성 | 도우출판