# 계산기 프로그램

## 파일 구조
- Calculator.java
- AbstractOperation.java (추상 클래스)
  - AddOperation.java (+)
  - SubstractOperation.java (-)
  - MultiplyOperation.java (x)
  - DivideOperation.java (/)
- Main.java

## 🚀 기능 요구 사항
1. 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.
    - Calulator 클래스는 연산을 수행하는 반환타입이 double 인 calculate 메서드를 가지고 있습니다.
    - int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
    - calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
2. 나머지 연산자(%)를 수행할 수 있게 Calculator 클래스 내부코드를 변경합니다.
3. AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
     - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경합니다.
4. AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을 AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.



    
   
  
