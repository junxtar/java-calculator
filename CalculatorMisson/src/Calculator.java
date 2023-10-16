public class Calculator {
   private double number = 0;
   private boolean isPower = false;
   private AbstractOperation operation;

   public Calculator(AbstractOperation operation) {
      this.operation = operation;
   }

   public double getNumber() {
      return number;
   }

   public boolean isPower() {
      return isPower;
   }

   public void setOperation(AbstractOperation operation) {
      this.operation = operation;
   }
   public void turnOn() {
      this.number = 0;
      this.isPower = true;
      System.out.println("계산기 전원을 킵니다.");
   }

   public void turnOff() {
      this.number = 0;
      this.isPower = false;
      System.out.println("계산기의 전원을 끕니다.");
   }
   public void init() {
      if (this.isPower) {
         this.number = 0;
         System.out.println("계산기가 초기화 됩니다.");
         return;
      }
      System.out.println("계산기의 전원이 꺼져있습니다.");
   }

   public void calculator(double firstNumber, double secondNumber) {
      if (this.isPower) {
         this.number = operation.operate(firstNumber, secondNumber);
         System.out.println("현재 값은 "+ this.number+ " 입니다.");
         return;
      }
      System.out.println("계산기의 전원이 꺼져있습니다.");
   }
}
