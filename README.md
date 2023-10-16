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
    - double 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
2. AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺습니다.
     - 관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경합니다.
     - 단일 책임의 원칙을 고려한 설계를 고려합니다.
3. AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스들을 AbstractOperation(추상 클래스)를 사용하여 추상화하고 Calculator 클래스의 내부 코드를 변경합니다.


### 구현 기능 목록
- [] operate 추상메서드를 가지고 있는 AbstractOperation(추상 클래스) 구현하기
- [] AbstractOperation를 상속 받는 AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 클래스 구현하기
- [] Calculator 필드로 숫자와 전원 여부를 구현하기
- [] Calculator 메서드: 전원 키기, 전원 끄기, 초기화, 게산하기
- [] Calculator생성자로서는 AbstractOpearation을 매개변수로만 가지기
- [] 객체지향의 다형성을 활용해 set을 활용해서 연산자를 설정하기
- [] 전원 여부에 따라서 계산 및 초기화 고려하기  ex) 전원이 꺼져있을 경우 초기화 및 게산은 이루어지지 않는다.
- [] DivideOperation(나누기) 클래스에서 0으로 나눌 경우를 고려 -> 실제 계산기도 무한(Infinity)으로 값이 설정 되므로 그대로 가져간다.
    - 0으로 나눌 경우 계산기는 제 동작을 하지 못하므로 초기화 기능을 활용해서 다시 시작해야한다. 
 
<br>

### 👉 결과 
```java
public static void main(String[] args) {
      Calculator calculator = new Calculator(new AddOperation());
      calculator.turnOn();
      calculator.calculator(calculator.getNumber(), 10);
      calculator.init();
      calculator.calculator(calculator.getNumber(), 30);

      calculator.setOperation(new SubtractOperation());
      calculator.calculator(calculator.getNumber(), 10);
      calculator.calculator(calculator.getNumber(), 10);

      calculator.setOperation(new MultiplyOperation());
      calculator.calculator(calculator.getNumber(), 10);

      calculator.setOperation(new DivideOperation());
      calculator.calculator(calculator.getNumber(), 10);
      calculator.calculator(calculator.getNumber(), 0);
      calculator.calculator(calculator.getNumber(), 10);
      calculator.init();
      calculator.setOperation(new AddOperation());
      calculator.calculator(calculator.getNumber(), 10);

      calculator.turnOff();
   }
```

```java
계산기 전원을 킵니다.
현재 값은 10.0 입니다.
계산기가 초기화 됩니다.
현재 값은 30.0 입니다.
현재 값은 20.0 입니다.
현재 값은 10.0 입니다.
현재 값은 100.0 입니다.
현재 값은 10.0 입니다.
현재 값은 Infinity 입니다.
현재 값은 Infinity 입니다.
계산기가 초기화 됩니다.
현재 값은 10.0 입니다.
계산기의 전원을 끕니다.

Process finished with exit code 0

```




    
   
  
