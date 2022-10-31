package org.nocoder.lambda;

/**
 * Java Lambda Expressions
 * https://www.javatpoint.com/java-lambda-expressions
 * @author yangjl
 * @date 2022-10-31 10:13
 **/
public class InterfaceExample {

    /**
     * 没有参数
     */
    interface Drawable{
        /**
         * draw
         */
        void draw();
    }

    /**
     * 没有参数
     */
    interface Sayable1 {
        String say();
    }

    /**
     * 1个参数
     */
    interface Sayable2{
        String say(String name);
    }

    /**
     * 多个参数
     */
    interface Sayable3{
        String say(String message);
    }


    /**
     * 多个参数
     */
    interface Addable{
        int add(int a, int b);
    }



    public static void main(String[] args) {

        withoutLambda();

        withLambda();

        withNoparameter();

        withSingleParameter();

        withMultipleParameters();

        multipleStatementsInLambda();
    }

    private static void multipleStatementsInLambda(){
        Sayable3 person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }

    private static void withMultipleParameters(){
        // multiple parameters in lambda expression
        Addable addable = (a, b) -> (a + b);
        System.out.println(addable.add(10,20));

        // multiple parameters with data type in lambda expression
        Addable addable1 = (int a, int b) -> (a + b);
        System.out.println(addable1.add(100, 200));

        // replaced with method reference
        Addable addable2 = Integer::sum;
        System.out.println(addable2.add(1000, 2000));
    }

    private static void withSingleParameter() {
        // lambda 表达式：1个参数的情况
        Sayable2 s2 = (name) ->{
            return "Hello, " + name;
        };
        System.out.println(s2.say("Jason"));

        // 可以省略圆括号
        Sayable2 s3 = name -> {return "Hello, " + name;};
        System.out.println(s3.say("Funny"));
    }

    private static void withNoparameter() {
        // Java Lambda Expression Example: No Parameter
        Sayable1 s = ()->{return "I have nothing to say!";};
        System.out.println(s.say());
    }

    private static void withLambda() {
        int width = 10;
        // with lambda
        Drawable drawable2 = () ->{
            System.out.println("with lambda: Drawing " + width);
        };
        drawable2.draw();
    }

    private static void withoutLambda() {
        int width = 10;
        // without lambda
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("without lambda : Drawing " + width);
            }
        };
        drawable.draw();
    }

}
