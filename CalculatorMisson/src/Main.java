public class Main {
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
}