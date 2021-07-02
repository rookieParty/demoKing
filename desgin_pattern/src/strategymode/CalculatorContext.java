package strategymode;

/**
 * @Description 策略模式
 * @Author chuang.li
 * @Date 2021/7/2 11:14
 */
public class CalculatorContext {

    private Operation operation;

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int doOperation(int num1,int num2){
        return this.operation.doOperation(num1,num2);
    }

    public static void main(String[] args) {
        CalculatorContext calculatorContext = new CalculatorContext();
        calculatorContext.setOperation(new OperationAdd());
        System.out.println(calculatorContext.doOperation(1, 2));

        calculatorContext.setOperation(new OperationSub());
        calculatorContext.setOperation(new OperationSub());
        System.out.println(calculatorContext.doOperation(1, 2));
    }
}
