package org.example;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("A", 2);
        context.put("B", 4);
        context.put("C", 8);
        context.put("D", 16);

        AbstractExpression abstractExpression =
                new SumNonTerminalExpression(new MultiplyNonTerminalExpression(new NumberTerminalExpression("A"),
                        new NumberTerminalExpression("B")),
                        new MultiplyNonTerminalExpression(new NumberTerminalExpression("C"),
                                new NumberTerminalExpression("D")));

        System.out.println(abstractExpression.interpret(context));
    }
}